package com.example.bookstore.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private Double price;
    private int Total_Pages;
    private String description;

    @OneToOne(mappedBy = "book")
    private OrderItem orderItem;

    @OneToMany(mappedBy = "book")
    private List<Author> author;

    @OneToOne(mappedBy = "book")
    private Publisher publisher;

//    private Category category;

}
