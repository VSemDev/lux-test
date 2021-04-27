package com.luxtest.userclientspringbootstarter;

import com.luxtest.userclientspringbootstarter.client.UserClientApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConditionalOnClass(UserClientApi.class)
@EnableCircuitBreaker
@EnableFeignClients
@ComponentScan
@PropertySource(value = "classpath:/config/feign-clients-conf.properties")
public class UserClientAutoConfiguration {
}
