package com.shop.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_date")
    private LocalDateTime orderDate = LocalDateTime.now();

    @Column(name = "delivery_date")
    private Date deliveryDate ;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "delivery_status")
    private boolean deliveryStatus;

    @OneToMany(mappedBy = "order")
    private List<OrderDetails> orderDetails;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
