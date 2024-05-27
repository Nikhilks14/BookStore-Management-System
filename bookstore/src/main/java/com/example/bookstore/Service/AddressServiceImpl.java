package com.example.bookstore.Service;

import com.example.bookstore.Model.Address;
import com.example.bookstore.Repository.AddressRepo;
import com.example.bookstore.UserDto.AddressDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    private ModelMapper modelMapper;
    private AddressRepo addressRepo;

    // Create Address
    @Override
    public AddressDto createAddress(AddressDto addressDto) {
        Address address = addressRepo.save(dtoToAdd(addressDto));
        return addressToDto(address);
    }





    public Address dtoToAdd(AddressDto addressDto){
        return modelMapper.map(addressDto, Address.class);
    }
    public AddressDto addressToDto(Address address){
        return modelMapper.map(address, AddressDto.class);
    }


}
