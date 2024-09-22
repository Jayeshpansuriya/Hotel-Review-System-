package com.jd.hotel.services;

import com.jd.hotel.entites.Hotel;
import java.util.List;

public interface HotelService {

    // Create a new hotel
    Hotel create(Hotel hotel);

    // Get all hotels
    List<Hotel> getAll();

    // Get a single hotel by its ID
    Hotel get(String id);
}
