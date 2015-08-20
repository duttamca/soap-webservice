/**
 * CalculatorServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.skd.services;

public interface CalculatorServiceService extends javax.xml.rpc.Service {
    public java.lang.String getCalculatorServiceAddress();

    public com.skd.services.CalculatorService getCalculatorService() throws javax.xml.rpc.ServiceException;

    public com.skd.services.CalculatorService getCalculatorService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
