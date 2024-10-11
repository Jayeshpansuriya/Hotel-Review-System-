package com.jd.user.services.external.services;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="RATINGSERVICE")
public class RatingService {

}
