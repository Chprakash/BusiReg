package com.prakash.busi.model;
// default package
// Generated Jun 9, 2017 8:36:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * LState generated by hbm2java
 */
@Entity
@Table(name = "l_state", catalog = "business")
public class LState implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long stateId;
	private Integer version;
	private LCountry LCountry;
	private String stateName;
	private String description;
	private Date createdDate;
	private Date lastUpdatedDate;
	private Long createdBy;
	private Long updatedBy;
	private long status;
	private Set<TAddresses> TAddresseses = new HashSet<TAddresses>(0);
	private Set<LCity> LCities = new HashSet<LCity>(0);

	public LState() {
	}

	public LState(Date createdDate, Date lastUpdatedDate, long status) {
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.status = status;
	}

	public LState(LCountry LCountry, String stateName, String description,
			Date createdDate, Date lastUpdatedDate, Long createdBy,
			Long updatedBy, long status, Set<TAddresses> TAddresseses,
			Set<LCity> LCities) {
		this.LCountry = LCountry;
		this.stateName = stateName;
		this.description = description;
		this.createdDate = createdDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.status = status;
		this.TAddresseses = TAddresseses;
		this.LCities = LCities;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "StateID", unique = true, nullable = false)
	public Long getStateId() {
		return this.stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
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
	@JoinColumn(name = "CountryID")
	public LCountry getLCountry() {
		return this.LCountry;
	}

	public void setLCountry(LCountry LCountry) {
		this.LCountry = LCountry;
	}

	@Column(name = "StateName", length = 50)
	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Column(name = "Description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreatedDate", nullable = false, length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastUpdatedDate", nullable = false, length = 19)
	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Column(name = "CreatedBy")
	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "UpdatedBy")
	public Long getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Column(name = "status", nullable = false)
	public long getStatus() {
		return this.status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "LState")
	public Set<TAddresses> getTAddresseses() {
		return this.TAddresseses;
	}

	public void setTAddresseses(Set<TAddresses> TAddresseses) {
		this.TAddresseses = TAddresseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "LState")
	public Set<LCity> getLCities() {
		return this.LCities;
	}

	public void setLCities(Set<LCity> LCities) {
		this.LCities = LCities;
	}

}
