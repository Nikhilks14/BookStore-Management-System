package com.example.bookstore.Service;

import com.example.bookstore.Model.Address;
import com.example.bookstore.Model.User;
import com.example.bookstore.Repository.AddressRepo;
import com.example.bookstore.Repository.UserRepo;
import com.example.bookstore.UserDto.AddressDto;
import com.example.bookstore.UserDto.UserDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepo userRepo;
    private ModelMapper modelMapper;
    private Address address;
    private AddressRepo addressRepo;


    // Create User
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = dtoToUser(userDto);
        User saveUser = userRepo.save(user);
        return userToDto(saveUser);
    }

    // GET SINGLE USER
    @Override
    public UserDto getSingleUser(int id) {
        Optional<User> user =  userRepo.findById(id);

        if (user.isPresent()) return userToDto(user.get());
        else throw new RuntimeException("USer not found " + id);
    }

    // LIST of user
    @Override
    public List<UserDto> getAllUser() {
        List<User> listOfUser = userRepo.findAll();
        List<UserDto> listUSer= listOfUser.stream().map( user -> userToDto(user)).collect(Collectors.toList());
        return listUSer;
    }

    // User update
    @Override
    public UserDto udateUser(UserDto userDto, Integer userId) {
        User user = userRepo.findById(userId).orElseThrow(()-> new RuntimeException("user not found"));

        user.setName(userDto.getName());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());

        return  userToDto(userRepo.save(user));
    }


    @Override
    public void deleteUser(int id) {
        User user = userRepo.findById(id).orElseThrow(()-> new RuntimeException("User Not found"));
        userRepo.delete(user);
    }

    @Override
    public Address addAddressToUser1(int userId, AddressDto addressDto) {
        User user = userRepo.findById(userId).orElseThrow(()-> new RuntimeException("User not found"));
//        Address address = dtoToAdd(addressDto);
//        address.setUser(user);
//        user.getAddress().add(address);
//        User updateUser = userRepo.save(user);
        Address address = new Address();
        address.setAddress(addressDto.getAddress());
        address.setPincode(addressDto.getPincode());
        address.setUser(user);
        return addressRepo.save(address);


    }










    // UserDto to User
    public User dtoToUser(UserDto userDto){
        User user = modelMapper.map(userDto , User.class);
        return user;
    }

    // User to UserDto
    public UserDto userToDto(User user){
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return  userDto;
    }

    public Address dtoToAdd(AddressDto addressDto){
        return modelMapper.map(addressDto, Address.class);
    }
    public AddressDto addressToDto(Address address){
        return modelMapper.map(address, AddressDto.class);
    }

}
