package com.touchdreams.simple.controller;

import com.touchdreams.simple.model.UserInfoModel;
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

    @RequestMapping("/query1")
    public UserInfoModel query1() throws Exception {
        UserInfoModel userInfoModel = new UserInfoModel();
        userInfoModel.setName("name");
        userInfoModel.setPhoneNumber("1234567890");
        return userInfoModel;
    }
}
