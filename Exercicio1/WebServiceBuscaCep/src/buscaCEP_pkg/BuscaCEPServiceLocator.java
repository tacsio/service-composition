/**
 * BuscaCEPServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package buscaCEP_pkg;

public class BuscaCEPServiceLocator extends org.apache.axis.client.Service implements buscaCEP_pkg.BuscaCEPService {

    public BuscaCEPServiceLocator() {
    }


    public BuscaCEPServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BuscaCEPServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BuscaCEP
    private java.lang.String BuscaCEP_address = "http://localhost:8080/WebServiceBuscaCEP/services/BuscaCEP";

    public java.lang.String getBuscaCEPAddress() {
        return BuscaCEP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BuscaCEPWSDDServiceName = "BuscaCEP";

    public java.lang.String getBuscaCEPWSDDServiceName() {
        return BuscaCEPWSDDServiceName;
    }

    public void setBuscaCEPWSDDServiceName(java.lang.String name) {
        BuscaCEPWSDDServiceName = name;
    }

    public buscaCEP_pkg.BuscaCEP getBuscaCEP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BuscaCEP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBuscaCEP(endpoint);
    }

    public buscaCEP_pkg.BuscaCEP getBuscaCEP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            buscaCEP_pkg.BuscaCEPSoapBindingStub _stub = new buscaCEP_pkg.BuscaCEPSoapBindingStub(portAddress, this);
            _stub.setPortName(getBuscaCEPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBuscaCEPEndpointAddress(java.lang.String address) {
        BuscaCEP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (buscaCEP_pkg.BuscaCEP.class.isAssignableFrom(serviceEndpointInterface)) {
                buscaCEP_pkg.BuscaCEPSoapBindingStub _stub = new buscaCEP_pkg.BuscaCEPSoapBindingStub(new java.net.URL(BuscaCEP_address), this);
                _stub.setPortName(getBuscaCEPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BuscaCEP".equals(inputPortName)) {
            return getBuscaCEP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://buscaCEP", "BuscaCEPService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://buscaCEP", "BuscaCEP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BuscaCEP".equals(portName)) {
            setBuscaCEPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
