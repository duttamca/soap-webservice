package com.skd.services;

import javax.jws.WebService;

@WebService
public interface Calculator {
	
	public int add(int i, int j);
	public int subtract(int i, int j);

}
