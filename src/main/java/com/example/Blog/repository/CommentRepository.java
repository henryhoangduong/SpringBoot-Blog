package com.example.Blog.repository;

import com.example.Blog.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CommentRepository extends JpaRepository<Comments, Long> {
}
