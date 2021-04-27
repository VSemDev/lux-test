package com.luxtest.userclientspringbootstarter.client.fallback;

import com.luxtest.userclientspringbootstarter.client.UserClientApi;
import com.luxtest.userclientspringbootstarter.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserClientApiFallback implements UserClientApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserClientApiFallback.class);

    private static final String USER_MICROSERVICE_NOT_RESPONDING = "User microservice not responding.....";

    @Override
    public ResponseEntity<List<User>> getUsersByCountry(String country) {
        LOGGER.error(USER_MICROSERVICE_NOT_RESPONDING);
        return new ResponseEntity<>(Collections.emptyList(), HttpStatus.SERVICE_UNAVAILABLE);
    }
}
