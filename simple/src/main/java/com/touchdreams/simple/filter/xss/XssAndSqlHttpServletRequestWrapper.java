package com.touchdreams.simple.filter.xss;

import org.apache.commons.text.StringEscapeUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 防止XSS攻击
 * Created by jinyh on 2020-5-14.
 */
public class XssAndSqlHttpServletRequestWrapper extends HttpServletRequestWrapper {
    private HttpServletRequest request;
    public XssAndSqlHttpServletRequestWrapper(HttpServletRequest request) {
        super(request);
        this.request = request;
    }
    @Override
    public String getParameter(String name) {
        String value = request.getParameter(name);
        if (!StringUtils.isEmpty(value)) {
            value = StringEscapeUtils.escapeEcmaScript(value);
        }
        return value;
    }
    @Override
    public String[] getParameterValues(String name) {
        String[] parameterValues = super.getParameterValues(name);
        if (parameterValues == null) {
            return null;
        }
        for (int i = 0; i < parameterValues.length; i++) {
            String value = parameterValues[i];
            parameterValues[i] = StringEscapeUtils.escapeEcmaScript(value);
        }
        return parameterValues;
    }
}