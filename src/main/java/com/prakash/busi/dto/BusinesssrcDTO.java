package com.prakash.busi.dto;
// default package
// Generated Feb 18, 2017 7:48:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class BusinesssrcDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long busiSrcId;
	private Long userId;
	private Long busiTypeid;
	private String busiName;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm a z",timezone="IST")
	private Date createddate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd hh:mm a z",timezone="IST")
	private Date lastupdateddate;
	private Long createdby;
	private Long updatedby;
	private Long acstatus;
	private String pancardNo;
	private String adharCardNo;
	
	public Long getBusiSrcId() {
		return busiSrcId;
	}
	public void setBusiSrcId(Long busiSrcId) {
		this.busiSrcId = busiSrcId;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBusiTypeid() {
		return busiTypeid;
	}
	public void setBusiTypeid(Long busiTypeid) {
		this.busiTypeid = busiTypeid;
	}
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
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
	public Long getAcstatus() {
		return acstatus;
	}
	public void setAcstatus(Long acstatus) {
		this.acstatus = acstatus;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
	public String getAdharCardNo() {
		return adharCardNo;
	}
	public void setAdharCardNo(String adharCardNo) {
		this.adharCardNo = adharCardNo;
	}
	
}
