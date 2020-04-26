package com.biru.microservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biru.microservices.bean.ExchangedValue;

public interface CurrencyExchangeRepository extends JpaRepository<ExchangedValue, Integer> {

	public ExchangedValue findByFromAndTo(String from, String to);

}
