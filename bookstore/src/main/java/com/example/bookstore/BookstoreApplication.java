package com.example.bookstore;

import com.example.bookstore.Model.Address;
import com.example.bookstore.Model.Orders;
import com.example.bookstore.Model.User;
import com.example.bookstore.Repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class BookstoreApplication  {

//	@Autowired
//	private UserRepo userRepo;

	public static void main(String[] args) {

		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		User u1 = new User();
//		u1.setName("Nikhil");
//		u1.setUsername("Nikhilks");
//		u1.setEmail("Nikhil@gmail.com");
//		u1.setPassword("Jackooo");
//
//		Address a1 = new Address();
//		a1.setAddress("Noida");
//		a1.setUser(u1);
//		a1.setPincode("12345");
//
//		Orders o1 =new Orders();
//		o1.setAddress(a1);
//		o1.setUser(List.of(u1));
//
//
//		a1.setOrders(List.of(o1));
//
//		u1.setAddress(List.of(a1));
//		u1.setOrders(Set.of(o1));
//
//		userRepo.save(u1);
//
//	}
}
