package com.java.BookReviews.controllers;

import com.java.BookReviews.data.BookRepository;
import com.java.BookReviews.data.ReviewRepository;
import com.java.BookReviews.data.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookReviewController {
    
    @Autowired
    BookRepository bookRepository;
    
    @Autowired
    ReviewRepository reviewRepository;
    
    @Autowired
    UserDetailsRepository userDetailsRepository;
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
    @GetMapping("/addBook")
    public String addBook() {
        return "addBook";
    }
}
