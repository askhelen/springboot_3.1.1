package com.example.springboot_311.repository;

import com.example.springboot_311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
