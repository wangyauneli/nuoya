package com.nuoya.springdayone.security;

import com.nuoya.springdayone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
