package com.touchdreams.simple.controller;

import com.touchdreams.simple.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by jinyh on 2020-5-14.
 */
@RestController
@RequestMapping("/async")
public class AsyncController {

    Logger LOGGER = LoggerFactory.getLogger(AsyncController.class);
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

    @RequestMapping("/commMethod")
    public String commMethod() {
        LOGGER.info("1");
        String result = asyncService.commMethod();
        LOGGER.info("4");

        return result;
    }

    @RequestMapping("/asyncMethod")
    public String asyncMethod() {
        LOGGER.info("1");
        String result = asyncService.asyncMethod();
        LOGGER.info("4");

        return result;
    }

    @RequestMapping("/callableMethod")
    public String callableMethod() {
        LOGGER.info("1");
        String result = asyncService.callableMethod();
        LOGGER.info("4");

        return result;
    }


    @RequestMapping("/asyncFutureMethod")
    public String asyncFutureMethod() throws Exception {
        long start = System.currentTimeMillis();
        LOGGER.info("1");
        Future<String> result = asyncService.asyncFutureMethod();
        Future<String> result1 = asyncService.asyncFutureMethod1();
        LOGGER.info("4");
        LOGGER.info("result={},result1={},costtime={}", result.get(), result1.get(),System.currentTimeMillis()-start);
        return result.get();
    }


}
