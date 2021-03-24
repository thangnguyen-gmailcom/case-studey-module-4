package com.shop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ProductType")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_type_name")
    private String productTypeName;

    @Column(name = "is_delete")
    private boolean isDelete;
}
