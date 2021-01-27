package ge.softlab.warehousenew.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String provider;
    @Column
    private String store;
    @Column
    private String brand;
    @Column
    private String model;
    @Column
    private int quantity;
    @Column
    private int price;
    @Column
    private int pricePerProduct;

}