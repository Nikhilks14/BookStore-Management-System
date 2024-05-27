package com.example.bookstore.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date orderDate;
    private Date deliveryDate;
    private Double subTotal;
    private Double shippingCharge;

    @ManyToMany(mappedBy = "orders")
    private List<User> user;

    /*
    *  address   1   M
    *  order     1   1
    *            1 ; M
    * */

    @ManyToOne
    @JoinColumn(name = "delivery_Address")
    private Address address;

    @OneToMany(mappedBy = "orders")
    private List<OrderItem> orderItems;
}
