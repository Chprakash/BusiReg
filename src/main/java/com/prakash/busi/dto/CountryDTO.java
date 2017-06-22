package com.prakash.busi.dto;


public class CountryDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long countryid;
	private String countryname;
	private long status;
	public Long getCountryid() {
		return countryid;
	}
	public void setCountryid(Long countryid) {
		this.countryid = countryid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		
}
