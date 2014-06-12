
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TechnologyTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TechnologyTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILE_LINE_ITEM_CONTAINS_WEB_TECH_CRITERIA"/>
 *     &lt;enumeration value="WEB_LINE_ITEM_CONTAINS_MOBILE_TECH_CRITERIA"/>
 *     &lt;enumeration value="MOBILE_CARRIER_TARGETING_FEATURE_NOT_ENABLED"/>
 *     &lt;enumeration value="DEVICE_CAPABILITY_TARGETING_FEATURE_NOT_ENABLED"/>
 *     &lt;enumeration value="DEVICE_CATEGORY_TARGETING_FEATURE_NOT_ENABLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TechnologyTargetingError.Reason")
@XmlEnum
public enum TechnologyTargetingErrorReason {


    /**
     * 
     *                 Mobile line item cannot target web-only targeting criteria.
     *               
     * 
     */
    MOBILE_LINE_ITEM_CONTAINS_WEB_TECH_CRITERIA,

    /**
     * 
     *                 Web line item cannot target mobile-only targeting criteria.
     *               
     * 
     */
    WEB_LINE_ITEM_CONTAINS_MOBILE_TECH_CRITERIA,

    /**
     * 
     *                 The mobile carrier targeting feature is not enabled.
     *               
     * 
     */
    MOBILE_CARRIER_TARGETING_FEATURE_NOT_ENABLED,

    /**
     * 
     *                 The device capability targeting feature is not enabled.
     *               
     * 
     */
    DEVICE_CAPABILITY_TARGETING_FEATURE_NOT_ENABLED,

    /**
     * 
     *                 The device category targeting feature is not enabled.
     *               
     * 
     */
    DEVICE_CATEGORY_TARGETING_FEATURE_NOT_ENABLED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static TechnologyTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
