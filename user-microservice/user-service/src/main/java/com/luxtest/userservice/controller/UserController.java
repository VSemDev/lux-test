package com.luxtest.userservice.controller;

import com.luxtest.userclientspringbootstarter.api.UserApi;
import com.luxtest.userservice.model.User;
import com.luxtest.userservice.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController implements UserApi<User> {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsersByCountry(@RequestParam String country) {
        return ResponseEntity.ok(userService.getUsersByCountry(country));
    }
}