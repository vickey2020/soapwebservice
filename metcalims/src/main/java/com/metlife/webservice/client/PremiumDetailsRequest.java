
package com.metlife.webservice.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premium_no" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "premiumNo"
})
@XmlRootElement(name = "PremiumDetailsRequest")
public class PremiumDetailsRequest {

    @XmlElement(name = "premium_no", required = true)
    protected String premiumNo;

    /**
     * Gets the value of the premiumNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPremiumNo() {
        return premiumNo;
    }

    /**
     * Sets the value of the premiumNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPremiumNo(String value) {
        this.premiumNo = value;
    }

}
