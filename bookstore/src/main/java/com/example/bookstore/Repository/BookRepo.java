package com.example.bookstore.Repository;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book , Integer> {
}
