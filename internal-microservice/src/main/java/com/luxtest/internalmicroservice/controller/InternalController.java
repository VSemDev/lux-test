package com.luxtest.internalmicroservice.controller;

import com.luxtest.userclientspringbootstarter.client.UserClientApi;
import com.luxtest.userclientspringbootstarter.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/internal")
public class InternalController {

    private final UserClientApi userClientApi;

    public InternalController(UserClientApi userClientApi) {
        this.userClientApi = userClientApi;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsersByCountry(@RequestParam String country) {
        return userClientApi.getUsersByCountry(country);
    }
}
