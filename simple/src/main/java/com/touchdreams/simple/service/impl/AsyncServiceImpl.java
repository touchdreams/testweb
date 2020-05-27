package com.touchdreams.simple.service.impl;

import com.touchdreams.simple.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by jinyh on 2020-5-27.
 */
@Service
public class AsyncServiceImpl implements AsyncService {

    @Async
    @Override
    public void test() {
        System.out.println("进入异步service方法");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("退出异步service方法");
    }
}
