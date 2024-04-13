package com.java.BookReviews.data;

import com.java.BookReviews.models.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
    
}
