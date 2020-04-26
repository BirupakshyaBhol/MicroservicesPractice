package com.biru.microservices.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.biru.microservices.bean.CurrencyCalculation;

//@FeignClient(name="currency-exchange-service",url="localhost:8000")
@FeignClient(name="currency-exchange-service")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyCalculationServiceProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyCalculation getCurrencyExchangeRate(@PathVariable("from") String from,@PathVariable ("to")String to)
		;

}
