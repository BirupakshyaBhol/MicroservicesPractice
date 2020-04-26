package com.biru.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biru.microservices.beans.LimitConfiguration;
import com.biru.microservices.utility.ConfigurationPropertyReader;

@RestController
public class LimitConfigurationController {
	@Autowired
	private ConfigurationPropertyReader  configurationPropertyReader;

	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguration() {
    return new LimitConfiguration(configurationPropertyReader.getMaximum(),configurationPropertyReader.getMinimum()); 
	}
}
