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
 * TBusinesssrc generated by hbm2java
 */
@Entity
@Table(name = "t_businesssrc", catalog = "business")
public class TBusinesssrc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long busiSrcId;
	private Integer version;
	private TUser TUser;
	private LBusinesstype LBusinesstype;
	private String busiName;
	private Date createddate;
	private Date lastupdateddate;
	private Long createdby;
	private Long updatedby;
	private Long acstatus;
	private String pancardNo;
	private String adharCardNo;
	private Set<TBusinesscontact> TBusinesscontacts = new HashSet<TBusinesscontact>(
			0);
	private Set<TApplogincredentials> TApplogincredentialses = new HashSet<TApplogincredentials>(
			0);

	public TBusinesssrc() {
	}

	public TBusinesssrc(Date createddate, Date lastupdateddate) {
		this.createddate = createddate;
		this.lastupdateddate = lastupdateddate;
	}

	public TBusinesssrc(TUser TUser, LBusinesstype LBusinesstype,
			String busiName, Date createddate, Date lastupdateddate,
			Long createdby, Long updatedby, Long acstatus, String pancardNo,
			String adharCardNo, Set<TBusinesscontact> TBusinesscontacts,
			Set<TApplogincredentials> TApplogincredentialses) {
		this.TUser = TUser;
		this.LBusinesstype = LBusinesstype;
		this.busiName = busiName;
		this.createddate = createddate;
		this.lastupdateddate = lastupdateddate;
		this.createdby = createdby;
		this.updatedby = updatedby;
		this.acstatus = acstatus;
		this.pancardNo = pancardNo;
		this.adharCardNo = adharCardNo;
		this.TBusinesscontacts = TBusinesscontacts;
		this.TApplogincredentialses = TApplogincredentialses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "BusiSrcID", unique = true, nullable = false)
	public Long getBusiSrcId() {
		return this.busiSrcId;
	}

	public void setBusiSrcId(Long busiSrcId) {
		this.busiSrcId = busiSrcId;
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
	@JoinColumn(name = "userid")
	public TUser getTUser() {
		return this.TUser;
	}

	public void setTUser(TUser TUser) {
		this.TUser = TUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "busiTypeid")
	public LBusinesstype getLBusinesstype() {
		return this.LBusinesstype;
	}

	public void setLBusinesstype(LBusinesstype LBusinesstype) {
		this.LBusinesstype = LBusinesstype;
	}

	@Column(name = "BusiName", length = 200)
	public String getBusiName() {
		return this.busiName;
	}

	public void setBusiName(String busiName) {
		this.busiName = busiName;
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

	@Column(name = "ACstatus")
	public Long getAcstatus() {
		return this.acstatus;
	}

	public void setAcstatus(Long acstatus) {
		this.acstatus = acstatus;
	}

	@Column(name = "PancardNo", length = 50)
	public String getPancardNo() {
		return this.pancardNo;
	}

	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}

	@Column(name = "AdharCardNo", length = 50)
	public String getAdharCardNo() {
		return this.adharCardNo;
	}

	public void setAdharCardNo(String adharCardNo) {
		this.adharCardNo = adharCardNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TBusinesssrc")
	public Set<TBusinesscontact> getTBusinesscontacts() {
		return this.TBusinesscontacts;
	}

	public void setTBusinesscontacts(Set<TBusinesscontact> TBusinesscontacts) {
		this.TBusinesscontacts = TBusinesscontacts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TBusinesssrc")
	public Set<TApplogincredentials> getTApplogincredentialses() {
		return this.TApplogincredentialses;
	}

	public void setTApplogincredentialses(
			Set<TApplogincredentials> TApplogincredentialses) {
		this.TApplogincredentialses = TApplogincredentialses;
	}

}
