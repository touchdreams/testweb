/**
 * CallFuncInfoA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package client;

public class CallFuncInfoA  implements java.io.Serializable {
    private String funcCode;

    private String moduleCode;

    private Long moduleObjectId;

    private String moduleObjectName;

    private String serverAddess;

    private Long staffId;

    private String staffIp;

    private String staffName;

    private Long staffPartnerInfoId;

    private String staffPartnerInfoName;

    private Long staffPartnerInfoSeq;

    private Long staffSeq;

    private Object[] staffWorkflowGroupIds;

    private String uuid;

    public CallFuncInfoA() {
    }

    public CallFuncInfoA(
           String funcCode,
           String moduleCode,
           Long moduleObjectId,
           String moduleObjectName,
           String serverAddess,
           Long staffId,
           String staffIp,
           String staffName,
           Long staffPartnerInfoId,
           String staffPartnerInfoName,
           Long staffPartnerInfoSeq,
           Long staffSeq,
           Object[] staffWorkflowGroupIds,
           String uuid) {
           this.funcCode = funcCode;
           this.moduleCode = moduleCode;
           this.moduleObjectId = moduleObjectId;
           this.moduleObjectName = moduleObjectName;
           this.serverAddess = serverAddess;
           this.staffId = staffId;
           this.staffIp = staffIp;
           this.staffName = staffName;
           this.staffPartnerInfoId = staffPartnerInfoId;
           this.staffPartnerInfoName = staffPartnerInfoName;
           this.staffPartnerInfoSeq = staffPartnerInfoSeq;
           this.staffSeq = staffSeq;
           this.staffWorkflowGroupIds = staffWorkflowGroupIds;
           this.uuid = uuid;
    }


    /**
     * Gets the funcCode value for this CallFuncInfoA.
     *
     * @return funcCode
     */
    public String getFuncCode() {
        return funcCode;
    }


    /**
     * Sets the funcCode value for this CallFuncInfoA.
     *
     * @param funcCode
     */
    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }


    /**
     * Gets the moduleCode value for this CallFuncInfoA.
     *
     * @return moduleCode
     */
    public String getModuleCode() {
        return moduleCode;
    }


    /**
     * Sets the moduleCode value for this CallFuncInfoA.
     *
     * @param moduleCode
     */
    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }


    /**
     * Gets the moduleObjectId value for this CallFuncInfoA.
     *
     * @return moduleObjectId
     */
    public Long getModuleObjectId() {
        return moduleObjectId;
    }


    /**
     * Sets the moduleObjectId value for this CallFuncInfoA.
     *
     * @param moduleObjectId
     */
    public void setModuleObjectId(Long moduleObjectId) {
        this.moduleObjectId = moduleObjectId;
    }


    /**
     * Gets the moduleObjectName value for this CallFuncInfoA.
     *
     * @return moduleObjectName
     */
    public String getModuleObjectName() {
        return moduleObjectName;
    }


    /**
     * Sets the moduleObjectName value for this CallFuncInfoA.
     *
     * @param moduleObjectName
     */
    public void setModuleObjectName(String moduleObjectName) {
        this.moduleObjectName = moduleObjectName;
    }


    /**
     * Gets the serverAddess value for this CallFuncInfoA.
     *
     * @return serverAddess
     */
    public String getServerAddess() {
        return serverAddess;
    }


    /**
     * Sets the serverAddess value for this CallFuncInfoA.
     *
     * @param serverAddess
     */
    public void setServerAddess(String serverAddess) {
        this.serverAddess = serverAddess;
    }


    /**
     * Gets the staffId value for this CallFuncInfoA.
     *
     * @return staffId
     */
    public Long getStaffId() {
        return staffId;
    }


    /**
     * Sets the staffId value for this CallFuncInfoA.
     *
     * @param staffId
     */
    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }


    /**
     * Gets the staffIp value for this CallFuncInfoA.
     *
     * @return staffIp
     */
    public String getStaffIp() {
        return staffIp;
    }


    /**
     * Sets the staffIp value for this CallFuncInfoA.
     *
     * @param staffIp
     */
    public void setStaffIp(String staffIp) {
        this.staffIp = staffIp;
    }


    /**
     * Gets the staffName value for this CallFuncInfoA.
     *
     * @return staffName
     */
    public String getStaffName() {
        return staffName;
    }


    /**
     * Sets the staffName value for this CallFuncInfoA.
     *
     * @param staffName
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }


    /**
     * Gets the staffPartnerInfoId value for this CallFuncInfoA.
     *
     * @return staffPartnerInfoId
     */
    public Long getStaffPartnerInfoId() {
        return staffPartnerInfoId;
    }


    /**
     * Sets the staffPartnerInfoId value for this CallFuncInfoA.
     *
     * @param staffPartnerInfoId
     */
    public void setStaffPartnerInfoId(Long staffPartnerInfoId) {
        this.staffPartnerInfoId = staffPartnerInfoId;
    }


    /**
     * Gets the staffPartnerInfoName value for this CallFuncInfoA.
     *
     * @return staffPartnerInfoName
     */
    public String getStaffPartnerInfoName() {
        return staffPartnerInfoName;
    }


    /**
     * Sets the staffPartnerInfoName value for this CallFuncInfoA.
     *
     * @param staffPartnerInfoName
     */
    public void setStaffPartnerInfoName(String staffPartnerInfoName) {
        this.staffPartnerInfoName = staffPartnerInfoName;
    }


    /**
     * Gets the staffPartnerInfoSeq value for this CallFuncInfoA.
     *
     * @return staffPartnerInfoSeq
     */
    public Long getStaffPartnerInfoSeq() {
        return staffPartnerInfoSeq;
    }


    /**
     * Sets the staffPartnerInfoSeq value for this CallFuncInfoA.
     *
     * @param staffPartnerInfoSeq
     */
    public void setStaffPartnerInfoSeq(Long staffPartnerInfoSeq) {
        this.staffPartnerInfoSeq = staffPartnerInfoSeq;
    }


    /**
     * Gets the staffSeq value for this CallFuncInfoA.
     *
     * @return staffSeq
     */
    public Long getStaffSeq() {
        return staffSeq;
    }


    /**
     * Sets the staffSeq value for this CallFuncInfoA.
     *
     * @param staffSeq
     */
    public void setStaffSeq(Long staffSeq) {
        this.staffSeq = staffSeq;
    }


    /**
     * Gets the staffWorkflowGroupIds value for this CallFuncInfoA.
     *
     * @return staffWorkflowGroupIds
     */
    public Object[] getStaffWorkflowGroupIds() {
        return staffWorkflowGroupIds;
    }


    /**
     * Sets the staffWorkflowGroupIds value for this CallFuncInfoA.
     *
     * @param staffWorkflowGroupIds
     */
    public void setStaffWorkflowGroupIds(Object[] staffWorkflowGroupIds) {
        this.staffWorkflowGroupIds = staffWorkflowGroupIds;
    }


    /**
     * Gets the uuid value for this CallFuncInfoA.
     *
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this CallFuncInfoA.
     *
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CallFuncInfoA)) return false;
        CallFuncInfoA other = (CallFuncInfoA) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.funcCode==null && other.getFuncCode()==null) ||
             (this.funcCode!=null &&
              this.funcCode.equals(other.getFuncCode()))) &&
            ((this.moduleCode==null && other.getModuleCode()==null) ||
             (this.moduleCode!=null &&
              this.moduleCode.equals(other.getModuleCode()))) &&
            ((this.moduleObjectId==null && other.getModuleObjectId()==null) ||
             (this.moduleObjectId!=null &&
              this.moduleObjectId.equals(other.getModuleObjectId()))) &&
            ((this.moduleObjectName==null && other.getModuleObjectName()==null) ||
             (this.moduleObjectName!=null &&
              this.moduleObjectName.equals(other.getModuleObjectName()))) &&
            ((this.serverAddess==null && other.getServerAddess()==null) ||
             (this.serverAddess!=null &&
              this.serverAddess.equals(other.getServerAddess()))) &&
            ((this.staffId==null && other.getStaffId()==null) ||
             (this.staffId!=null &&
              this.staffId.equals(other.getStaffId()))) &&
            ((this.staffIp==null && other.getStaffIp()==null) ||
             (this.staffIp!=null &&
              this.staffIp.equals(other.getStaffIp()))) &&
            ((this.staffName==null && other.getStaffName()==null) ||
             (this.staffName!=null &&
              this.staffName.equals(other.getStaffName()))) &&
            ((this.staffPartnerInfoId==null && other.getStaffPartnerInfoId()==null) ||
             (this.staffPartnerInfoId!=null &&
              this.staffPartnerInfoId.equals(other.getStaffPartnerInfoId()))) &&
            ((this.staffPartnerInfoName==null && other.getStaffPartnerInfoName()==null) ||
             (this.staffPartnerInfoName!=null &&
              this.staffPartnerInfoName.equals(other.getStaffPartnerInfoName()))) &&
            ((this.staffPartnerInfoSeq==null && other.getStaffPartnerInfoSeq()==null) ||
             (this.staffPartnerInfoSeq!=null &&
              this.staffPartnerInfoSeq.equals(other.getStaffPartnerInfoSeq()))) &&
            ((this.staffSeq==null && other.getStaffSeq()==null) ||
             (this.staffSeq!=null &&
              this.staffSeq.equals(other.getStaffSeq()))) &&
            ((this.staffWorkflowGroupIds==null && other.getStaffWorkflowGroupIds()==null) ||
             (this.staffWorkflowGroupIds!=null &&
              java.util.Arrays.equals(this.staffWorkflowGroupIds, other.getStaffWorkflowGroupIds()))) &&
            ((this.uuid==null && other.getUuid()==null) ||
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFuncCode() != null) {
            _hashCode += getFuncCode().hashCode();
        }
        if (getModuleCode() != null) {
            _hashCode += getModuleCode().hashCode();
        }
        if (getModuleObjectId() != null) {
            _hashCode += getModuleObjectId().hashCode();
        }
        if (getModuleObjectName() != null) {
            _hashCode += getModuleObjectName().hashCode();
        }
        if (getServerAddess() != null) {
            _hashCode += getServerAddess().hashCode();
        }
        if (getStaffId() != null) {
            _hashCode += getStaffId().hashCode();
        }
        if (getStaffIp() != null) {
            _hashCode += getStaffIp().hashCode();
        }
        if (getStaffName() != null) {
            _hashCode += getStaffName().hashCode();
        }
        if (getStaffPartnerInfoId() != null) {
            _hashCode += getStaffPartnerInfoId().hashCode();
        }
        if (getStaffPartnerInfoName() != null) {
            _hashCode += getStaffPartnerInfoName().hashCode();
        }
        if (getStaffPartnerInfoSeq() != null) {
            _hashCode += getStaffPartnerInfoSeq().hashCode();
        }
        if (getStaffSeq() != null) {
            _hashCode += getStaffSeq().hashCode();
        }
        if (getStaffWorkflowGroupIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaffWorkflowGroupIds());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStaffWorkflowGroupIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallFuncInfoA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BeanService", "CallFuncInfoA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "funcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleObjectId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleObjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduleObjectName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moduleObjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverAddess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverAddess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffPartnerInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffPartnerInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffPartnerInfoName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffPartnerInfoName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffPartnerInfoSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffPartnerInfoSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffSeq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffSeq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staffWorkflowGroupIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staffWorkflowGroupIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
