package com.jason.xmlDateBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


// TODO: Auto-generated Javadoc
/**
 * 程式資訊摘要：
 * 類別名稱　　：
 * 程式內容說明：
 * 程式修改記錄：.
 *
 * @author 
 * @version 2.0
 * @since 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Emp")
public class EmpXmlDataBean extends XmlDataBean {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    @XmlAttribute(name = "SerialNumber")
    private String serialNumber = null;
    
    @XmlAttribute(name = "Action")
    private String action;
    
    /** The emp id. */
    @XmlTransient
    private String empId = null;

    /** The unit name. */
    @XmlElement(name = "Department")
    private String unitName = null;

    /** The unit code. */
    @XmlElement(name = "DepartCode")
    private String unitCode = null;

    /** The emp name. */
    @XmlElement(name = "UserName")
    private String empName = null;

    /** The id no. */
    @XmlElement(name = "IdcardNo")
    private String idNo = null;

    /** The user id. */
    @XmlElement(name = "UserAccount", defaultValue = "")
    private String userId = null;

    /** The tel number. */
    @XmlElement(name = "TelephoneNumber")
    private String telNumber = null;

    /** The mail. */
    @XmlElement(name = "Mail")
    private String mail = "";

    /** The job status. */
    @XmlElement(name = "JobStatus")
    private String jobStatus = null;

    /** The leave date. */
    @XmlElement(name = "LeaveDate")
    private String leaveDate = null;

    /** The in date. */
    @XmlElement(name = "InDate")
    private String inDate = null;

    /** The title. */
    @XmlElement(name = "Position")
    private String title = null;

    /** The emp kind. */
    @XmlElement(name = "Epkind")
    private String empKind = null;

    /** The up uid. */
    @XmlElement(name = "UpuId")
    private String upUid = null;

    @XmlTransient
    private String createTime = null;
    
    /**
     * Gets the unit name.
     *
     * @return the unit name
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the unit name.
     *
     * @param unitName the new unit name
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * Gets the unit code.
     *
     * @return the unit code
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the unit code.
     *
     * @param unitCode the new unit code
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    /**
     * Gets the emp name.
     *
     * @return the emp name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets the emp name.
     *
     * @param empName the new emp name
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * Gets the id no.
     *
     * @return the id no
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the id no.
     *
     * @param idNo the new id no
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    /**
     * Gets the user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     *
     * @param userId the new user id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the tel number.
     *
     * @return the tel number
     */
    public String getTelNumber() {
        if (null != telNumber) {
            telNumber = "02-2763-1833#" + telNumber;
        }
        return telNumber;
    }

    /**
     * Sets the tel number.
     *
     * @param telNumber the new tel number
     */
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    /**
     * Gets the mail.
     *
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the mail.
     *
     * @param mail the new mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Gets the job status.
     *
     * @return the job status
     */
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * Sets the job status.
     *
     * @param jobStatus the new job status
     */
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * Gets the title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     *
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the emp kind.
     *
     * @return the emp kind
     */
    public String getEmpKind() {
        return empKind;
    }

    /**
     * Sets the emp kind.
     *
     * @param empKind the new emp kind
     */
    public void setEmpKind(String empKind) {
        this.empKind = empKind;
    }

    /**
     * Gets the up uid.
     *
     * @return the up uid
     */
    public String getUpUid() {
        return upUid;
    }

    /**
     * Sets the up uid.
     *
     * @param upUid the new up uid
     */
    public void setUpUid(String upUid) {
        this.upUid = upUid;
    }


    /**
     * Gets the leave date.
     *
     * @return the leave date
     */
    public String getLeaveDate() {
        return leaveDate;
    }

    /**
     * Sets the leave date.
     *
     * @param leaveDate the new leave date
     */
    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    /**
     * Gets the in date.
     *
     * @return the in date
     */
    public String getInDate() {
        return inDate;
    }

    /**
     * Sets the in date.
     *
     * @param inDate the new in date
     */
    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    /**
     * Gets the emp id.
     *
     * @return the emp id
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the emp id.
     *
     * @param empId the new emp id
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    /**
     * Gets the serial number.
     *
     * @return the serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number.
     *
     * @param serialNumber the new serial number
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Gets the creates the time.
     *
     * @return the creates the time
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Sets the creates the time.
     *
     * @param createTime the new creates the time
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Gets the action.
     *
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action.
     *
     * @param action the new action
     */
    public void setAction(String action) {
        this.action = action;
    }
}
