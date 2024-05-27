package com.example.bookstore.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItem;
    private int quentity;
    private Double price;

    @OneToOne
    @JoinColumn(name = "bookId")
    private Book book;

    @ManyToOne
    private Orders orders;
}
