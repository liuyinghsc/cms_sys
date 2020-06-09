package com.cms.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SignController {
    @Autowired
    private SignService signService;

    @PostMapping("/sign")
    public User sign(@RequestBody User user){
        return signService.register(user);
    }

//登陆
    @PostMapping("/login")
    public String login(){
//        User user1 = Optional.ofNullable(user).map(signService::getPassword).orElse(null);
//        return (user1.getPassword().equals(user.getPassword())?"Login success":"Login failed");
        return "basic ok";
    }



}
