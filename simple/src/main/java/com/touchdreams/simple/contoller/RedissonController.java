package com.touchdreams.simple.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jyh on 2020/5/12.
 */
@RestController
@RequestMapping("/redisson")
public class RedissonController {

    @RequestMapping("/test")
    public Map<String, String> test1() {
        Map<String, String> result = new HashMap<>();
        result.put("code", "success");
        return result;
    }
}
