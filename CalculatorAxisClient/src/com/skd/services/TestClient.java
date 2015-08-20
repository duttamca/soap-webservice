package com.skd.services;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.ws.Service;

import org.apache.axis.AxisFault;

public class TestClient {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws MalformedURLException, RemoteException {
		
	URL endpointURL = new URL("http://localhost:8080/CalculatorAxis/services/CalculatorService");
	org.apache.axis.client.Service service= new org.apache.axis.client.Service();
	
	CalculatorServiceSoapBindingStub calculatorService = new CalculatorServiceSoapBindingStub(endpointURL,service);
	
	int addResult = calculatorService.add(20, 20);
	int subResult = calculatorService.subtract(50, 10);
	
	System.out.println("ADDITION: " +addResult);
	System.out.println("SUBTRACTION: " +subResult);

	}

}
