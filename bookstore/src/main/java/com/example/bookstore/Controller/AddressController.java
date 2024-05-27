package com.example.bookstore.Controller;

import com.example.bookstore.Service.AddressService;
import com.example.bookstore.UserDto.AddressDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddressController {

    private AddressService addressService;

    @PostMapping
    public ResponseEntity<AddressDto> createAddress(@RequestBody AddressDto addressDto){
        AddressDto address = addressService.createAddress(addressDto);
        return new ResponseEntity<>(address, HttpStatus.OK);
    }
}
