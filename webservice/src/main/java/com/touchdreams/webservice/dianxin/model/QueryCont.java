package com.touchdreams.webservice.dianxin.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

/**
 * Created by jinyh on 2020-6-15.
 */
@JacksonXmlRootElement(localName = "querycont")
public class QueryCont implements Serializable {

    private static final long serialVersionUID = -8654872242774639620L;

    @JacksonXmlProperty(localName = "networkncard")
    private String networkNcard;

    public String getNetworkNcard() {
        return networkNcard;
    }

    public void setNetworkNcard(String networkNcard) {
        this.networkNcard = networkNcard;
    }
}
