package com.ecommerce.sportscenter.service;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.sportscenter.entity.User;
import com.ecommerce.sportscenter.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // User Registration
    public String register(org.springframework.security.core.userdetails.User user) {
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser.isPresent()) {
            return "Email already registered!";
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "User registered successfully!";
    }

    // User Login
    public boolean login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);

        return user.isPresent() && passwordEncoder.matches(password, user.get().getPassword());
    }
}
