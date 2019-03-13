package com.slmanju.microservices.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

}

@RestController
class MessageRestController {

    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @GetMapping(value = { "", "/" })
    String getMsg() {
        return this.msg;
    }

}
