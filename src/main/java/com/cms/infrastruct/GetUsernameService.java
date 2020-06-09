package com.cms.infrastruct;

import com.cms.login.SignRepository;
import com.cms.login.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Service
public class GetUsernameService implements UserDetailsService {

    @Autowired
    private SignRepository signRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = signRepository.findByName(username);
        org.springframework.security.core.userdetails.User user1 = new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(), new ArrayList<>());
        return user1;
    }
}
