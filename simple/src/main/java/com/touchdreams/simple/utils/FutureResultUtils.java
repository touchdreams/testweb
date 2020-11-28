package com.touchdreams.simple.utils;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * futureResult工具类
 * Created by jinyh on 2020-11-27.
 */
public class FutureResultUtils {

    /**
     *
     * @param future
     * @param <T>
     * @return
     */
    public static <T> T get(Future<T> future){
        try {
            return future.get(2, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
