package com.shop.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    @Column(name = "image")
    private String image;

    @Column(name = "view")
    private int view;

    @Column(name = "is_delete")
    private boolean isDelete;

    @Column(name = "discount")
    private int percentDiscount;

    @ManyToOne
    @JoinColumn(name = "id_product_type")
    private ProductType productType;

    @OneToMany(mappedBy = "product")
    private List<ImageProduct> images;
}
