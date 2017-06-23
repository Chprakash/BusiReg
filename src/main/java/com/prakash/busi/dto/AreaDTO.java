package com.prakash.busi.dto;

public class AreaDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long areaid;
	private Long zipId;
	private String areaname;
	private long status;
	
	public Long getAreaid() {
		return areaid;
	}
	public void setAreaid(Long areaid) {
		this.areaid = areaid;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	public Long getZipId() {
		return zipId;
	}
	public void setZipId(Long zipId) {
		this.zipId = zipId;
	}
	
	
}
