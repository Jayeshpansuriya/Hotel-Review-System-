package com.jd.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jd.hotel.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {



}
