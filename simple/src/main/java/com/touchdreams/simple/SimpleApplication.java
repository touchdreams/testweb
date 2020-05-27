package com.touchdreams.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class SimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"mythread").start();
    }

}
