package com.jd.user.services.services;

import java.util.List;

import com.jd.user.services.entities.User;

public interface UserService {

    //user operation 

    // create 
    User saveUser(User user);

    //get all user
    List<User> getAllUser();


    //get single user of giver user id 
        User getUser(String userId);
}
