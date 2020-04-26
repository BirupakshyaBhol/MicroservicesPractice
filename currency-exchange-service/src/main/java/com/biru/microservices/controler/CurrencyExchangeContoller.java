package com.biru.microservices.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.biru.microservices.bean.ExchangedValue;
import com.biru.microservices.dao.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeContoller {
	@Autowired
	CurrencyExchangeRepository currencyExchangeRepository;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangedValue currencyExchange(@PathVariable String from,@PathVariable String to) {
		
		return currencyExchangeRepository.findByFromAndTo(from.toUpperCase(), to.toUpperCase());
	
	}

}
