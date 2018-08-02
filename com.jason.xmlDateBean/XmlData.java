package com.jason.xmlDateBean;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

// TODO: Auto-generated Javadoc
/**
 * 程式資訊摘要： 類別名稱　　： 程式內容說明： 程式修改記錄：.
 * 
 * @author
 * @version 2.0
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "XmlData")
public class XmlData {

    /** The org xml data bean. */
    @XmlElement(name = "Org")
    public OrgXmlDataBean orgXmlDataBean;

    /** The Data list. */
    @XmlElement(name = "EmpList")
    public DataList DataList = new DataList();

    /** The data name. */
    @XmlTransient
    public String dataName = "";

    /**
     * Instantiates a new xml data.
     */
    public XmlData() {

    }
    
    /**
     * Instantiates a new xml data.
     * 
     * @param xmlDataBeanlist
     *            the xml data beanlist
     */
    public XmlData(List<? extends XmlDataBean> xmlDataBeanlist) {
        try {
            String OrgId = "FDC";
            String OrgName = "財稅中心";
            OrgXmlDataBean orgXmlDataBean = new OrgXmlDataBean(OrgName, OrgId);
            this.setOrganization(orgXmlDataBean);
            this.getDataList().setData(xmlDataBeanlist);
            this.setDataName(xmlDataBeanlist.get(0).getClass().getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the organization.
     * 
     * @return the organization
     */
    public OrgXmlDataBean getOrganization() {
        return orgXmlDataBean;
    }

    /**
     * Sets the organization.
     * 
     * @param orgXmlDataBean
     *            the new organization
     */
    public void setOrganization(OrgXmlDataBean orgXmlDataBean) {
        this.orgXmlDataBean = orgXmlDataBean;
    }

    /**
     * Gets the data list.
     * 
     * @return the data list
     */
    public DataList getDataList() {
        return DataList;
    }

    /**
     * Sets the data list.
     * 
     * @param dataList
     *            the new data list
     */
    public void setDataList(DataList dataList) {
        DataList = dataList;
    }

    /**
     * Gets the data name.
     * 
     * @return the data name
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * Sets the data name.
     * 
     * @param dataName
     *            the new data name
     */
    public void setDataName(String dataName) {
        this.dataName = dataName;
    }
}
