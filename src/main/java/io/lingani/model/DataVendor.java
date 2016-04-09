package io.lingani.model;

// default package
// Generated 16 Jun 2015 7:02:15 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DataVendor generated by hbm2java
 */
@Entity
@Table(name = "data_vendor")
public class DataVendor implements java.io.Serializable {
    
	private static final long serialVersionUID = -3415604722335961930L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", nullable = false, length = 64)
    private String name;
	
	@Column(name = "website_url")
    private String websiteUrl;
	
	@Column(name = "support_email")
    private String supportEmail;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = false, length = 19)
    private Date created;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = false, length = 19)
    private Date updated;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "dataVendor")
    private Set<DailyPriceData> dailyPrices = new HashSet<DailyPriceData>(0);    

    public DataVendor() {
    }
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    
    public String getSupportEmail() {
        return this.supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    
    public Date getCreated() {
        return this.created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    
    public Date getUpdated() {
        return this.updated;
    }

    public void setLastUpdatedDate(Date updated) {
        this.updated = updated;
    }

    
    public Set<DailyPriceData> getDailyPrices() {
        return this.dailyPrices;
    }

    public void setDailyPrices(Set<DailyPriceData> dailyPrices) {
        this.dailyPrices = dailyPrices;
    }   

}
