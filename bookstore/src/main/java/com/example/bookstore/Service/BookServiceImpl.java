package com.example.bookstore.Service;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Repository.BookRepo;
import com.example.bookstore.UserDto.BooKDto;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@RequestMapping("/book")
public class BookServiceImpl implements BookService{

    private final BookRepo bookRepo;
    private ModelMapper modelMapper;

    @Override
    public BooKDto createBook(BooKDto booKDto) {
        Book book = dtoTobook(booKDto);
        return bookTodto(bookRepo.save(book));
    }

    // GET SINGLE USER
    @Override
    public Book getSingleBook(int id) {
        Optional<Book> book =  bookRepo.findById(id);
        if (book.isPresent()) return book.get();
        else throw new RuntimeException("Book not found  " + id);
    }

    // LIST of user
    @Override
    public List<Book> getAllBook() {
        return bookRepo.findAll();
    }

// User update
    @Override
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public void deleteBook(int id) {
        bookRepo.deleteById(id);
    }


public Book dtoTobook(BooKDto booKDto){
        return modelMapper.map(booKDto , Book.class);
}
public BooKDto bookTodto(Book book){
        return modelMapper.map(book, BooKDto.class);
}

}
