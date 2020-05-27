package com.touchdreams.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinyh on 2020-5-14.
 */
@RestController
@RequestMapping("/xss")
public class XSSController {

    @RequestMapping("/test")
    public Map<String, String> test(HttpServletRequest request) {
        String param = request.getParameter("param");
        Map<String, String> result = new HashMap<>();
        result.put("code", "success");
        result.put("param", param);
        return result;
    }
}
