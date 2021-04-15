package com.luxtest.core.service;

import com.luxtest.core.model.User;
import com.luxtest.core.repository.UserRepository;
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
