package com.jd.user.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jd.user.services.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
