
package com.google.api.ads.dfp.jaxws.v201405;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link BaseRate} objects.
 *             
 *             @param baseRates the base rates to be updated
 *             @return the updated base rates
 *           
 * 
 * <p>Java class for updateBaseRates element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateBaseRates">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="baseRates" type="{https://www.google.com/apis/ads/publisher/v201405}BaseRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baseRates"
})
@XmlRootElement(name = "updateBaseRates")
public class BaseRateServiceInterfaceupdateBaseRates {

    protected List<BaseRate> baseRates;

    /**
     * Gets the value of the baseRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseRate }
     * 
     * 
     */
    public List<BaseRate> getBaseRates() {
        if (baseRates == null) {
            baseRates = new ArrayList<BaseRate>();
        }
        return this.baseRates;
    }

}
