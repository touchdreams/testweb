package com.touchdreams.webservice.dianxin.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

/**
 * Created by jinyh on 2020-6-15.
 */
@JacksonXmlRootElement(localName = "checkcont")
public class CheckCont implements Serializable {

    private static final long serialVersionUID = -8654872242774639620L;

    @JacksonXmlProperty(localName = "username")
    private String userName;

    @JacksonXmlProperty(localName = "cardno")
    private String cardNo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
