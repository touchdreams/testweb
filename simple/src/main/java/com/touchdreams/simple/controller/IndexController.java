package com.touchdreams.simple.controller;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jinyh on 2020-3-5.
 */
@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("basicauth")
    public void getBasicAuth(){

        String user = "111";
        String password = "66666";
        String userMsg = user + ":" + password;
        String base64UserMsg = Base64.encodeBase64String(userMsg.getBytes());
        System.out.println();
        System.out.println(base64UserMsg);

        String url = "http://host:port/api";
        String postBody = "data";

        HttpHeaders headers = new HttpHeaders();
        headers.add("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; Trident/7.0; rv:11.0) like Gecko");
        headers.add("Authorization ", base64UserMsg);
        HttpEntity<String> entity = new HttpEntity<String>(postBody, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);

        System.out.println(response.getBody());

    }
}
