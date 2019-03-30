package com.dbshacktrix.loan.model;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class LOANPLAN {

	private String planid;
	private String description;
	private BigDecimal slabs;
	private float intrate;
	public String getPlanid() {
		return planid;
	}
	public void setPlanid(String planid) {
		this.planid = planid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getSlabs() {
		return slabs;
	}
	public void setSlabs(BigDecimal slabs) {
		this.slabs = slabs;
	}
	public float getIntrate() {
		return intrate;
	}
	public void setIntrate(float intrate) {
		this.intrate = intrate;
	}
	
}
