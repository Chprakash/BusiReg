package com.prakash.busi.dto;
// default package
// Generated Feb 18, 2017 7:48:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

public class BusinesscontactDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long contactid;
	private BusinesssrcDTO businesssrc;
	private Long phoneNo;
	private long countryCode;
	private long mobileNo1;
	private Long mobileNo2;
	private Long landLineNo;
	private String emailId1;
	private String emailId2;
	private Date createdDate;
	private Date lastUpdateddate;
	private long createdBy;
	private long updatedBy;
	private Long areaCode;
	private String contactPersonFName;
	private String contactPersonMName;
	private String contactPersonLName;
	
	public Long getContactid() {
		return contactid;
	}
	public void setContactid(Long contactid) {
		this.contactid = contactid;
	}
	public BusinesssrcDTO getBusinesssrc() {
		return businesssrc;
	}
	public void setBusinesssrc(BusinesssrcDTO businesssrc) {
		this.businesssrc = businesssrc;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(long countryCode) {
		this.countryCode = countryCode;
	}
	public long getMobileNo1() {
		return mobileNo1;
	}
	public void setMobileNo1(long mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}
	public Long getMobileNo2() {
		return mobileNo2;
	}
	public void setMobileNo2(Long mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}
	public Long getLandLineNo() {
		return landLineNo;
	}
	public void setLandLineNo(Long landLineNo) {
		this.landLineNo = landLineNo;
	}
	public String getEmailId1() {
		return emailId1;
	}
	public void setEmailId1(String emailId1) {
		this.emailId1 = emailId1;
	}
	public String getEmailId2() {
		return emailId2;
	}
	public void setEmailId2(String emailId2) {
		this.emailId2 = emailId2;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdateddate() {
		return lastUpdateddate;
	}
	public void setLastUpdateddate(Date lastUpdateddate) {
		this.lastUpdateddate = lastUpdateddate;
	}
	public long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}
	public long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Long getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(Long areaCode) {
		this.areaCode = areaCode;
	}
	public String getContactPersonFName() {
		return contactPersonFName;
	}
	public void setContactPersonFName(String contactPersonFName) {
		this.contactPersonFName = contactPersonFName;
	}
	public String getContactPersonMName() {
		return contactPersonMName;
	}
	public void setContactPersonMName(String contactPersonMName) {
		this.contactPersonMName = contactPersonMName;
	}
	public String getContactPersonLName() {
		return contactPersonLName;
	}
	public void setContactPersonLName(String contactPersonLName) {
		this.contactPersonLName = contactPersonLName;
	}

	
}
