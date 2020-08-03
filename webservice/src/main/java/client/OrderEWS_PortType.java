/**
 * OrderEWS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public interface OrderEWS_PortType extends java.rmi.Remote {
    public String gztCheck(String requestXml) throws java.rmi.RemoteException;
    public String orderSync(String requestXml) throws java.rmi.RemoteException;
    public String broadBandCallback(String requestXml) throws java.rmi.RemoteException;
    public String routeQuery(String requestXml) throws java.rmi.RemoteException;
    public String accountCancelCheck(String requestXml) throws java.rmi.RemoteException;
    public String activatecards_2(String requestXml) throws java.rmi.RemoteException;
    public String queryAccnbrAscription(String requestXml) throws java.rmi.RemoteException;
    public String activatecardsUpdate(String requestXml) throws java.rmi.RemoteException;
    public String doJdCallBack(client.CallFuncInfoA callFuncInfoA, String orderId, String phone, String cmtId,
                               String bookTime) throws java.rmi.RemoteException;
    public String doJdfetchPhoto(client.CallFuncInfoA callFuncInfoA, String orderId, long seqId) throws java.rmi.RemoteException;
    public long doTbFetchPhoto(client.CallFuncInfoA callFuncInfoA, String orderId, String index) throws java.rmi.RemoteException;
    public String doActivityRecord(String requestXml) throws java.rmi.RemoteException;
    public String addActivityRecord(String requestXml) throws java.rmi.RemoteException;
    public String queryAddressAscription(String requestXml) throws java.rmi.RemoteException;
    public String activatecardsQuery(String requestXml) throws java.rmi.RemoteException;
    public String applyBuizCallback(String requestXml) throws java.rmi.RemoteException;
    public String bwtYxIntSenceList(String requestXml) throws java.rmi.RemoteException;
    public String checkOfferDetail(String requestXml) throws java.rmi.RemoteException;
    public String checkFraudInvolvedReport(String requestXml) throws java.rmi.RemoteException;
    public String factorOrderQuery(String requestXml) throws java.rmi.RemoteException;
    public String intentionGather(String requestXml) throws java.rmi.RemoteException;
    public String queryIdcardAscription(String requestXml) throws java.rmi.RemoteException;
    public String installDeliveryQuery(String requestXml) throws java.rmi.RemoteException;
    public String installDeliveryUpdate(String requestXml) throws java.rmi.RemoteException;
    public String makeupActivateInfoCheck(String requestXml) throws java.rmi.RemoteException;
    public String makeupActivateInfo(String requestXml) throws java.rmi.RemoteException;
    public String queryactivitylist(String requestXml) throws java.rmi.RemoteException;
    public String httpInterfaceOfGet(String requestXml) throws java.rmi.RemoteException;
    public String orderlist(String requestXml) throws java.rmi.RemoteException;
    public String orderqueryall(String requestXml) throws java.rmi.RemoteException;
    public String offlineOrderCallback(String requestXml) throws java.rmi.RemoteException;
    public String orderquerysimple(String requestXml) throws java.rmi.RemoteException;
    public String orderAndBossIdentical(String requestXml) throws java.rmi.RemoteException;
    public String queryusercard(String requestXml) throws java.rmi.RemoteException;
    public String syncRefundStatus(String requestXml) throws java.rmi.RemoteException;
    public String queryActivityConfig(String requestXml) throws java.rmi.RemoteException;
    public String syncPayInfo(String requestXml) throws java.rmi.RemoteException;
    public String robotOrderCallback(String requestXml) throws java.rmi.RemoteException;
    public String scanOrderQuery(String requestXml) throws java.rmi.RemoteException;
    public String syncPaymentRecord(String requestXml) throws java.rmi.RemoteException;
    public String smsordersend(String requestXml) throws java.rmi.RemoteException;
    public String activatecards(String requestXml) throws java.rmi.RemoteException;
    public String orderync(String requestXml) throws java.rmi.RemoteException;
    public String orderupdate(String requestXml) throws java.rmi.RemoteException;
    public String ordervalidate(String requestXml) throws java.rmi.RemoteException;
    public String checkActivateVCard(String requestXml) throws java.rmi.RemoteException;
    public byte[] doJtFetchPhoto(client.CallFuncInfoA callFuncInfoA, String url, String type) throws java.rmi.RemoteException;
    public String completeSms(String requestXml) throws java.rmi.RemoteException;
    public String completeCallbackSms(String requestXml) throws java.rmi.RemoteException;
    public String checkKDPayRecord(String requestXml) throws java.rmi.RemoteException;
    public String idCardUrlQuery(String requestXml) throws java.rmi.RemoteException;
    public String idCardUrlUpload(String requestXml) throws java.rmi.RemoteException;
    public String qryOfferDetailList(String requestXml) throws java.rmi.RemoteException;
}
