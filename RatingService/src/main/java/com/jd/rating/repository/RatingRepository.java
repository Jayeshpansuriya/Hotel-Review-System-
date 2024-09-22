package com.jd.rating.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jd.rating.entities.Rating;
import java.util.List;


public interface  RatingRepository extends MongoRepository<Rating, String> {


    //coustom finder methods

    List<Rating> findByUserId (String userId);
    List<Rating> findByHotelId(String hotelId);

}
