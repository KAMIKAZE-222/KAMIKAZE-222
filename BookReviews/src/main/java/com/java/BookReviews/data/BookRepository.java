package com.java.BookReviews.data;

import com.java.BookReviews.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
}
