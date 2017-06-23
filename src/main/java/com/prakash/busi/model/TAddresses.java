package com.prakash.busi.model;
// default package
// Generated Jun 9, 2017 8:36:26 AM by Hibernate Tools 3.4.0.CR1

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

/**
 * TAddresses generated by hbm2java
 */
@Entity
@Table(name = "t_addresses", catalog = "business")
public class TAddresses implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long addressId;
	private Integer version;
	private LCity LCity;
	private LState LState;
	private TUser TUser;
	private LArea LArea;
	private LZipcode LZipcode;
	private LCountry LCountry;
	private String landmark;
	private String address;
	private Date createddate;
	private Date lastupdateddate;
	private Long createdby;
	private Long updatedby;
	private Long status;

	public TAddresses() {
	}

	public TAddresses(LCity LCity, LState LState, TUser TUser, LArea LArea,
			LZipcode LZipcode, LCountry LCountry, String address,
			Date createddate, Date lastupdateddate) {
		this.LCity = LCity;
		this.LState = LState;
		this.TUser = TUser;
		this.LArea = LArea;
		this.LZipcode = LZipcode;
		this.LCountry = LCountry;
		this.address = address;
		this.createddate = createddate;
		this.lastupdateddate = lastupdateddate;
	}

	public TAddresses(LCity LCity, LState LState, TUser TUser, LArea LArea,
			LZipcode LZipcode, LCountry LCountry, String landmark,
			String address, Date createddate, Date lastupdateddate,
			Long createdby, Long updatedby, Long status) {
		this.LCity = LCity;
		this.LState = LState;
		this.TUser = TUser;
		this.LArea = LArea;
		this.LZipcode = LZipcode;
		this.LCountry = LCountry;
		this.landmark = landmark;
		this.address = address;
		this.createddate = createddate;
		this.lastupdateddate = lastupdateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "AddressID", unique = true, nullable = false)
	public Long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cityid", nullable = false)
	public LCity getLCity() {
		return this.LCity;
	}

	public void setLCity(LCity LCity) {
		this.LCity = LCity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stateid", nullable = false)
	public LState getLState() {
		return this.LState;
	}

	public void setLState(LState LState) {
		this.LState = LState;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "areaid", nullable = false)
	public LArea getLArea() {
		return this.LArea;
	}

	public void setLArea(LArea LArea) {
		this.LArea = LArea;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "zipcode", nullable = false)
	public LZipcode getLZipcode() {
		return this.LZipcode;
	}

	public void setLZipcode(LZipcode LZipcode) {
		this.LZipcode = LZipcode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countryid", nullable = false)
	public LCountry getLCountry() {
		return this.LCountry;
	}

	public void setLCountry(LCountry LCountry) {
		this.LCountry = LCountry;
	}

	@Column(name = "landmark", length = 200)
	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Column(name = "Address", nullable = false)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", nullable = false, length = 19)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastupdateddate", nullable = false, length = 19)
	public Date getLastupdateddate() {
		return this.lastupdateddate;
	}

	public void setLastupdateddate(Date lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
	}

	@Column(name = "createdby")
	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	@Column(name = "updatedby")
	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	@Column(name = "status")
	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

}
