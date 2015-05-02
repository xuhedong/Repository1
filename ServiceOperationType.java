/**
 * ServiceOperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package BusinessManagementClient;

public class ServiceOperationType  implements java.io.Serializable {
    private java.lang.String operationName;

    private BusinessManagementClient.NameValuePairType[] operationParameters;

    public ServiceOperationType() {
    }

    public ServiceOperationType(
           java.lang.String operationName,
           BusinessManagementClient.NameValuePairType[] operationParameters) {
           this.operationName = operationName;
           this.operationParameters = operationParameters;
    }


    /**
     * Gets the operationName value for this ServiceOperationType.
     * 
     * @return operationName
     */
    public java.lang.String getOperationName() {
        return operationName;
    }


    /**
     * Sets the operationName value for this ServiceOperationType.
     * 
     * @param operationName
     */
    public void setOperationName(java.lang.String operationName) {
        this.operationName = operationName;
    }


    /**
     * Gets the operationParameters value for this ServiceOperationType.
     * 
     * @return operationParameters
     */
    public BusinessManagementClient.NameValuePairType[] getOperationParameters() {
        return operationParameters;
    }


    /**
     * Sets the operationParameters value for this ServiceOperationType.
     * 
     * @param operationParameters
     */
    public void setOperationParameters(BusinessManagementClient.NameValuePairType[] operationParameters) {
        this.operationParameters = operationParameters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceOperationType)) return false;
        ServiceOperationType other = (ServiceOperationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationName==null && other.getOperationName()==null) || 
             (this.operationName!=null &&
              this.operationName.equals(other.getOperationName()))) &&
            ((this.operationParameters==null && other.getOperationParameters()==null) || 
             (this.operationParameters!=null &&
              java.util.Arrays.equals(this.operationParameters, other.getOperationParameters())));
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
        if (getOperationName() != null) {
            _hashCode += getOperationName().hashCode();
        }
        if (getOperationParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperationParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperationParameters(), i);
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
        new org.apache.axis.description.TypeDesc(ServiceOperationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "ServiceOperationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "operationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "operationParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "NameValuePairType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.ws.zc/businessSchema/", "nvPair"));
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
