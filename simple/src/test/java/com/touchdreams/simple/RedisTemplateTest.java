package com.touchdreams.simple;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * redis测试类
 * Created by jyh on 2020/11/15.
 */
public class RedisTemplateTest extends SimpleApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void getExpireTest() throws Exception {
        String key = "key-a";
        redisTemplate.opsForValue().set(key, "a", 1, TimeUnit.MINUTES);
        while (true) {
            System.out.println("超时时间: " + redisTemplate.getExpire(key));
            Thread.sleep(1000);
        }
    }

    @Test
    public void ListOperations() throws Exception {
        //1、通过redisTemplate设置值
        redisTemplate.boundListOps("listKey").leftPush("listLeftValue1");
        redisTemplate.boundListOps("listKey").leftPush("listRightValue2");

        //2、通过BoundValueOperations设置值
        BoundListOperations listKey = redisTemplate.boundListOps("listKey");
        listKey.leftPush("listLeftValue3");
        listKey.leftPush("listRightValue4");

        //3、通过ValueOperations设置值
        ListOperations opsList = redisTemplate.opsForList();
        opsList.leftPush("listKey", "listLeftValue5");
        opsList.leftPush("listKey", "listRightValue6");

        List<String> list = listKey.range(0, 100);
        for (String s : list) {
            System.out.println(s);
        }
        listKey.rightPop();
        list = opsList.range("listKey", 0, 100);
        for (String s : list) {
            System.out.println(s);
        }
        redisTemplate.delete("listKey");
    }

    @Test
    public void ListOperations1() throws Exception {
        BoundListOperations listKey = redisTemplate.boundListOps("listKey");
        for (int i = 0; i < 100; i++) {
            listKey.leftPush("value_" + i);
            if (listKey.size() > 10) {
                listKey.rightPop();
            }
        }
        for (Object o : listKey.range(0, 100)) {
            System.out.println(o);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("index: "+i+" |value: "+listKey.index(i));
        }
        redisTemplate.delete("listKey");

    }


}
