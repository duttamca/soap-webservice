package com.skd.services;

public class CalculatorServiceProxy implements com.skd.services.CalculatorService {
  private String _endpoint = null;
  private com.skd.services.CalculatorService calculatorService = null;
  
  public CalculatorServiceProxy() {
    _initCalculatorServiceProxy();
  }
  
  public CalculatorServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorServiceProxy();
  }
  
  private void _initCalculatorServiceProxy() {
    try {
      calculatorService = (new com.skd.services.CalculatorServiceServiceLocator()).getCalculatorService();
      if (calculatorService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculatorService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculatorService != null)
      ((javax.xml.rpc.Stub)calculatorService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.skd.services.CalculatorService getCalculatorService() {
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.add(i, j);
  }
  
  public int subtract(int i, int j) throws java.rmi.RemoteException{
    if (calculatorService == null)
      _initCalculatorServiceProxy();
    return calculatorService.subtract(i, j);
  }
  
  
}