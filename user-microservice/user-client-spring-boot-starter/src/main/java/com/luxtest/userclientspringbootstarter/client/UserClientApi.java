package com.luxtest.userclientspringbootstarter.client;

import com.luxtest.userclientspringbootstarter.api.UserApi;
import com.luxtest.userclientspringbootstarter.client.fallback.UserClientApiFallback;
import com.luxtest.userclientspringbootstarter.model.User;
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
public interface UserClientApi extends UserApi<User> {

    @GetMapping
    ResponseEntity<List<User>> getUsersByCountry(@RequestParam String country);
}
