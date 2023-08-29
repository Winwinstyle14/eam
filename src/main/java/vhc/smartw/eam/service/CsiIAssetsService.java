package vhc.smartw.eam.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import vhc.smartw.eam.dto.CsiCounterAssociationsDto;
import vhc.smartw.eam.dto.CsiIAssetsDto;
import vhc.smartw.eam.entity.CsiCounterAssociations;
import vhc.smartw.eam.entity.CsiIAssets;
import vhc.smartw.eam.repository.CsiIAssetsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CsiIAssetsService {
    @Autowired
    CsiIAssetsRespository csiIAssetsRespository;

    @Autowired
    ModelMapper modelMapper;

    //list
    public List<CsiIAssets>list(){
        return csiIAssetsRespository.findAll();
    }
    //getid
    public Optional<CsiIAssets> getById(Long instanceAssetId){
        return csiIAssetsRespository.findById(instanceAssetId);
    }
    //add
    public Optional<CsiIAssetsDto>save(CsiIAssetsDto csiIAssetsDto){
        try {
            var csiIAssets = modelMapper.map(csiIAssetsDto, CsiIAssets.class);

            csiIAssets = csiIAssetsRespository.save(csiIAssets);

            return Optional.of(modelMapper.map(csiIAssets, CsiIAssetsDto.class));
        }catch (Exception e){
            log.error("Can't update csiIAssets: {}", e);
        }

        return Optional.empty();
    }
    //update
    public CsiIAssets updateCsiIAssets(CsiIAssets csiIAssets){
        return csiIAssetsRespository.save(csiIAssets);
    }
    //delet
    public void delete(Long instanceAssetId){
        csiIAssetsRespository.deleteById(instanceAssetId);
    }
    public boolean existsById(Long instanceAssetId){
        return csiIAssetsRespository.existsById(instanceAssetId);
    }
}
