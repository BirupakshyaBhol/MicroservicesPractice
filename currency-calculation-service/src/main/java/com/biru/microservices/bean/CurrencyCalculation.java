package com.biru.microservices.bean;

import java.math.BigDecimal;

public class CurrencyCalculation {
	private Long id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal totalAmount;
	private BigDecimal exchangeRate;
	public CurrencyCalculation(Long id, String from, String to, BigDecimal quantity, BigDecimal totalAmount,
			BigDecimal exchangeRate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.exchangeRate = exchangeRate;
	}
	public CurrencyCalculation() {
		super();
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "CurrencyCalculation [id=" + id + ", from=" + from + ", to=" + to + ", quantity=" + quantity
				+ ", totalAmount=" + totalAmount + ", exchangeRate=" + exchangeRate + "]";
	}
	public void setId(Long id) {
		this.id = id;
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
	public BigDecimal getquantity() {
		return quantity;
	}
	public void setquantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BigDecimal getexchangeRate() {
		return exchangeRate;
	}
	public void setexchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
	
}
