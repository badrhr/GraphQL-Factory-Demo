package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dtos.FactoryDto;
import ma.xproce.inventoryservice.service.FactoryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class FactoryController {

    @Autowired
    private FactoryManager factoryManager;

    @QueryMapping
    public FactoryDto getFactoryById(@Argument Long id) {
        return factoryManager.getFactoryById(id);
    }


    //saveFactory(factoryInput: FactoryDtoInput): FactoryDto
    @MutationMapping
    public FactoryDto saveFactory(@Argument FactoryDto factoryDto){
        return factoryManager.saveFactory(factoryDto);
    }
}