package buscaCEP_pkg;

public class BuscaCEPProxy implements buscaCEP_pkg.BuscaCEP {
  private String _endpoint = null;
  private buscaCEP_pkg.BuscaCEP buscaCEP = null;
  
  public BuscaCEPProxy() {
    _initBuscaCEPProxy();
  }
  
  public BuscaCEPProxy(String endpoint) {
    _endpoint = endpoint;
    _initBuscaCEPProxy();
  }
  
  private void _initBuscaCEPProxy() {
    try {
      buscaCEP = (new buscaCEP_pkg.BuscaCEPServiceLocator()).getBuscaCEP();
      if (buscaCEP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)buscaCEP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)buscaCEP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (buscaCEP != null)
      ((javax.xml.rpc.Stub)buscaCEP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public buscaCEP_pkg.BuscaCEP getBuscaCEP() {
    if (buscaCEP == null)
      _initBuscaCEPProxy();
    return buscaCEP;
  }
  
  public java.lang.String buscaCEP(java.lang.String cep) throws java.rmi.RemoteException{
    if (buscaCEP == null)
      _initBuscaCEPProxy();
    return buscaCEP.buscaCEP(cep);
  }
  
  
}