package com.cms;

import org.junit.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class helloTest {

    @Test
    public void helloDate(){
        assertEquals("hellonewdate","hellonewdate");
    }

    public static void main(String[] args) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(5);
        executor.initialize();

        executor.execute(() ->{
            for (int i = 0; i <2 ; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });

        executor.execute(() ->{
            for (int i = 0; i <4 ; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
    }

}
