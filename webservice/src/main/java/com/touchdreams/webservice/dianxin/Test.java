package com.touchdreams.webservice.dianxin;

import client.OrderEWSServiceLocator;
import client.OrderEWS_PortType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.touchdreams.webservice.dianxin.model.CheckCont;
import com.touchdreams.webservice.dianxin.model.QueryCont;
import com.touchdreams.webservice.dianxin.model.SysCont;
import com.touchdreams.webservice.dianxin.model.TreatyRoot;

/**
 * Created by jinyh on 2020-6-12.
 */
public class Test {
    private static OrderEWS_PortType client;


    public static void main(String[] args) throws Exception {

        TreatyRoot treatyRoot = new TreatyRoot();
        SysCont sysCont = new SysCont();
        sysCont.setAppKey("2302638124");
        sysCont.setSysid("100882");
        sysCont.setSubChannelCode("900052141008821338");
        sysCont.setTransactionId("10005201407312341720003");
        sysCont.setReqTime("20120320103324");
        sysCont.setVersion("1.0");
        treatyRoot.setSysCont(sysCont);
        client = new OrderEWSServiceLocator().getOrderEWS();
        //国政通身份证校验接口
        treatyRoot.getSysCont().setMethod("gztCheck");
        treatyRoot.getSysCont().setSign(EThreeDES.getEncoder(getEncryptionSign(treatyRoot)));
        gztCheck(treatyRoot);
        //
        /*treatyRoot.getSysCont().setMethod("queryusercard");
        treatyRoot.getSysCont().setSign(EThreeDES.getEncoder(getEncryptionSign(treatyRoot)));
        queryusercard(treatyRoot);*/
    }

    /**
     * 79.	国政通身份证校验接口
     */
    private static void gztCheck(TreatyRoot treatyRoot) throws Exception {

        CheckCont checkCont = new CheckCont();
        checkCont.setUserName("缪妮莺");
        checkCont.setCardNo("110229199409020294");
        treatyRoot.setCheckCont(checkCont);
        String param = getXmlString(treatyRoot);
        System.out.println("param----------------------------------" + param);
        String result = client.gztCheck(param);
        System.out.println(result);
    }

    /**
     * 17.	用户办理号卡订单数查询接口
     */
    private static void queryusercard(TreatyRoot treatyRoot) throws Exception {
        QueryCont queryCont = new QueryCont();
        treatyRoot.setQueryCont(queryCont);
        queryCont.setNetworkNcard("110229199409020294");
        String param = getXmlString(treatyRoot);
        System.out.println("param----------------------------------" + param);

        String result = client.queryusercard(param);
        System.out.println(result);
    }


    /**
     * @return
     */
    private static String getXmlString(TreatyRoot treatyRoot) throws Exception {
        ObjectMapper xmlMapper = new XmlMapper();
        xmlMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        xmlMapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        xmlMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        xmlMapper.enable(MapperFeature.USE_STD_BEAN_NAMING);
        return xmlMapper.writeValueAsString(treatyRoot);
    }


    private static String getEncryptionSign(TreatyRoot treatyRoot) {
        //appKey+method+sysid+subchannelcode+transactionid+reqtime+version
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(treatyRoot.getSysCont().getAppKey());
        stringBuilder.append(treatyRoot.getSysCont().getMethod());
        stringBuilder.append(treatyRoot.getSysCont().getSysid());
        stringBuilder.append(treatyRoot.getSysCont().getSubChannelCode());
        stringBuilder.append(treatyRoot.getSysCont().getTransactionId());
        stringBuilder.append(treatyRoot.getSysCont().getReqTime());
        stringBuilder.append(treatyRoot.getSysCont().getVersion());
        return stringBuilder.toString();
    }
}
