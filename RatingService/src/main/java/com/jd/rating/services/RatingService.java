package com.jd.rating.services;

import com.jd.rating.entities.Rating;
import java.util.List;

public interface RatingService {

    // Create
    Rating create(Rating rating);

    // Get all ratings
    List<Rating> getRatings();

    // Get all ratings by UserId
    List<Rating> getRatingByUserId(String userId);

    // Get all ratings by HotelId
    List<Rating> getRatingByHotelId(String hotelId);
}
