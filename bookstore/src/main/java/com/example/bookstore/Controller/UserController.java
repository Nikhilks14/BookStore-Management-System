package com.example.bookstore.Controller;

import com.example.bookstore.Model.User;
import com.example.bookstore.Service.UserService;
import com.example.bookstore.UserDto.AddressDto;
import com.example.bookstore.UserDto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    // CREATE USER
    @PostMapping("/user")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
       UserDto newUser = userService.createUser(userDto);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable int id){
        UserDto userDto = userService.getSingleUser(id);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDto>> getAllUser(){
        List<UserDto> userList = userService.getAllUser();

        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @PostMapping("/user/{id}")
    public ResponseEntity<UserDto> updateUser( @PathVariable int id,@RequestBody UserDto userDto){
        UserDto updateUser = userService.udateUser(userDto,id);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable int id){
         userService.deleteUser(id);
    }

    @PostMapping("/{userId}/address")
    ResponseEntity<UserDto> addAddressToUser(@PathVariable int userId, @RequestBody AddressDto addressDto){
        UserDto updateUser = userService.addAddressToUser(userId,addressDto);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }
}
