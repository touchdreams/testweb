package com.touchdreams.simple.controller;

import com.touchdreams.simple.service.AsyncService;
import com.touchdreams.simple.utils.FutureResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
        Future<String> future = asyncService.asyncFutureMethod();
        LOGGER.info("4");
//        String result = future.get();
        String result = FutureResultUtils.get(future);

        Future<String> future1 = asyncService.asyncFutureMethod();
        LOGGER.info("5");
//        String result = future.get();
        String result1 = FutureResultUtils.get(future1);
        LOGGER.info("result={},costtime={}", result,
                System.currentTimeMillis()-start);
        return result == null?"fail":result;
    }

    @RequestMapping("/asyncFutureMethodWithTimeout")
    public String asyncFutureMethodWithTimeout() throws Exception {
        long start = System.currentTimeMillis();
        LOGGER.info("1");
        Future<String> future = asyncService.asyncFutureMethod();
        LOGGER.info("4");

        try {
            String result = future.get(1, TimeUnit.SECONDS);
            LOGGER.info("result={},costtime={}", result,
                    System.currentTimeMillis()-start);
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        return "TimeoutException";
    }


}
