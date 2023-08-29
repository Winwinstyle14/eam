package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import vhc.smartw.eam.definition.WoStatus;
import vhc.smartw.eam.dto.*;
import vhc.smartw.eam.entity.*;
import vhc.smartw.eam.repository.*;
import vhc.smartw.eam.utils.StringTool;

import java.util.*;

@Service
@Slf4j

public class WipEntitiesService {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    WipEntitiesRepository wipEntitiesRepository;
    @Autowired
    WipDiscreteJobsRepository wipDiscreteJobsRepository;
    @Autowired
    EamAssetFailuresRepository eamAssetFailuresRepository;
    @Autowired
    EamAssetFailureCodesRepository eamAssetFailureCodesRepository;
    @Autowired
    WipOperationsRepository wipOperationsRepository;
    @Autowired
    WipRequirementOperationsRepository wipRequirementOperationsRepository;
    @Autowired
    WipOperationResourcesRepository wipOperationResourcesRepository;
    @Autowired
    WipOpResourceInstancesRepository wipOpResourceInstancesRepository;
    @Autowired
    EamWorkOrderDetailsRepository workOrderDetailsRepository;
    @Autowired
    EamAPIService eamService;

    public Optional<WipEntitiesDto> getById(long id){
        var wipEntitiesOptional = wipEntitiesRepository.findById(id);

        return wipEntitiesOptional.map(
                wipEntities -> modelMapper.map(wipEntities, WipEntitiesDto.class)
        );
    }

