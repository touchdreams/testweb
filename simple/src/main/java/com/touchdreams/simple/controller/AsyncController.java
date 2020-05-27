package com.touchdreams.simple.controller;

import com.touchdreams.simple.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinyh on 2020-5-14.
 */
@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @RequestMapping("/test")
    public Map<String, String> test(HttpServletRequest request) {
        System.out.println("进入异步controller方法");
        String param = request.getParameter("param");
        Map<String, String> result = new HashMap<>();
        result.put("code", "success");
        result.put("param", param);
        asyncService.test();
        System.out.println("退出异步controller方法");
        return result;
    }
}
