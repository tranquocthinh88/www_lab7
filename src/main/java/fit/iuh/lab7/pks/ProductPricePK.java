package fit.iuh.lab7.pks;

import fit.iuh.lab7.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter @Getter
public class ProductPricePK implements Serializable {
    private Product product;
    private LocalDateTime priceDateTime;
}
