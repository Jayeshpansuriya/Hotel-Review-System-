package com.jd.user.services.external.services;

import com.jd.user.services.entities.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTELSERVICE") // Corrected the spelling
public interface HotelService {

    @GetMapping("/hotels/{hotelId}") // Define the endpoint mapping
    Hotel getHotel(@PathVariable("hotelId") String hotelId);

}
