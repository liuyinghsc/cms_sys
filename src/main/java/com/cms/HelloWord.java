package com.cms;

import org.springframework.stereotype.Component;

import java.sql.Time;
import java.util.Date;

@Component
public class HelloWord {

    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String hellotest(){
//        Date date = new Date();
//        return date.toString();
        String s = "hellonewdate";
        return s;
    }

}
