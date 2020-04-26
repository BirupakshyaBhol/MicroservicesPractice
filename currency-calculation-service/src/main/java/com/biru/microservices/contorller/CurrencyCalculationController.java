package com.biru.microservices.contorller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.biru.microservices.bean.CurrencyCalculation;
import com.biru.microservices.service.CurrencyCalculationServiceProxy;

@RestController
public class CurrencyCalculationController {
	
	@Autowired
	 private CurrencyCalculationServiceProxy currencyCalculationServiceProxy;
	
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyCalculation currencyCOnversionFeign(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		CurrencyCalculation responce= currencyCalculationServiceProxy.getCurrencyExchangeRate(from, to);
		
		return new CurrencyCalculation(responce.getId(), from, to,quantity,quantity.multiply(responce.getexchangeRate() ),responce.getexchangeRate());
		
	}
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyCalculation currencyCOnversion(@PathVariable String from,
			@PathVariable String to,
			@PathVariable("quantity") BigDecimal quantity) {
		
		Map<String,String> uriVariable= new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);
		
		ResponseEntity<CurrencyCalculation>responceEntity= new RestTemplate().getForEntity("http://localhost:8000//currency-exchange/from/{from}/to/{to}", CurrencyCalculation.class,uriVariable);
		
		CurrencyCalculation responce= responceEntity.getBody();
		System.out.println("-------------->"+responce.toString());
				
		return new CurrencyCalculation(responce.getId(), from, to,quantity, quantity.multiply(responce.getexchangeRate()),responce.getexchangeRate());
		
	}

}
