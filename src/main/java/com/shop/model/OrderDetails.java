package com.shop.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OrderDetails")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Order order;

    @OneToOne
    @JoinColumn(name = "id_product")
    private Product product;
}
