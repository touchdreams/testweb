package com.touchdreams.simple.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by jyh on 2020/5/11.
 */
@RestController
@RequestMapping("/performanceTest")
public class performanceTestController {

    private AtomicInteger threads = new AtomicInteger();

    @RequestMapping("/test1")
    public Map<String, String> test1() {
        threads.incrementAndGet();
        System.out.println("tomcat 线程数：" + threads);
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<String, String> result = new HashMap<>();
        result.put("code", "success");
        return result;
    }

}