    @Transactional
    public MessageResponse save(WipEntitiesDto wipEntitiesDto){
        try {
            /* Sinh tự động nếu chưa có Wo Name*/
            if(!StringUtils.hasText(wipEntitiesDto.getWipEntityName())){
                wipEntitiesDto.setWipEntityName(StringTool.generateWoName());
            }

            var wipEntitiesNew = modelMapper.map(wipEntitiesDto, WipEntities.class);

            /* Save Wip Entities */
            final var wipEntitiesOptional = wipEntitiesRepository.findByWipEntityName(wipEntitiesDto.getWipEntityName());
            final var statusEntitiesUpdate = wipEntitiesDto.getStatusType(); //Trạng thái mới
            var statusEntitiesCurrent = -1 ; //Trạng thái hiện tại
            if(wipEntitiesOptional.isEmpty()){
                wipEntitiesNew.setId(null);
            }else{
                var wipEntities = wipEntitiesOptional.get();
                wipEntitiesNew.setId(wipEntities.getId());
                statusEntitiesCurrent =  wipEntities.getStatusType();
            }

            var wipEntities = wipEntitiesRepository.save(wipEntitiesNew);

            /* Save EAM_WORK_ORDER_DETAILS*/
            if(wipEntitiesDto.getEamWorkOrderDetails() != null){
                var workOrderDetailsNew = modelMapper.map(wipEntitiesDto.getEamWorkOrderDetails(), EamWorkOrderDetails.class);
                var workOrderDetailsOptional = workOrderDetailsRepository
                        .findByWipEntityIdAndOrganizationId(wipEntities.getId(), workOrderDetailsNew.getOrganizationId());
                if(workOrderDetailsOptional.isPresent()){
                    var workOrderDetails = workOrderDetailsOptional.get();
                    workOrderDetailsNew.setId(workOrderDetails.getId());
                    workOrderDetailsNew.setWipEntityId(wipEntities.getId());
                }else{
                    workOrderDetailsNew.setId(null);
                    workOrderDetailsNew.setWipEntityId(wipEntities.getId());
                }

                wipEntitiesNew.setStatusType(workOrderDetailsNew.getUserDefinedStatusId());

                workOrderDetailsRepository.save(workOrderDetailsNew);
                wipEntitiesRepository.save(wipEntitiesNew);//Update trang thai WO
            }

            /* Save Wip Discrete Jobs*/
            if(wipEntitiesDto.getWipDiscreteJobs() != null){
                var wipDiscreteJobsNew = modelMapper.map(wipEntitiesDto.getWipDiscreteJobs(), WipDiscreteJobs.class);
                var wipDiscreteJobsOptional = wipDiscreteJobsRepository
                        .findByWipEntityIdAndOrganizationId(wipEntities.getId(), wipDiscreteJobsNew.getOrganizationId());
                if(wipDiscreteJobsOptional.isPresent()){
                    var wipDiscreteJobs = wipDiscreteJobsOptional.get();
                    wipDiscreteJobsNew.setId(wipDiscreteJobs.getId());
                    wipDiscreteJobsNew.setWipEntityId(wipEntities.getId());
                }else{
                    wipDiscreteJobsNew.setId(null);
                    wipDiscreteJobsNew.setWipEntityId(wipEntities.getId());
                }

                wipDiscreteJobsRepository.save(wipDiscreteJobsNew);
            }

            /* Save Eam Asset Failures */
            if(wipEntitiesDto.getEamAssetFailures() != null){
                var eamAssetFailuresNew = modelMapper.map(wipEntitiesDto.getEamAssetFailures(), EamAssetFailures.class);
                var eamAssetFailuresOptional =
                        eamAssetFailuresRepository.findBySourceIdAndFailureId(wipEntities.getId(), eamAssetFailuresNew.getFailureId());
                if(eamAssetFailuresOptional.isEmpty()){
                    eamAssetFailuresNew.setId(null);
                    eamAssetFailuresNew.setSourceId(wipEntities.getId());
                }else{
                    var eamAssetFailures = eamAssetFailuresOptional.get();
                    eamAssetFailuresNew.setId(eamAssetFailures.getId());
                    eamAssetFailuresNew.setSourceId(wipEntities.getId());
                }
                var eamAssetFailures = eamAssetFailuresRepository.save(eamAssetFailuresNew);

                /* Save Eam Asset Failure Codes */
                if(wipEntitiesDto.getEamAssetFailures().getEamAssetFailureCodes() != null){
                    var eamAssetFailureCodesNew = modelMapper.map(wipEntitiesDto.getEamAssetFailures().getEamAssetFailureCodes(), EamAssetFailureCodes.class);
                    var eamAssetFailureCodesOptional =
                            eamAssetFailureCodesRepository.findByCheckUnique(
                                    eamAssetFailures.getFailureId(),
                                    eamAssetFailureCodesNew.getFailureEntryId(),
                                    eamAssetFailureCodesNew.getFailureCode(),
                                    eamAssetFailureCodesNew.getCauseCode(),
                                    eamAssetFailureCodesNew.getResolutionCode()
                            );
                    if(eamAssetFailureCodesOptional.isEmpty()){
                        eamAssetFailureCodesNew.setId(null);
                        eamAssetFailureCodesNew.setFailureId(eamAssetFailures.getFailureId());
                    }else{
                        var eamAssetFailureCodes = eamAssetFailureCodesOptional.get();
                        eamAssetFailureCodesNew.setId(eamAssetFailureCodes.getId());
                    }

                    eamAssetFailureCodesRepository.save(eamAssetFailureCodesNew);
                }
            }

            /* Save List WIP_OPERATIONS */
            if(wipEntitiesDto.getWipOperations() != null) {
                var wipOperationsDtoList = wipEntitiesDto.getWipOperations();

                for (var wipOperationsDto : wipOperationsDtoList) {
                    /* Save WIP_OPERATIONS */
                    var wipOperationsNew = modelMapper.map(wipOperationsDto, WipOperations.class);
                    var wipOperationsOptional = wipOperationsRepository
                            .findByCheckUnique(wipEntities.getId(), wipOperationsNew.getOperationSeqNum(),
                                    wipOperationsNew.getOrganizationId(), wipOperationsNew.getRepetitiveScheduleId());
                    if (wipOperationsOptional.isEmpty()) {
                        wipOperationsNew.setId(null);
                        wipOperationsNew.setWipEntityId(wipEntities.getId());
                    } else {
                        var wipOperations = wipOperationsOptional.get();
                        wipOperationsNew.setId(wipOperations.getId());
                        wipOperationsNew.setWipEntityId(wipEntities.getId());
                    }

                    wipOperationsRepository.save(wipOperationsNew);

                    /* Save WIP_REQUIREMENT_OPERATIONS */
                    if (wipOperationsDto.getWipRequirementOperations() != null) {
                        var wipRequirementOperationsDtoList = wipOperationsDto.getWipRequirementOperations();
                        Collection<WipRequirementOperations> wipRequirementOperationsCollection = new ArrayList<>();
                        for (var wipRequirementOperationsDto : wipRequirementOperationsDtoList) {
                            var wipRequirementOperationsNew = modelMapper.map(wipRequirementOperationsDto, WipRequirementOperations.class);
                            var wipRequirementOperationsOptional =
                                    wipRequirementOperationsRepository.findByCheckUnique(
                                            wipEntities.getId(),
                                            wipRequirementOperationsNew.getOperationSeqNum(),
                                            wipRequirementOperationsNew.getOrganizationId(),
                                            wipRequirementOperationsNew.getRepetitiveScheduleId(),
                                            wipRequirementOperationsNew.getInventoryItemId()
                                    );

                            if (wipRequirementOperationsOptional.isEmpty()) {
                                wipRequirementOperationsNew.setId(null);
                                wipRequirementOperationsNew.setWipEntityId(wipEntities.getId());
                            } else {
                                var wipRequirementOperations = wipRequirementOperationsOptional.get();
                                wipRequirementOperationsNew.setId(wipRequirementOperations.getId());
                                wipRequirementOperationsNew.setWipEntityId(wipEntities.getId());
                            }

                            wipRequirementOperationsCollection.add(wipRequirementOperationsNew);
                        }
                        wipRequirementOperationsRepository.saveAll(wipRequirementOperationsCollection);
                    }

                    /* Save WIP_OPERATION_RESOURCES */
                    if (wipOperationsDto.getWipOperationResources() != null) {
                        var wipOperationResourcesDtoList = wipOperationsDto.getWipOperationResources();
                        for (var wipOperationResourcesDto : wipOperationResourcesDtoList) {
                            var wipOperationResourcesNew = modelMapper.map(wipOperationResourcesDto, WipOperationResources.class);

                            var wipOperationResourcesOptional =
                                    wipOperationResourcesRepository.findByCheckUnique(
                                            wipOperationResourcesNew.getResourceSeqNum(),
                                            wipEntities.getId(),
                                            wipOperationResourcesNew.getRepetitiveScheduleId(),
                                            wipOperationResourcesNew.getOperationSeqNum(),
                                            wipOperationResourcesNew.getOrganizationId()
                                    );
                            if (wipOperationResourcesOptional.isEmpty()) {
                                wipOperationResourcesNew.setId(null);
                                wipOperationResourcesNew.setWipEntityId(wipEntities.getId());
                            } else {
                                var wipRequirementOperations = wipOperationResourcesOptional.get();
                                wipOperationResourcesNew.setId(wipRequirementOperations.getId());
                                wipOperationResourcesNew.setWipEntityId(wipEntities.getId());
                            }

                            wipOperationResourcesRepository.save(wipOperationResourcesNew);

                            /* Save WIP_OP_RESOURCE_INSTANCES */
                            if(wipOperationResourcesDto.getWipOpResourceInstancesDto() != null){
                                var wipOpResourceInstancesNew =
                                        modelMapper.map(wipOperationResourcesDto.getWipOpResourceInstancesDto(), WipOpResourceInstances.class);

                                var wipOpResourceInstancesOptional = wipOpResourceInstancesRepository.findByCheckUnique(
                                        wipOpResourceInstancesNew.getOperationSeqNum(),
                                        wipEntities.getId(),
                                        wipOpResourceInstancesNew.getResourceSeqNum(),
                                        wipOpResourceInstancesNew.getInstanceId(),
                                        wipOpResourceInstancesNew.getSerialNumber()
                                );

                                if (wipOpResourceInstancesOptional.isEmpty()) {
                                    wipOpResourceInstancesNew.setId(null);
                                    wipOpResourceInstancesNew.setWipEntityId(wipEntities.getId());
                                } else {
                                    var wipOpResourceInstances = wipOpResourceInstancesOptional.get();
                                    wipOpResourceInstancesNew.setId(wipOpResourceInstances.getId());
                                    wipOpResourceInstancesNew.setWipEntityId(wipEntities.getId());
                                }

                                wipOpResourceInstancesRepository.save(wipOpResourceInstancesNew);
                            }
                        }
                    }
                }
            }

            /* CALL API EAM nếu nhận được request từ SMARTW*/
            if(StringUtils.hasText(wipEntitiesDto.getSystemType())){
                final var woRequestDtoOptional= generateWORequestDto(wipEntitiesDto);
                if(woRequestDtoOptional.isPresent()){
                    final var woRequestDto = woRequestDtoOptional.get();
                    if(wipEntitiesOptional.isEmpty()){/* Create WO*/
                        final var createWO= eamService.createWO(woRequestDto);

                        /* Trả về lỗi nếu call api thất bại*/
                        if(createWO.getErrorCode().equals("1")){
                            return createWO;
                        }
                    }else{
                        /* Update Info*/
                        final var updateWOInfo= eamService.updateWOInfo(woRequestDto);

                        /* Trả về lỗi nếu call api thất bại*/
                        if(updateWOInfo.getErrorCode().equals("1")){
                            return updateWOInfo;
                        }

                        if (statusEntitiesCurrent > 0 && statusEntitiesCurrent != statusEntitiesUpdate){
                            final var wipDiscreteJobs = wipEntitiesDto.getWipDiscreteJobs();
                            var woRequestStatusDto = WoRequestStatusDto.builder()
                                    .wipEntityName(wipEntitiesDto.getWipEntityName())
                                    .statusChangeDate(new Date())
                                    .actualStartDate(wipDiscreteJobs.getActualStartDate())
                                    .dateCompleted(wipDiscreteJobs.getDateCompleted())
                                    .counterReading(wipEntitiesDto.getCounterReading())
                                    .statusType(wipEntitiesDto.getStatusType())
                                    .build();

                            final var updateWOStatus = eamService.updateWOStatus(woRequestStatusDto);

                            /* Trả về lỗi nếu call api thất bại*/
                            if(updateWOStatus.getErrorCode().equals("1")){
                                return updateWOStatus;
                            }
                        }
                    }
                }
            }

            return MessageResponse.builder()
                    .errorMessage("Thực hiện thành công.")
                    .errorCode("0")
                    .build();
        }catch (Exception e){
            log.error("Can't create WO: ", e);

            return MessageResponse.builder()
                    .errorMessage(e.getMessage())
                    .errorCode("1")
                    .build();
        }
    }

