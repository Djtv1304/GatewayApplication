package com.example.OrderGatewayApplication.Controller;

import com.example.OrderGatewayApplication.Service.Login.LoginServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginServiceClient loginServiceClient;

    @PostMapping("/login")
    public boolean login(@RequestBody Map<String, String> body) {

        // Si es diferente de null se devuelve true
        return loginServiceClient.login(body);

    }

}
