package com.example.bookstore.UserDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BooKDto {
    private int id;

    private String title;
    private Double price;
    private int Total_Pages;
    private String description;
}
