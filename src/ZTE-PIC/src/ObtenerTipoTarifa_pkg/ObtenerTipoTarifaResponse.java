/**
 * ObtenerTipoTarifaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ObtenerTipoTarifa_pkg;

public class ObtenerTipoTarifaResponse  implements java.io.Serializable {
    private ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP obtenerTipoTarifaReturn;

    public ObtenerTipoTarifaResponse() {
    }

    public ObtenerTipoTarifaResponse(
           ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP obtenerTipoTarifaReturn) {
           this.obtenerTipoTarifaReturn = obtenerTipoTarifaReturn;
    }


    /**
     * Gets the obtenerTipoTarifaReturn value for this ObtenerTipoTarifaResponse.
     * 
     * @return obtenerTipoTarifaReturn
     */
    public ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP getObtenerTipoTarifaReturn() {
        return obtenerTipoTarifaReturn;
    }


    /**
     * Sets the obtenerTipoTarifaReturn value for this ObtenerTipoTarifaResponse.
     * 
     * @param obtenerTipoTarifaReturn
     */
    public void setObtenerTipoTarifaReturn(ObtenerTipoTarifa_pkg.ObtenerTipoTarifaRP obtenerTipoTarifaReturn) {
        this.obtenerTipoTarifaReturn = obtenerTipoTarifaReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerTipoTarifaResponse)) return false;
        ObtenerTipoTarifaResponse other = (ObtenerTipoTarifaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.obtenerTipoTarifaReturn==null && other.getObtenerTipoTarifaReturn()==null) || 
             (this.obtenerTipoTarifaReturn!=null &&
              this.obtenerTipoTarifaReturn.equals(other.getObtenerTipoTarifaReturn())));
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
        if (getObtenerTipoTarifaReturn() != null) {
            _hashCode += getObtenerTipoTarifaReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerTipoTarifaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", ">ObtenerTipoTarifaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obtenerTipoTarifaReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "ObtenerTipoTarifaReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ObtenerTipoTarifa", "ObtenerTipoTarifaRP"));
        elemField.setNillable(false);
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