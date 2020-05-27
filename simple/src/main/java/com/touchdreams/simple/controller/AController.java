package com.touchdreams.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jyh on 2020/3/20.
 */
@RestController
public class AController {

    @RequestMapping("/query")
    public void query() throws Exception {
        System.out.println("AContoller query...");
    }
}
