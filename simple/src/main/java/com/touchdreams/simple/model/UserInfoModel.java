package com.touchdreams.simple.model;

/**
 * Created by jinyh on 2020-6-3.
 */
public class UserInfoModel{

    private static final long serialVersionUID = -8557494440073414920L;
    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