    /**
     * Generate WO
     * @return {@link WORequestDto}
     */
    private Optional<WORequestDto> generateWORequestDto(WipEntitiesDto wipEntitiesDto){
        try {
            var woRequestDto = new WORequestDto();

            /*Lấy thông tin WIP_ENTITIES*/
            woRequestDto.setWipEntityName(wipEntitiesDto.getWipEntityName());
            woRequestDto.setOrganizationId(wipEntitiesDto.getOrganizationId());
            woRequestDto.setDescription(wipEntitiesDto.getDescription());

            /*Lấy thông tin WIP_DISCRETE_JOBS*/
            if(wipEntitiesDto.getWipDiscreteJobs() != null){
                var wipDiscreteJobsDto= wipEntitiesDto.getWipDiscreteJobs();

                woRequestDto.setInstanceNumber(wipDiscreteJobsDto.getInstanceNumber());
                woRequestDto.setPrimaryItemId(wipDiscreteJobsDto.getPrimaryItemId());
                woRequestDto.setScheduledStartDate(wipDiscreteJobsDto.getScheduledStartDate());
                woRequestDto.setScheduledCompletionDate(wipDiscreteJobsDto.getScheduledCompletionDate());
                woRequestDto.setActualStartDate(wipDiscreteJobsDto.getActualStartDate());
                woRequestDto.setDateCompleted(wipDiscreteJobsDto.getDateCompleted());
                woRequestDto.setOwningDepartment(wipDiscreteJobsDto.getOwningDepartment());
            }

            /*Lấy thông tin EAM_ASSET_FAILURES*/
            if(wipEntitiesDto.getEamAssetFailures() != null){
                var eamAssetFailures= wipEntitiesDto.getEamAssetFailures();

                woRequestDto.setFailureDate(eamAssetFailures.getFailureDate());

                /*Lấy thông tin EAM_ASSET_FAILURE_CODES*/
                if(wipEntitiesDto.getEamAssetFailures().getEamAssetFailureCodes() != null){
                    var eamAssetFailureCodes = wipEntitiesDto.getEamAssetFailures().getEamAssetFailureCodes();

                    woRequestDto.setFailureCode(eamAssetFailureCodes.getFailureCode());
                    woRequestDto.setCauseCode(eamAssetFailureCodes.getCauseCode());
                    woRequestDto.setResolutionCode(eamAssetFailureCodes.getResolutionCode());
                }
            }

            /*Lấy thông tin WIP_OPERATIONS*/
            if(wipEntitiesDto.getWipOperations() != null) {
                var wipOperationsDtoList = wipEntitiesDto.getWipOperations();
                var wipOperationsCollection = new ArrayList<WORequestDto.WipOperationsDto>();

                for (var wipOperationsDto : wipOperationsDtoList) {
                    /*Lấy thông tin WIP_OPERATIONS */
                    var wipOperationsDtoNew = new WORequestDto.WipOperationsDto();

                    BeanUtils.copyProperties(wipOperationsDto, wipOperationsDtoNew);

                    /*Lấy thông tin WIP_REQUIREMENT_OPERATIONS */
                    if (wipOperationsDto.getWipRequirementOperations() != null) {
                        var wipRequirementOperationsDtoList = wipOperationsDto.getWipRequirementOperations();
                        var wipRequirementOperationsCollection = new ArrayList<WORequestDto.WipRequirementOperationsDto>();
                        for (var wipRequirementOperationsDto : wipRequirementOperationsDtoList) {
                            var wipRequirementOperationsDtoNew = new WORequestDto.WipRequirementOperationsDto();

                            BeanUtils.copyProperties(wipRequirementOperationsDto, wipRequirementOperationsDtoNew);

                            wipRequirementOperationsCollection.add(wipRequirementOperationsDtoNew);
                        }

                        wipOperationsDtoNew.setWipRequirementOperations(wipRequirementOperationsCollection);
                    }else{
                        wipOperationsDtoNew.setWipRequirementOperations(new ArrayList<>());
                    }

                    /*Lấy thông tin WIP_OPERATION_RESOURCES*/
                    if (wipOperationsDto.getWipOperationResources() != null) {
                        var wipOperationResourcesDtoList = wipOperationsDto.getWipOperationResources();
                        var wipOperationResourcesDtoCollection = new ArrayList<WORequestDto.WipOperationResourcesDto>();
                        for (var wipOperationResourcesDto : wipOperationResourcesDtoList) {
                            var wipOperationResourcesDtoNew = new WORequestDto.WipOperationResourcesDto();

                            BeanUtils.copyProperties(wipOperationResourcesDto, wipOperationResourcesDtoNew);

                            /*Trường hợp cập nhật trạng thái != hoàn thành, từ chối thì mặc định giá trị thực xuất = 0*/
                            if(wipEntitiesDto.getStatusType() != WoStatus.COMPLETE.getDbVal()
                                && wipEntitiesDto.getStatusType() != WoStatus.CANCELLED.getDbVal()
                                    && wipEntitiesDto.getStatusType() != WoStatus.CANCELLED_BY_PM.getDbVal()
                                        && wipEntitiesDto.getStatusType() != WoStatus.CANCELLED_BY_APPROVER.getDbVal()
                            ){
                                wipOperationResourcesDtoNew.setAppliedResourceUnits(0L);
                            }

                            /*Lấy thông tin WIP_OP_RESOURCE_INSTANCES*/
                            if(wipOperationResourcesDto.getWipOpResourceInstancesDto() != null){
                                var wipOpResourceInstancesDto = wipOperationResourcesDto.getWipOpResourceInstancesDto();
                                wipOperationResourcesDtoNew.setInstanceId(wipOpResourceInstancesDto.getInstanceId());
                            }

                            wipOperationResourcesDtoCollection.add(wipOperationResourcesDtoNew);
                        }

                        wipOperationsDtoNew.setWipOperationResources(wipOperationResourcesDtoCollection);
                    }else{
                        wipOperationsDtoNew.setWipOperationResources(new ArrayList<>());
                    }

                    wipOperationsCollection.add(wipOperationsDtoNew);
                }

                woRequestDto.setWipOperations(wipOperationsCollection);
            }else{
                woRequestDto.setWipOperations(new ArrayList<>());
            }

            return Optional.of(woRequestDto);
        }catch (Exception e){
            log.error("Can't generateWORequestDto: "+e);
        }

        return Optional.empty();
    }

