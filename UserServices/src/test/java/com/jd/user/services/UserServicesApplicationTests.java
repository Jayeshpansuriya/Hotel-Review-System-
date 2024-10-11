package com.jd.user.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jd.user.services.external.services.RatingService;

@SpringBootTest
class UserServicesApplicationTests {

	@Test
	void contextLoads() {
	}


	@Autowired
	private RatingService ratingService;


	// @Test
	// void createRating(){
  
	// 	Rating rating = Rating.builder().rating(10).userId("").hotelId("").feedback("this is created by fieng client ").build();  
	// 	ResponseEntity<Rating> ratingResponseEntity =  ratingService.createRating(rating);
	// 	 System.out.println("new rating created");  

	// }



}
