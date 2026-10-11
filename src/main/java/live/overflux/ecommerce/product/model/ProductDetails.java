package live.overflux.ecommerce.product.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "product_details")
@Entity
public class ProductDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String articleNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private String description;
    private String size;
    private String color;
    private int price;

    @ElementCollection
    @CollectionTable(
            name = "product_images",
            joinColumns = @JoinColumn(name = "product_details_id"))
    @Column(name = "image_url")
    private List<String> images;

    @OneToMany(
            mappedBy = "productDetails",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<ProductMaterial> productMaterials;

    private int quantity;

}
