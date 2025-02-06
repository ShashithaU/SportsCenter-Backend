package com.ecommerce.sportscenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.sportscenter.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<com.ecommerce.sportscenter.entity.User> findByEmail(String email);  // Check if email exists

    com.ecommerce.sportscenter.entity.User save(org.springframework.security.core.userdetails.User user);
}


