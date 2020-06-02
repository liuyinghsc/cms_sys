package com.cms.hello.login;

import org.springframework.aop.IntroductionAwareMethodMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.websocket.server.PathParam;

@RestController
public class SignController {
    @Autowired
    private SignRepository signRepository;

    @PostMapping("/sign")
    public User sign(@RequestBody User user){
        return signRepository.save(user);
    }

//登陆
//    @GetMapping("/login")
//    public String login(@RequestParam("name") String name, @RequestParam() String password){
//        User user = new User();
//        user.setName("admin");
//        user.setPassword("123");
//        if (name.equals(user.getName())&&password.equals(user.getPassword())){
//            return "login success";
//        }
//        return "name or password is not true";
//    }



}
