package com.example.bookstore.Service;

import com.example.bookstore.Model.User;
import com.example.bookstore.UserDto.AddressDto;
import com.example.bookstore.UserDto.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    // Create User
    UserDto createUser(UserDto userDto);

    // GET SINGLE USER
    UserDto getSingleUser(int id);

    List<UserDto> getAllUser();

    // User update
    UserDto udateUser(UserDto userDto, Integer userId);

    void deleteUser(int id);

    UserDto addAddressToUser1(int userId, AddressDto addressDto);

}
