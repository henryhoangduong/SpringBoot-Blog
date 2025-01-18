package com.example.Blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;

public interface RoleEntity extends JpaRepository<Role, Long> {
}
