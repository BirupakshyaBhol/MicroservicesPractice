package com.biru.microservices.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangedValue {
	
	@Id
	private int id;
	
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal exchangeRate;
	
	public ExchangedValue(String from, String to, BigDecimal exchangeRate, int id) {
		super();
		this.from = from;
		this.to = to;
		this.exchangeRate = exchangeRate;
		this.id = id;
	}
	public ExchangedValue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
