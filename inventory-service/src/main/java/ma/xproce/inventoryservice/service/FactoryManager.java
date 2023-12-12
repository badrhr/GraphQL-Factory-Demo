package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dtos.FactoryDto;

public interface FactoryManager {

    public FactoryDto getFactoryById(Long id);
    public FactoryDto saveFactory(FactoryDto factoryDto);
}
