package com.touchdreams.simple.service.impl;

import com.touchdreams.simple.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by jinyh on 2020-5-27.
 */
@Service
public class AsyncServiceImpl implements AsyncService {

    Logger LOGGER = LoggerFactory.getLogger(AsyncServiceImpl.class);

    private static final String result = "SUCCUSS";	//返回结果

    @Async("asyncTaskExecutor")
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

    @Override
    public String commMethod() {

        LOGGER.info("2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("3");

        return result;
    }

    @Override
    @Async("asyncTaskExecutor")
    public String asyncMethod() {

        LOGGER.info("2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("3");

        return result;
    }

    @Override
    public String callableMethod() {

        class MyCallable implements Callable<String> {
            @Override
            public String call() throws Exception {

                LOGGER.info("2");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LOGGER.info("3");

                return result;
            }
        }

        ExecutorService pool = Executors.newFixedThreadPool(1);
        Future<String> submit = pool.submit(new MyCallable());
        String result = null;

        if(submit.isDone()) {
            try {
                result = submit.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // 关闭线程池
        pool.shutdown();

        return result;
    }

    /**
     * 描述：使用  @Async 实现异步调用
     *
     * @return
     */
    @Override
    @Async("asyncTaskExecutor")
    public Future<String> asyncFutureMethod() {
        LOGGER.info("asyncFutureMethod-2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("asyncFutureMethod-3");

        return new AsyncResult<>(result);
    }

    /**
     * 描述：使用  @Async 实现异步调用
     *
     * @return
     */
    @Override
    @Async("asyncTaskExecutor")
    public Future<String> asyncFutureMethod1() {
        LOGGER.info("asyncFutureMethod1-2");

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("asyncFutureMethod1-3");

        return new AsyncResult<>(result);
    }
}
