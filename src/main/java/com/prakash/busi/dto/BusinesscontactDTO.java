package com.prakash.busi.dto;
// default package
// Generated Feb 18, 2017 7:48:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BusinesscontactDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long contactid;
	private Long businesssrcID;
	private Long phoneNo;
	private Long countryCode;
	private Long mobileNo1;
	private Long mobileNo2;
	private Long landLineNo;
	private String emailId1;
	private String emailId2;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm a z",timezone="IST")
	private Date createdDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm a z",timezone="IST")
	private Date lastUpdateddate;
	private Long createdBy;
	private Long updatedBy;
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
	
	public Long getBusinesssrcID() {
		return businesssrcID;
	}
	public void setBusinesssrcID(Long businesssrcID) {
		this.businesssrcID = businesssrcID;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Long countryCode) {
		this.countryCode = countryCode;
	}
	public Long getMobileNo1() {
		return mobileNo1;
	}
	public void setMobileNo1(Long mobileNo1) {
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
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Long getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(Long updatedBy) {
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
