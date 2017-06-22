package com.prakash.busi.dto;

import java.util.Date;

import com.prakash.busi.model.LZipcode;

public class AreaDTO implements java.io.Serializable {
	private Long areaid;
	//private LZipcode LZipcode;
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
	
	
}
