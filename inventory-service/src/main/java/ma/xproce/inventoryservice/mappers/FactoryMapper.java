package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Factory;
import ma.xproce.inventoryservice.dtos.FactoryDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class FactoryMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public FactoryDto fromFactoryToFactoryDto(Factory factory){
        return this.modelMapper.map(factory, FactoryDto.class);
    }

    public Factory fromFactoryDtoToFactory(FactoryDto factoryDto){
        return this.modelMapper.map(factoryDto, Factory.class);
    }
}
