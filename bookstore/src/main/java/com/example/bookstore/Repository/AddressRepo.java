package com.example.bookstore.Repository;

import com.example.bookstore.Model.Address;
import com.example.bookstore.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {
}
