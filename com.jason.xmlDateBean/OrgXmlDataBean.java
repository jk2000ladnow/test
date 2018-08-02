package com.jason.xmlDateBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * 程式資訊摘要： 類別名稱　　： 程式內容說明： 程式修改記錄：.
 * 
 * @author
 * @version 2.0
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Org")
public class OrgXmlDataBean {

    /** The organizational name. */
    @XmlElement(name = "OrgName")
    private String organizationalName;

    /** The organizational code. */
    @XmlElement(name = "OrgID")
    private String organizationalCode;

    /**
     * Instantiates a new org xml data bean.
     */
    public OrgXmlDataBean() {

    };

    /**
     * Instantiates a new org xml data bean.
     * 
     * @param organizationalName
     *            the organizational name
     * @param organizationalCode
     *            the organizational code
     */
    public OrgXmlDataBean(String organizationalName, String organizationalCode) {
        this.organizationalName = organizationalName;
        this.organizationalCode = organizationalCode;
    };

    /**
     * Gets the organizational name.
     * 
     * @return the organizational name
     */
    public String getOrganizationalName() {
        return organizationalName;
    }

    /**
     * Sets the organizational name.
     * 
     * @param organizationalName
     *            the new organizational name
     */
    public void setOrganizationalName(String organizationalName) {
        this.organizationalName = organizationalName;
    }

    /**
     * Gets the organizational code.
     * 
     * @return the organizational code
     */
    public String getOrganizationalCode() {
        return organizationalCode;
    }

    /**
     * Sets the organizational code.
     * 
     * @param organizationalCode
     *            the new organizational code
     */
    public void setOrganizationalCode(String organizationalCode) {
        this.organizationalCode = organizationalCode;
    }

}
