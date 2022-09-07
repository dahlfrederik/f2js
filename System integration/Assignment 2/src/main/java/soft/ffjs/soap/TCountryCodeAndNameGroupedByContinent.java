/**
 * TCountryCodeAndNameGroupedByContinent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soft.ffjs.soap;

public class TCountryCodeAndNameGroupedByContinent  implements java.io.Serializable {
    private soft.ffjs.soap.TContinent continent;

    private soft.ffjs.soap.TCountryCodeAndName[] countryCodeAndNames;

    public TCountryCodeAndNameGroupedByContinent() {
    }

    public TCountryCodeAndNameGroupedByContinent(
           soft.ffjs.soap.TContinent continent,
           soft.ffjs.soap.TCountryCodeAndName[] countryCodeAndNames) {
           this.continent = continent;
           this.countryCodeAndNames = countryCodeAndNames;
    }


    /**
     * Gets the continent value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @return continent
     */
    public soft.ffjs.soap.TContinent getContinent() {
        return continent;
    }


    /**
     * Sets the continent value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @param continent
     */
    public void setContinent(soft.ffjs.soap.TContinent continent) {
        this.continent = continent;
    }


    /**
     * Gets the countryCodeAndNames value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @return countryCodeAndNames
     */
    public soft.ffjs.soap.TCountryCodeAndName[] getCountryCodeAndNames() {
        return countryCodeAndNames;
    }


    /**
     * Sets the countryCodeAndNames value for this TCountryCodeAndNameGroupedByContinent.
     * 
     * @param countryCodeAndNames
     */
    public void setCountryCodeAndNames(soft.ffjs.soap.TCountryCodeAndName[] countryCodeAndNames) {
        this.countryCodeAndNames = countryCodeAndNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCountryCodeAndNameGroupedByContinent)) return false;
        TCountryCodeAndNameGroupedByContinent other = (TCountryCodeAndNameGroupedByContinent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.continent==null && other.getContinent()==null) || 
             (this.continent!=null &&
              this.continent.equals(other.getContinent()))) &&
            ((this.countryCodeAndNames==null && other.getCountryCodeAndNames()==null) || 
             (this.countryCodeAndNames!=null &&
              java.util.Arrays.equals(this.countryCodeAndNames, other.getCountryCodeAndNames())));
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
        if (getContinent() != null) {
            _hashCode += getContinent().hashCode();
        }
        if (getCountryCodeAndNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryCodeAndNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryCodeAndNames(), i);
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
        new org.apache.axis.description.TypeDesc(TCountryCodeAndNameGroupedByContinent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndNameGroupedByContinent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "Continent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tContinent"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCodeAndNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "CountryCodeAndNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndName"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryCodeAndName"));
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
