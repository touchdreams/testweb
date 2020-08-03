package com.touchdreams.simple.service;

import java.util.concurrent.Future;

/**
 * Created by jinyh on 2020-5-27.
 */
public interface AsyncService {

    void test();

    /**
     * 描述：普通的方法
     * @return
     */
    String commMethod();

    /**
     * 描述：使用  @Async 实现异步调用
     * @return
     */
    String asyncMethod();

    /**
     * 描述：使用 Callable 实现异步调用
     * @return
     */
    String callableMethod();

    /**
     * 描述：使用  @Async 实现异步调用
     * @return
     */
    Future<String> asyncFutureMethod();

    /**
     * 描述：使用  @Async 实现异步调用
     * @return
     */
    Future<String> asyncFutureMethod1();
}
