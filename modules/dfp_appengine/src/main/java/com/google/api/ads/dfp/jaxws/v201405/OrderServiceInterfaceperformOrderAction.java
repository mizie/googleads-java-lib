
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link Order} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param orderAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of orders
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performOrderAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performOrderAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="orderAction" type="{https://www.google.com/apis/ads/publisher/v201405}OrderAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201405}Statement" minOccurs="0"/>
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
    "orderAction",
    "filterStatement"
})
@XmlRootElement(name = "performOrderAction")
public class OrderServiceInterfaceperformOrderAction {

    protected OrderAction orderAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the orderAction property.
     * 
     * @return
     *     possible object is
     *     {@link OrderAction }
     *     
     */
    public OrderAction getOrderAction() {
        return orderAction;
    }

    /**
     * Sets the value of the orderAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderAction }
     *     
     */
    public void setOrderAction(OrderAction value) {
        this.orderAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
