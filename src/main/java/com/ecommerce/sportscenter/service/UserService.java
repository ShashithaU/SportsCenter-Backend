package com.ecommerce.sportscenter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.sportscenter.entity.User;
import com.ecommerce.sportscenter.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // Register a new user with encrypted password
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Hash password
        return userRepository.save(user);
    }

    // Retrieve all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by ID
    public User getUserById(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));
    }

    // Authenticate user with encrypted password verification
    public Optional<User> authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return Optional.empty();
        }
        return passwordEncoder.matches(password, user.getPassword()) ? Optional.of(user) : Optional.empty();
    }

    // Delete a user by ID
    public void deleteUser(String userId) {
        if (!userRepository.existsById(userId)) {
            throw new UserNotFoundException("Cannot delete. User not found with ID: " + userId);
        }
        userRepository.deleteById(userId);
    }
}
