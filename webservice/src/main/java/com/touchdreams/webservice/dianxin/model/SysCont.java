package com.touchdreams.webservice.dianxin.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

/**
 * Created by jinyh on 2020-6-15.
 */
@JacksonXmlRootElement(localName = "syscont")
public class SysCont implements Serializable {

    private static final long serialVersionUID = 4142453860473509915L;
    @JacksonXmlProperty(localName = "appkey")
    private String appKey;

    @JacksonXmlProperty(localName = "method")
    private String method;

    @JacksonXmlProperty(localName = "sysid")
    private String sysid;

    @JacksonXmlProperty(localName = "subchannelcode")
    private String subChannelCode;

    @JacksonXmlProperty(localName = "transactionid")
    private String transactionId;

    @JacksonXmlProperty(localName = "reqtime")
    private String reqTime;

    @JacksonXmlProperty(localName = "sign")
    private String sign;

    @JacksonXmlProperty(localName = "version")
    private String version;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }

    public String getSubChannelCode() {
        return subChannelCode;
    }

    public void setSubChannelCode(String subChannelCode) {
        this.subChannelCode = subChannelCode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
