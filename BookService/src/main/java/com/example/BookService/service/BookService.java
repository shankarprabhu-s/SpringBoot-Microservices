package com.example.BookService.service;

import java.util.List;

import com.example.BookService.entity.Book;

public interface BookService {
    Book addBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long id);
    void deleteBookById(Long id);
    Book updateBook(Long id, Book bookDetails);
}
