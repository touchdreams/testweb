package com.touchdreams.simple;

import com.touchdreams.simple.service.SimpleService;
import com.touchdreams.simple.service.impl.SimpleServiceImpl;
import com.touchdreams.simple.service.impl.SimpleServiceImpl1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jyh on 2021/5/13.
 */
public class SimpleServiceTest extends SimpleApplicationTests {

//    @Autowired
    private SimpleService simpleService;
    @Autowired
    private SimpleServiceImpl simpleServiceImplA;
    @Autowired
    private SimpleServiceImpl simpleServiceImplB;
    @Autowired
    private SimpleServiceImpl1 simpleServiceImpl1;

    @Test
    public void test(){
        System.out.println("----------------");
    }

}
