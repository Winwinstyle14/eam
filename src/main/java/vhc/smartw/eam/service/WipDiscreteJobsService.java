package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import vhc.smartw.eam.dto.WipDiscreteJobsDto;
import vhc.smartw.eam.dto.WipEntitiesDto;
import vhc.smartw.eam.entity.WipDiscreteJobs;
import vhc.smartw.eam.entity.WipEntities;
import vhc.smartw.eam.repository.WipDiscreteJobsRepository;
import vhc.smartw.eam.repository.WipEntitiesRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class WipDiscreteJobsService {
    @Autowired
    private WipDiscreteJobsRepository wipDiscreteJobsRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Optional<WipDiscreteJobsDto> getById(long id){
        var wipDiscreteJobsOptional = wipDiscreteJobsRepository.findById(id);

        var wipEntitiesDtoOptional = wipDiscreteJobsOptional.map(
                wipDiscreteJobs -> modelMapper.map(wipDiscreteJobs, WipDiscreteJobsDto.class)
        );

        return wipEntitiesDtoOptional;
    }

    public Optional<WipDiscreteJobsDto> save(Long wipEntitiesId, WipDiscreteJobsDto wipDiscreteJobsDto){
        try {
            var wipDiscreteJobsNew = modelMapper.map(wipDiscreteJobsDto, WipDiscreteJobs.class);
            var wipDiscreteJobsOptional = wipDiscreteJobsRepository
                    .findByWipEntityIdAndOrganizationId(wipEntitiesId, wipDiscreteJobsDto.getOrganizationId());

            if(wipDiscreteJobsOptional.isEmpty()){
                wipDiscreteJobsNew.setId(null);
                wipDiscreteJobsNew.setWipEntityId(wipEntitiesId);
            }else{
                var wipDiscreteJobs = wipDiscreteJobsOptional.get();
                wipDiscreteJobsNew.setId(wipDiscreteJobs.getId());
                wipDiscreteJobsNew.setWipEntityId(wipEntitiesId);
            }

            var wipDiscreteJobs = wipDiscreteJobsRepository.save(wipDiscreteJobsNew);

            return Optional.of(modelMapper.map(wipDiscreteJobs, WipDiscreteJobsDto.class));
        }catch (Exception e){
            log.error("Can't create Jobs: ", e);
        }

        return Optional.empty();
    }
}
