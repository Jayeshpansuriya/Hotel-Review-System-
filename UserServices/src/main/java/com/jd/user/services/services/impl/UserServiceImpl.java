package com.jd.user.services.services.impl;

import java.util.Arrays;

import com.jd.user.services.entities.Rating;
import com.jd.user.services.entities.User;
import com.jd.user.services.exceptions.ResourceNotFoundException;
import com.jd.user.services.repositories.UserRepository;
import com.jd.user.services.services.UserService;

import org.slf4j.Logger; // Use SLF4J Logger
import org.slf4j.LoggerFactory; // Correct LoggerFactory
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        // Generate a unique user ID
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        // Retrieve all users from the repository
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        // Get user from database with the help of user repository
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server: " + userId));

        // Fetch ratings of the above user from RATING SERVICE
        Rating[] ratingsOfUser = restTemplate.getForObject("http://RATING-SERVICE/ratings/users/" + user.getUserId(), Rating[].class);
        logger.info("{} ", ratingsOfUser);

        List<Rating> ratingsList = Arrays.asList(ratingsOfUser);
        user.setRatings(ratingsList);

        return user;
    }
}
