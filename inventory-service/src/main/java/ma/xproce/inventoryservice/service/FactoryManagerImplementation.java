package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Factory;
import ma.xproce.inventoryservice.dao.repositories.FactoryRepository;
import ma.xproce.inventoryservice.dtos.FactoryDto;
import ma.xproce.inventoryservice.mappers.FactoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryManagerImplementation implements FactoryManager {

    @Autowired
    private FactoryRepository factoryRepository;
    @Autowired
    private FactoryMapper factoryMapper;

    @Override
    public FactoryDto getFactoryById(Long id) {
        /*
        Factory factory = factoryRepository.findById(id).get();
        FactoryDto factoryDto = factoryMapper.fromFactoryToFactoryDto(factory);
        return factoryDto;*/

        return factoryMapper.fromFactoryToFactoryDto(factoryRepository.findById(id).get());

    }

    @Override
    public FactoryDto saveFactory(FactoryDto factoryDto) {
        /*Factory factory = factoryMapper.fromFactoryDtoToFactory(factoryDto);
        Factory factory1 = factoryRepository.save(factory);
        FactoryDto factoryDto1 = factoryMapper.fromFactoryToFactoryDto(factory1);
        return factoryDto1;*/

        return factoryMapper.fromFactoryToFactoryDto(factoryRepository.save(factoryMapper.fromFactoryDtoToFactory(factoryDto)));

    }
}
