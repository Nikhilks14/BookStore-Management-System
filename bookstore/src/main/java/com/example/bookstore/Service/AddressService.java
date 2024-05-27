package com.example.bookstore.Service;

import com.example.bookstore.Model.Address;
import com.example.bookstore.UserDto.AddressDto;
import com.example.bookstore.UserDto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    // Create User
    AddressDto createAddress(AddressDto addressDto);

}
