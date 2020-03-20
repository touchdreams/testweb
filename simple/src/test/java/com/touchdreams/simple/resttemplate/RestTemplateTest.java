package com.touchdreams.simple.resttemplate;

import com.alibaba.fastjson.JSON;
import com.touchdreams.simple.SimpleApplicationTests;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

/**
 * Created by jinyh on 2020-3-5.
 */
public class RestTemplateTest extends SimpleApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateTest.class);

    @Autowired
    private RestTemplate restTemplate;

    private String url = "https://shell-dev.capture.cn.janrain.biz";

    /**
     * 获取用户token 即登录
     */
    @Test
    public void getAccessToken() {

        String user = "2u3prjqk8t8n99enbdegvh4sw8356d8n";
        String password = "etdufmb3e48y8p585sgh3gqyabegb6ht";
        String userMsg = user + ":" + password;
        String base64UserMsg = Base64.getEncoder().encodeToString(userMsg.getBytes());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + base64UserMsg);

        MultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("uuid", "c982e674-f4a8-4ac3-a892-44a1ef88a727");
        param.add("type_name", "user");

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(param, headers);
        long start = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = restTemplate.exchange(url + "/access/getAccessToken", HttpMethod.POST
                , entity,
                String.class);
        LOGGER.info("调用接口耗时={}ms",System.currentTimeMillis()-start);
        LOGGER.info(JSON.toJSONString(responseEntity));
        LOGGER.info(responseEntity.getBody());
    }


    /**
     * 获取用户信息
     */
    @Test
    public void entity() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        headers.add(HttpHeaders.AUTHORIZATION, "OAuth kzvkr9gm72a5ug45");

        MultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("attributes", "[\"primaryAddress\",\"uuid\"]");

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(param, headers);
        long start = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = restTemplate.exchange(url + "/entity", HttpMethod.POST
                , entity,
                String.class);
        LOGGER.info("调用接口耗时={}ms",System.currentTimeMillis()-start);
        LOGGER.info(JSON.toJSONString(responseEntity));
        LOGGER.info(responseEntity.getBody());
    }
}
