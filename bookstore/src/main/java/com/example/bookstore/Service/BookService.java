package com.example.bookstore.Service;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Model.User;
import com.example.bookstore.UserDto.BooKDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    BooKDto createBook(BooKDto booKDto);

    Book getSingleBook(int id);
    List<Book> getAllBook();
    Book updateBook(Book book);
    void deleteBook(int id);

}
