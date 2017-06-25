package com.prakash.busi.dto;


public class BusinessTypeDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long busitypeid;
	private String description;
	private String busiType;
	
	public String getBusiType() {
		return busiType;
	}
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getBusitypeid() {
		return busitypeid;
	}
	public void setBusitypeid(Long busitypeid) {
		this.busitypeid = busitypeid;
	}
}
