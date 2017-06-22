package com.prakash.busi.dto;
// default package
// Generated Feb 18, 2017 7:48:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AddressesDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long addressId;
	private Long cityId;
	private Long stateId;
	private Long userId;
	private Long areaId;
	private Long zipcodeId;
	private Long countryId;
	private String landmark;
	private String address;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm a z",timezone="IST")
	private Date createddate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm a z",timezone="IST")
	private Date lastupdateddate;
	private Long createdby;
	private Long updatedby;
	private Long status;
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public Long getStateId() {
		return stateId;
	}
	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAreaId() {
		return areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public Long getZipcodeId() {
		return zipcodeId;
	}
	public void setZipcodeId(Long zipcodeId) {
		this.zipcodeId = zipcodeId;
	}
	public Long getCountryId() {
		return countryId;
	}
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public Date getLastupdateddate() {
		return lastupdateddate;
	}
	public void setLastupdateddate(Date lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
	}
	public Long getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}
	public Long getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	
}
