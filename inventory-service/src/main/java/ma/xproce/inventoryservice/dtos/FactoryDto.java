package ma.xproce.inventoryservice.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FactoryDto {
    private String name;
    private  String localisation;
}
