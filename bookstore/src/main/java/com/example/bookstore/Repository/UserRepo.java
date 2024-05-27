package com.example.bookstore.Repository;

import com.example.bookstore.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
