package com.skd.services;

import javax.jws.WebService;

@WebService(endpointInterface="com.skd.service.Calculator")
public class CalculatorService implements Calculator {
	
	public CalculatorService(){
		
	}

	public int add(int i, int j) {
		return (i + j);
	}

	public int subtract(int i, int j) {
		
		return (i - j);
	}

}
