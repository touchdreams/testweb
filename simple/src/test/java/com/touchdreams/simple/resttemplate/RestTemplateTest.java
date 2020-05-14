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
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Base64;

/**
 * Created by jinyh on 2020-3-5.
 */
public class RestTemplateTest extends SimpleApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestTemplateTest.class);

    @Autowired
    private RestTemplate restTemplate;

    //url
    private String url = "https://shell-dev.capture.cn.janrain.biz";
    //client id
    private String user = "2u3prjqk8t8n99enbdegvh4sw8356d8n";
    //client secret
    private String password = "etdufmb3e48y8p585sgh3gqyabegb6ht";
    //会员uuid
    private String uuid = "c982e674-f4a8-4ac3-a892-44a1ef88a727";


    /**
     * 获取用户token 即登录
     */
    @Test
    public void getAccessToken() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + getBasicAuthorization());

        MultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("uuid", uuid);
        param.add("type_name", "user");
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(null, headers);
        long start = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = restTemplate.exchange(getUriWithEncode(url + "/access/getAccessToken"
                , param), HttpMethod.GET
                , entity,
                String.class);
        LOGGER.info("调用接口耗时={}ms", System.currentTimeMillis() - start);
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

        headers.add(HttpHeaders.AUTHORIZATION, "OAuth hj892eag8m88wsd6");

        MultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("attributes", "[\"primaryAddress\",\"uuid\"]");


        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(param, headers);
        long start = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = restTemplate.exchange(url + "/entity", HttpMethod.POST, entity,
                String.class);
        LOGGER.info("调用接口耗时={}ms", System.currentTimeMillis() - start);
        LOGGER.info(JSON.toJSONString(responseEntity));
        LOGGER.info(responseEntity.getBody());
    }

    /**
     * 通过手机号获取用户信息
     */
    @Test
    public void entityByPhone() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + getBasicAuthorization());

        MultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("key_attribute", "primaryAddress.mobile");
        param.add("key_value", "13572146989");
        param.add("type_name", "user");
        param.add("attributes", "[\"primaryAddress\",\"uuid\"]");

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(param, headers);
        long start = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = restTemplate.exchange(url + "/entity", HttpMethod.POST
                , entity,
                String.class);
        LOGGER.info("调用接口耗时={}ms", System.currentTimeMillis() - start);
        LOGGER.info(JSON.toJSONString(responseEntity));
        LOGGER.info(responseEntity.getBody());
    }


    /**
     * 获取用户授权code
     */
    @Test
    public void getAuthorizationCode() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + getBasicAuthorization());

        MultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("uuid", uuid);
        param.add("type_name", "user");
        param.add("redirect_uri", "https://www.baidu.com");

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(null, headers);
        long start = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = restTemplate.exchange(getUriWithEncode(url + "/access/getAuthorizationCode"
                , param),
                HttpMethod.GET
                , entity,
                String.class);
        LOGGER.info("调用接口耗时={}ms", System.currentTimeMillis() - start);
        LOGGER.info(JSON.toJSONString(responseEntity));
        LOGGER.info(responseEntity.getBody());
    }


    /**
     * 通过用户授权code获取token
     */
    @Test
    public void token() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + getBasicAuthorization());

        MultiValueMap<String, String> param = new LinkedMultiValueMap();
        param.add("grant_type", "authorization_code");
        param.add("code", "fypmfued7bt9zf");
        param.add("redirect_uri", "https://www.baidu.com");
//        param.add("for_client_id", "");

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(null, headers);
        long start = System.currentTimeMillis();
        ResponseEntity<String> responseEntity = restTemplate.exchange(getUriWithEncode(url + "/oauth/token"
                , param),
                HttpMethod.GET
                , entity,
                String.class);
        LOGGER.info("调用接口耗时={}ms", System.currentTimeMillis() - start);
        LOGGER.info(JSON.toJSONString(responseEntity));
        LOGGER.info(responseEntity.getBody());
    }


    /**
     * 获取basic授权信息
     *
     * @return
     */
    private String getBasicAuthorization() {
        String userMsg = user + ":" + password;
        return Base64.getEncoder().encodeToString(userMsg.getBytes());
    }

    /**
     * 获取basic授权信息
     *
     * @return
     */
    private String getUriWithEncode(String uri, MultiValueMap<String, String> param) {
        return UriComponentsBuilder.fromUriString(uri).queryParams(param).build().encode().toString();
    }


    @Test
    public void urlParam() {
        System.out.println(UriComponentsBuilder.fromUriString("https://example.com?email=john.doe@email.com").queryParam("name", "哈哈").build().encode().toString());
    }
}
