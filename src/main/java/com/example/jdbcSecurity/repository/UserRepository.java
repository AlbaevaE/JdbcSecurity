package com.example.jdbcSecurity.repository;

import com.example.jdbcSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
