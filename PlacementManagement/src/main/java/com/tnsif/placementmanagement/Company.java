package com.tnsif.placementmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int companyId;
	private String name;
	private String industry;
	private String location;
	private String contactInfo;
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	
	
	public Company(int companyId, String name, String industry, String location, String contactInfo) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.industry = industry;
		this.location = location;
		this.contactInfo = contactInfo;
	}
	
	
	public Company() {
		super();
	}
	
	
	
	
	
	
	

}