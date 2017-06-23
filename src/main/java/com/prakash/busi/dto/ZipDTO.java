package com.prakash.busi.dto;


public class ZipDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long zipid;
	private Long zipcode;
	private Long cityId;
	private long status;
	
	public Long getZipid() {
		return zipid;
	}
	public void setZipid(Long zipid) {
		this.zipid = zipid;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	
	
}
