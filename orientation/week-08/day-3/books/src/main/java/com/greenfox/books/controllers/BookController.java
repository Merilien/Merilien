package com.greenfox.books.controllers;

import com.greenfox.books.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BookController {
    private List<Book> books;

    public BookController() {
        books = new ArrayList();
        books.add(new Book("Cat's Cradle", "Kurt Vonnegut", 1963));
        books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
    }

    @GetMapping(path = "/books")
    public String showBooks(Model model, @RequestParam(name = "author", required = false) String author) {
        List<Book> booksToList = null;
        if (author != null) {
            booksToList = books.stream()
                    .filter(book -> book.getAuthor().equals(author))
                    .collect(Collectors.toList());
        } else {
            booksToList = books;
        }
        model.addAttribute("books", booksToList);
        return "booklist";
    }

    @GetMapping(path ="/books/{id}/details")
    public String getBookById(Model model, @PathVariable(name = "id") int id) {
        Book selected = null;
        for (Book book : books) {
            if (book.getId() == id) {
                selected = book;
            }
        }
        if (selected != null) {
            model.addAttribute("book", selected);
        } else {
            model.addAttribute("error", "No book found with this id");
        }
        return "bookdetails";
    }

    @GetMapping("/books/add")
    public String addBookForm(Model model, @ModelAttribute(name="book") Book book) {
        model.addAttribute("book", book);
        return "createbook";
    }

    @PostMapping("/books/add")
    public String addBook(@ModelAttribute(name="book") Book book) {
        books.add(book);
        return "redirect:/books";
    }






}
