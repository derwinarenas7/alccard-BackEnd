package co.com.alccard.model.product;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Product {
    private Double id;
    private String name;
    private String brand;
}
