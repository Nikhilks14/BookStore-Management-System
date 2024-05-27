package com.example.bookstore.UserDto;

import com.example.bookstore.Model.Address;
import com.example.bookstore.Model.Orders;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {

    private int id;
    @NotBlank
    private String name;
    private String username;
    private String password;
    @Email(message = " Enter Valid Email")
    private String email;

}
