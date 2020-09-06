package com.touchdreams.webservice.simple;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by jinyh on 2020-6-11.
 */
@WebService
public class JwsServiceHello {
    /** 供客户端调用方法  该方法是非静态的，会被发布
     * @param name  传入参数
     * @return String 返回结果
     * */
    public String getValue(String name){
        return "欢迎你！ "+name;
    }

    /**
     * 方法上加@WebMentod(exclude=true)后，此方法不被发布；
     * @param name
     * @return
     */
    @WebMethod(exclude=true)
    public String getHello(String name){
        return "你好！ "+name;
    }

    /** 静态方法不会被发布
     * @param name
     * @return
     */
    public static String getString(String name){
        return "再见！"+name;
    }


    //通过EndPoint(端点服务)发布一个WebService
    public static void main(String[] args) {
     /*参数:1,本地的服务地址;
           2,提供服务的类;
      */
        Endpoint.publish("http://172.30.83.135:8080/Service/ServiceHello", new JwsServiceHello());
        System.out.println("发布成功!");
        //发布成功后 在浏览器输入 http://192.168.1.105:8080/Service/ServiceHello?wsdl
    }
}
