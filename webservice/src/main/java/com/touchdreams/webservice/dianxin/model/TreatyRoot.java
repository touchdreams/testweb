package com.touchdreams.webservice.dianxin.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;

/**
 * Created by jinyh on 2020-6-15.
 */
@JacksonXmlRootElement(localName = "treatyroot")
public class TreatyRoot implements Serializable {

    private static final long serialVersionUID = 1929129607033311028L;
    @JacksonXmlProperty(localName = "syscont")
    private SysCont sysCont;

    @JacksonXmlProperty(localName = "checkcont")
    private CheckCont checkCont;

    @JacksonXmlProperty(localName = "querycont")
    private QueryCont queryCont;

    public SysCont getSysCont() {
        return sysCont;
    }

    public void setSysCont(SysCont sysCont) {
        this.sysCont = sysCont;
    }

    public CheckCont getCheckCont() {
        return checkCont;
    }

    public void setCheckCont(CheckCont checkCont) {
        this.checkCont = checkCont;
    }

    public QueryCont getQueryCont() {
        return queryCont;
    }

    public void setQueryCont(QueryCont queryCont) {
        this.queryCont = queryCont;
    }
}
