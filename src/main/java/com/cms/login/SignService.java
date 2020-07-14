package com.cms.login;

import com.cms.login.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignService  {

    @Autowired
    private SignRepository signRepository;

    public User register(User user){
        return signRepository.save(user);
    }

    public User getPassword(User user){
        return signRepository.findByName(user.getName());

    }
}
