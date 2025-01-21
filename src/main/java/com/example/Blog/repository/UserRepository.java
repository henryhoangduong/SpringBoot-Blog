package com.example.Blog.repository;

import com.example.Blog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepository extends JpaRepository<Users, Long> {
    User findByEmail(String email);
}
