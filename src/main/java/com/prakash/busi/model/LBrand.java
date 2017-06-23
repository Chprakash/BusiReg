package com.prakash.busi.model;
// default package
// Generated Jun 9, 2017 8:36:26 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * LBrand generated by hbm2java
 */
@Entity
@Table(name = "l_brand", catalog = "business")
public class LBrand implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long brandid;
	private Integer version;
	private String brandname;
	private Date createddate;
	private Date updateddate;
	private Long createdby;
	private Long updatedby;

	public LBrand() {
	}

	public LBrand(long brandid) {
		this.brandid = brandid;
	}

	public LBrand(long brandid, String brandname, Date createddate,
			Date updateddate, Long createdby, Long updatedby) {
		this.brandid = brandid;
		this.brandname = brandname;
		this.createddate = createddate;
		this.updateddate = updateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
	}

	@Id
	@Column(name = "brandid", unique = true, nullable = false)
	public long getBrandid() {
		return this.brandid;
	}

	public void setBrandid(long brandid) {
		this.brandid = brandid;
	}

	@Version
	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "brandname", length = 50)
	public String getBrandname() {
		return this.brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createddate", length = 19)
	public Date getCreateddate() {
		return this.createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateddate", length = 19)
	public Date getUpdateddate() {
		return this.updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
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

}
