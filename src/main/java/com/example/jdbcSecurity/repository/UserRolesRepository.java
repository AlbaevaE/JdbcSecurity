package com.example.jdbcSecurity.repository;

import com.example.jdbcSecurity.model.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRolesRepository extends JpaRepository<UserRoles,Integer> {
}
