package com.example.bookstore.UserDto;

import com.example.bookstore.Model.User;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private int Address_Id;
    private String Address;
    private String pincode;
    private Integer user;
}
