package live.overflux.ecommerce.product.model;

import jakarta.persistence.*;

@Entity
@Table(name = "materials")
public class ProductMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int percent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_details_id", nullable = false)
    private ProductDetails productDetails;
}
