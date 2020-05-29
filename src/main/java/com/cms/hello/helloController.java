package com.cms.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    private HelloWord hello;

    public helloController(HelloWord hello) {
        this.hello = hello;
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return hello.hellotest();
    }

}
