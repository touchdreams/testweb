package com.touchdreams.simple.resttemplate;

import com.touchdreams.simple.SimpleApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jinyh on 2020-3-5.
 */
public class RestTemplateTest extends SimpleApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test(){

        String str = restTemplate.getForObject("https://www.baidu.com",String.class);
        System.out.println(str);
    }
}
