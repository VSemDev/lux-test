package com.luxtest.userservice.service;

import com.luxtest.userservice.model.User;
import com.luxtest.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsersByCountry(String country) {
        return userRepository.findByCountry(country);
    }
}
