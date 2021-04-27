package com.luxtest.userclientspringbootstarter.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserApi<E> {

    ResponseEntity<List<E>> getUsersByCountry(@RequestParam String country);
}
