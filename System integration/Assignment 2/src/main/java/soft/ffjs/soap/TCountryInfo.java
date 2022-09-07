/**
 * TCountryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soft.ffjs.soap;

public class TCountryInfo  implements java.io.Serializable {
    private java.lang.String sISOCode;

    private java.lang.String sName;

    private java.lang.String sCapitalCity;

    private java.lang.String sPhoneCode;

    private java.lang.String sContinentCode;

    private java.lang.String sCurrencyISOCode;

    private java.lang.String sCountryFlag;

    private soft.ffjs.soap.TLanguage[] languages;

    public TCountryInfo() {
    }

    public TCountryInfo(
           java.lang.String sISOCode,
           java.lang.String sName,
           java.lang.String sCapitalCity,
           java.lang.String sPhoneCode,
           java.lang.String sContinentCode,
           java.lang.String sCurrencyISOCode,
           java.lang.String sCountryFlag,
           soft.ffjs.soap.TLanguage[] languages) {
           this.sISOCode = sISOCode;
           this.sName = sName;
           this.sCapitalCity = sCapitalCity;
           this.sPhoneCode = sPhoneCode;
           this.sContinentCode = sContinentCode;
           this.sCurrencyISOCode = sCurrencyISOCode;
           this.sCountryFlag = sCountryFlag;
           this.languages = languages;
    }


    /**
     * Gets the sISOCode value for this TCountryInfo.
     * 
     * @return sISOCode
     */
    public java.lang.String getSISOCode() {
        return sISOCode;
    }


    /**
     * Sets the sISOCode value for this TCountryInfo.
     * 
     * @param sISOCode
     */
    public void setSISOCode(java.lang.String sISOCode) {
        this.sISOCode = sISOCode;
    }


    /**
     * Gets the sName value for this TCountryInfo.
     * 
     * @return sName
     */
    public java.lang.String getSName() {
        return sName;
    }


    /**
     * Sets the sName value for this TCountryInfo.
     * 
     * @param sName
     */
    public void setSName(java.lang.String sName) {
        this.sName = sName;
    }


    /**
     * Gets the sCapitalCity value for this TCountryInfo.
     * 
     * @return sCapitalCity
     */
    public java.lang.String getSCapitalCity() {
        return sCapitalCity;
    }


    /**
     * Sets the sCapitalCity value for this TCountryInfo.
     * 
     * @param sCapitalCity
     */
    public void setSCapitalCity(java.lang.String sCapitalCity) {
        this.sCapitalCity = sCapitalCity;
    }


    /**
     * Gets the sPhoneCode value for this TCountryInfo.
     * 
     * @return sPhoneCode
     */
    public java.lang.String getSPhoneCode() {
        return sPhoneCode;
    }


    /**
     * Sets the sPhoneCode value for this TCountryInfo.
     * 
     * @param sPhoneCode
     */
    public void setSPhoneCode(java.lang.String sPhoneCode) {
        this.sPhoneCode = sPhoneCode;
    }


    /**
     * Gets the sContinentCode value for this TCountryInfo.
     * 
     * @return sContinentCode
     */
    public java.lang.String getSContinentCode() {
        return sContinentCode;
    }


    /**
     * Sets the sContinentCode value for this TCountryInfo.
     * 
     * @param sContinentCode
     */
    public void setSContinentCode(java.lang.String sContinentCode) {
        this.sContinentCode = sContinentCode;
    }


    /**
     * Gets the sCurrencyISOCode value for this TCountryInfo.
     * 
     * @return sCurrencyISOCode
     */
    public java.lang.String getSCurrencyISOCode() {
        return sCurrencyISOCode;
    }


    /**
     * Sets the sCurrencyISOCode value for this TCountryInfo.
     * 
     * @param sCurrencyISOCode
     */
    public void setSCurrencyISOCode(java.lang.String sCurrencyISOCode) {
        this.sCurrencyISOCode = sCurrencyISOCode;
    }


    /**
     * Gets the sCountryFlag value for this TCountryInfo.
     * 
     * @return sCountryFlag
     */
    public java.lang.String getSCountryFlag() {
        return sCountryFlag;
    }


    /**
     * Sets the sCountryFlag value for this TCountryInfo.
     * 
     * @param sCountryFlag
     */
    public void setSCountryFlag(java.lang.String sCountryFlag) {
        this.sCountryFlag = sCountryFlag;
    }


    /**
     * Gets the languages value for this TCountryInfo.
     * 
     * @return languages
     */
    public soft.ffjs.soap.TLanguage[] getLanguages() {
        return languages;
    }


    /**
     * Sets the languages value for this TCountryInfo.
     * 
     * @param languages
     */
    public void setLanguages(soft.ffjs.soap.TLanguage[] languages) {
        this.languages = languages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCountryInfo)) return false;
        TCountryInfo other = (TCountryInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sISOCode==null && other.getSISOCode()==null) || 
             (this.sISOCode!=null &&
              this.sISOCode.equals(other.getSISOCode()))) &&
            ((this.sName==null && other.getSName()==null) || 
             (this.sName!=null &&
              this.sName.equals(other.getSName()))) &&
            ((this.sCapitalCity==null && other.getSCapitalCity()==null) || 
             (this.sCapitalCity!=null &&
              this.sCapitalCity.equals(other.getSCapitalCity()))) &&
            ((this.sPhoneCode==null && other.getSPhoneCode()==null) || 
             (this.sPhoneCode!=null &&
              this.sPhoneCode.equals(other.getSPhoneCode()))) &&
            ((this.sContinentCode==null && other.getSContinentCode()==null) || 
             (this.sContinentCode!=null &&
              this.sContinentCode.equals(other.getSContinentCode()))) &&
            ((this.sCurrencyISOCode==null && other.getSCurrencyISOCode()==null) || 
             (this.sCurrencyISOCode!=null &&
              this.sCurrencyISOCode.equals(other.getSCurrencyISOCode()))) &&
            ((this.sCountryFlag==null && other.getSCountryFlag()==null) || 
             (this.sCountryFlag!=null &&
              this.sCountryFlag.equals(other.getSCountryFlag()))) &&
            ((this.languages==null && other.getLanguages()==null) || 
             (this.languages!=null &&
              java.util.Arrays.equals(this.languages, other.getLanguages())));
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
        if (getSISOCode() != null) {
            _hashCode += getSISOCode().hashCode();
        }
        if (getSName() != null) {
            _hashCode += getSName().hashCode();
        }
        if (getSCapitalCity() != null) {
            _hashCode += getSCapitalCity().hashCode();
        }
        if (getSPhoneCode() != null) {
            _hashCode += getSPhoneCode().hashCode();
        }
        if (getSContinentCode() != null) {
            _hashCode += getSContinentCode().hashCode();
        }
        if (getSCurrencyISOCode() != null) {
            _hashCode += getSCurrencyISOCode().hashCode();
        }
        if (getSCountryFlag() != null) {
            _hashCode += getSCountryFlag().hashCode();
        }
        if (getLanguages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguages(), i);
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
        new org.apache.axis.description.TypeDesc(TCountryInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tCountryInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SISOCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sISOCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCapitalCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCapitalCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPhoneCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sPhoneCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SContinentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sContinentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCurrencyISOCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCurrencyISOCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCountryFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "sCountryFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "Languages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tLanguage"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.oorsprong.org/websamples.countryinfo", "tLanguage"));
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
