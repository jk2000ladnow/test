package com.jason.xmlDateBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
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
@XmlRootElement(name = "EmpList")
public class DataList implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The data. */
    @XmlElementRef
    public List<? extends XmlDataBean> data = new ArrayList<>();

    /** The Nums. */
    @XmlAttribute(name = "Count")
    public String Nums;

    /**
     * Gets the data.
     * 
     * @return the data
     */
    public List<? extends XmlDataBean> getData() {
        return data;
    }

    /**
     * Sets the data.
     * 
     * @param data
     *            the new data
     */
    public void setData(List<? extends XmlDataBean> data) {
        setNums(String.valueOf(data.size()));
        this.data = data;
    }

    /**
     * Gets the nums.
     * 
     * @return the nums
     */
    public String getNums() {
        return Nums;
    }

    /**
     * Sets the nums.
     * 
     * @param nums
     *            the new nums
     */
    public void setNums(String nums) {
        Nums = nums;
    }

}