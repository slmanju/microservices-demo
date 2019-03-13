package com.slmanju.microservices.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Value("${msg:Hello world - Config Server is not working..pelase check}")
    private String msg;

    @GetMapping(value = { "", "/" })
    String getMsg() {
        return this.msg;
    }

}
