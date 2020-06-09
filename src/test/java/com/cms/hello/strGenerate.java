package com.cms.hello;

import java.util.Random;

public class strGenerate {
    public String generateStr(){
        Random random = new Random();
        int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
        String result = String.valueOf((char)(random.nextInt(26)+temp));
        return result;
    }
}
