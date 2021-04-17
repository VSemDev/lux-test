package com.luxtest.userapispringbootstarter.api;

import com.luxtest.userapispringbootstarter.api.fallback.UserClientApiFallback;
import com.luxtest.userapispringbootstarter.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(
        url = "${user.feign.client.url}",
        name = "${user.feign.client.name}",
        fallback = UserClientApiFallback.class
)
@Primary
public interface UserClientApi {

    @GetMapping
    ResponseEntity<List<User>> getUsersByCountry(@RequestParam String country);
}
