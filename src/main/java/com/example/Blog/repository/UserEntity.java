package com.example.Blog.repository;

import com.example.Blog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntity extends JpaRepository<Users, Long> {
}
