package com.shop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ImageProduct")
public class ImageProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "image_link")
    private String imageLink;

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;
}
