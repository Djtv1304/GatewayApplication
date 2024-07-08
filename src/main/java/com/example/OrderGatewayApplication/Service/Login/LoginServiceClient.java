package com.example.OrderGatewayApplication.Service.Login;

import com.example.OrderGatewayApplication.Document.Login.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "login-service", url = "http://localhost:8093")
public interface LoginServiceClient {

    @PostMapping("/login")
    Boolean login(@RequestBody Map<String, String> body);

}
