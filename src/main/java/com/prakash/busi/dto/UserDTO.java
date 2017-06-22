package com.prakash.busi.dto;
// default package
// Generated Feb 18, 2017 7:48:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

public class UserDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final Long serialVersionUID = 1L;
	private Long id;
	private String emailId;
	private String password;
	private Date createdDate;
	private Date lastUpdatedDate;
	private Long createdBy;
	private Long updatedBy;
	private Boolean active;
	private String previousPassword;
	private Boolean locked;
	private Date lastPasswordChangedOn;
	private Long roleId;
	private Date dob;
	private Set<AddressesDTO> addresseses = new HashSet<AddressesDTO>(0);
	private Set<BusinesssrcDTO> businesssrcs = new HashSet<BusinesssrcDTO>(0);
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
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
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getPreviousPassword() {
		return previousPassword;
	}
	public void setPreviousPassword(String previousPassword) {
		this.previousPassword = previousPassword;
	}
	public Boolean getLocked() {
		return locked;
	}
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	public Date getLastPasswordChangedOn() {
		return lastPasswordChangedOn;
	}
	public void setLastPasswordChangedOn(Date lastPasswordChangedOn) {
		this.lastPasswordChangedOn = lastPasswordChangedOn;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Set<AddressesDTO> getAddresseses() {
		return addresseses;
	}
	public void setAddresseses(Set<AddressesDTO> addresseses) {
		this.addresseses = addresseses;
	}
	public Set<BusinesssrcDTO> getBusinesssrcs() {
		return businesssrcs;
	}
	public void setBusinesssrcs(Set<BusinesssrcDTO> businesssrcs) {
		this.businesssrcs = businesssrcs;
	}

	
}
