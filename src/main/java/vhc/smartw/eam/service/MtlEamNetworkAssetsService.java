package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vhc.smartw.eam.config.MtlNetworkAssetsId;
import vhc.smartw.eam.dto.MtlEamNetworkAssetsDto;
import vhc.smartw.eam.dtoFlat.MtlEamNetworkAssetsDtoFlat;
import vhc.smartw.eam.entity.MtlEamNetworkAssets;
import vhc.smartw.eam.repository.MtlNetworkAssetsRepository;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MtlEamNetworkAssetsService {
    @Autowired
    MtlNetworkAssetsRepository mtlNetworkAssetsRepository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<MtlEamNetworkAssets>list(){
        return mtlNetworkAssetsRepository.findAll();
    }

    //add
    public Optional<MtlEamNetworkAssetsDto> save(MtlEamNetworkAssetsDtoFlat mtlEamNetworkAssetsDtoFlat){
        try {
            var mtlEamNetworkAssetsDto = modelMapper.map(mtlEamNetworkAssetsDtoFlat,MtlEamNetworkAssetsDto.class);
            var mtlNetworkAssetsId = MtlNetworkAssetsId.builder()
                    .networkAssociationId(mtlEamNetworkAssetsDtoFlat.getNetworkItemId())
                    .inventoryItemId(mtlEamNetworkAssetsDtoFlat.getInventoryItemId())
                    .build();
            mtlEamNetworkAssetsDto.setMtlNetworkAssetsId(mtlNetworkAssetsId);
            var mtlNetworkAssets = modelMapper.map(mtlEamNetworkAssetsDto, MtlEamNetworkAssets.class);

            mtlNetworkAssets = mtlNetworkAssetsRepository.save(mtlNetworkAssets);

            return Optional.of(modelMapper.map(mtlNetworkAssets, MtlEamNetworkAssetsDto.class));
        }catch (Exception e){
            log.error("Can't update Locations: {}", e);
        }
        return Optional.empty();
    }

}
