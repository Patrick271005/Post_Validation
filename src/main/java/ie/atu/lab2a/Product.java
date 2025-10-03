package ie.atu.lab2a;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class Product {
    @NotBlank
    @Size(min = 1, max = 20)
    private String productName;
    @Positive
    private double price;


}

