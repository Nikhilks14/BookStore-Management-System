package com.example.bookstore.Controller;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Service.BookService;
import com.example.bookstore.UserDto.BooKDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    private BookService bookService;

    @PostMapping()
    public ResponseEntity<BooKDto> createBook(@RequestBody BooKDto booKDto){
        BooKDto booK =  bookService.createBook(booKDto);
        return new ResponseEntity<>(booK, HttpStatus.OK);
    }
}