    /*
     * Save sMartW và Call API EAM
     * @param wipEntitiesDto
     * @return
     */
    public MessageResponse saveAndCallAPI(WipEntitiesDto wipEntitiesDto){
        final var wipEntitiesOptional = wipEntitiesRepository.findByWipEntityName(wipEntitiesDto.getWipEntityName());

        /* Save sMartW*/
        final var messageResponse= save(wipEntitiesDto);

        /* Call API EAM*/
        if(messageResponse.getErrorCode().equals("0")){
            final var woRequestDtoOptional= generateWORequestDto(wipEntitiesDto);
            if(woRequestDtoOptional.isPresent()){
                final var woRequestDto = woRequestDtoOptional.get();
                if(wipEntitiesOptional.isEmpty()){/* Create WO*/
                    final var createWO= eamService.createWO(woRequestDto);

                    // return createWO;
                }else{/* Update Info*/
                    final var wipEntities= wipEntitiesOptional.get();
                    final var updateWOInfo= eamService.updateWOInfo(woRequestDto);

                    /*
                     * wipEntitiesDto.getStatusType() : Trạng thái cập nhật
                     * wipEntities.getStatusType(): Trạng thái hiện tại
                     * */
                    if(wipEntitiesDto.getStatusType() != wipEntities.getStatusType()){
                        /* Update Status*/
                        final var wipDiscreteJobs= wipEntitiesDto.getWipDiscreteJobs();
                        var woRequestStatusDto = WoRequestStatusDto.builder()
                                .wipEntityName(wipEntitiesDto.getWipEntityName())
                                .statusChangeDate(new Date())
                                .actualStartDate(wipDiscreteJobs.getActualStartDate())
                                .dateCompleted(wipDiscreteJobs.getDateCompleted())
                                .counterReading(wipEntitiesDto.getCounterReading())
                                .statusType(wipEntitiesDto.getStatusType())
                                .build();

                        final var updateWOStatus = eamService.updateWOStatus(woRequestStatusDto);

                        return updateWOStatus;
                    }

                    return updateWOInfo;
                }
            }
        }

        return messageResponse;
    }

