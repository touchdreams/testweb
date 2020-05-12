package com.touchdreams.simple.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/**
 * Created by jyh on 2020/5/12.
 */
@RestController
@RequestMapping("/redisLock")
public class RedisLockController {

    @Autowired
    private RedisLockRegistry redisLockRegistry;

    @RequestMapping("/test")
    public Map<String, String> test1() {
        Lock lock = redisLockRegistry.obtain("REDIS_LOCK_KEY");
        try {
            if (lock.tryLock()) {
                System.out.println(Thread.currentThread().getName() + "获取到锁------------");
                Thread.sleep(5000);
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + "释放锁");
            } else {
                System.out.println(Thread.currentThread().getName() + "未获取到锁");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           /*xif(lock != null){
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + "释放锁");
            }*/
        }
        Map<String, String> result = new HashMap<>();
        result.put("code", "success");
        return result;
    }
}
