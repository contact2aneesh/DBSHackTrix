package com.dbshacktrix.loan.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class USRTXN {

	@Id
	private String txnid;
	private int usrid;
	private BigDecimal amount;
	public String getTxnid() {
		return txnid;
	}
	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}
	public int getUsrid() {
		return usrid;
	}
	public void setUsrid(int usrid) {
		this.usrid = usrid;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}	
	
}