    public Optional<WORequestDto> saveAndCallAPITest(WipEntitiesDto wipEntitiesDto){
        final var wipEntitiesOptional = wipEntitiesRepository.findByWipEntityName(wipEntitiesDto.getWipEntityName());

        /* Save sMartW*/
        final var messageResponse= save(wipEntitiesDto);

        /* Call API EAM*/
        if(messageResponse.getErrorCode().equals("0")){
            final var woRequestDtoOptional= generateWORequestDto(wipEntitiesDto);
            if(woRequestDtoOptional.isPresent()){
                final var woRequestDto = woRequestDtoOptional.get();
                if(wipEntitiesOptional.isEmpty()){/* Create WO*/
                    final var createWO= eamService.createWO(woRequestDto);

                    // return createWO;
                }else{/* Update Info*/
                    final var wipEntities= wipEntitiesOptional.get();
                    final var updateWOInfo= eamService.updateWOInfo(woRequestDto);

                    /*
                     * wipEntitiesDto.getStatusType() : Trạng thái cập nhật
                     * wipEntities.getStatusType(): Trạng thái hiện tại
                     * */
                    if(wipEntitiesDto.getStatusType() != wipEntities.getStatusType()){
                        /* Update Status*/
                        final var wipDiscreteJobs= wipEntitiesDto.getWipDiscreteJobs();
                        var woRequestStatusDto = WoRequestStatusDto.builder()
                                .wipEntityName(wipEntitiesDto.getWipEntityName())
                                .statusChangeDate(new Date())
                                .actualStartDate(wipDiscreteJobs.getActualStartDate())
                                .dateCompleted(wipDiscreteJobs.getDateCompleted())
                                .counterReading(wipEntitiesDto.getCounterReading())
                                .statusType(wipEntitiesDto.getStatusType())
                                .build();

                        final var updateWOStatus = eamService.updateWOStatus(woRequestStatusDto);

                        //  return updateWOStatus;
                    }

                    //  return updateWOInfo;
                }
            }

            return woRequestDtoOptional;
        }

        return Optional.empty();
        //return messageResponse;
    }
}
