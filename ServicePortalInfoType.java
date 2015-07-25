/**
 * ServicePortalInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */
package BusinessManagementClient;

public class ServicePortalInfoType  implements java.io.Serializable {
    private java.lang.String serviceId;

    private java.lang.String position;

    private BusinessManagementClient.ServiceOperationType[] serviceOperationList;

    public ServicePortalInfoType() {
    }

    public ServicePortalInfoType(
           java.lang.String serviceId,
           java.lang.String position,
           BusinessManagementClient.ServiceOperationType[] serviceOperationList) {
           this.serviceId = serviceId;
           this.position = position;
           this.serviceOperationList = serviceOperationList;
    }


    /**
     * Gets the serviceId value for this ServicePortalInfoType.
     * 
     * @return serviceId
     */
    public java.lang.String getServiceId() {
        return serviceId;
    }


    /**
     * Sets the serviceId value for this ServicePortalInfoType.
     * 
     * @param serviceId
     */
    public void setServiceId(java.lang.String serviceId) {
        this.serviceId = serviceId;
    }


    /**
     * Gets the position value for this ServicePortalInfoType.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this ServicePortalInfoType.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }


    /**
     * Gets the serviceOperationList value for this ServicePortalInfoType.
     * 
     * @return serviceOperationList
     */
    public BusinessManagementClient.ServiceOperationType[] getServiceOperationList() {
        return serviceOperationList;
    }


    /**
     * Sets the serviceOperationList value for this ServicePortalInfoType.
     * 
     * @param serviceOperationList
     */
    public void setServiceOperationList(BusinessManagementClient.ServiceOperationType[] serviceOperationList) {
        this.serviceOperationList = serviceOperationList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServicePortalInfoType)) return false;
        ServicePortalInfoType other = (ServicePortalInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceId==null && other.getServiceId()==null) || 
             (this.serviceId!=null &&
              this.serviceId.equals(other.getServiceId()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.serviceOperationList==null && other.getServiceOperationList()==null) || 
             (this.serviceOperationList!=null &&
              java.util.Arrays.equals(this.serviceOperationList, other.getServiceOperationList())));
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
        if (getServiceId() != null) {
            _hashCode += getServiceId().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getServiceOperationList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceOperationList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceOperationList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServicePortalInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "ServicePortalInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "serviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceOperationList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "serviceOperationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "ServiceOperationType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "serviceOperation"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
