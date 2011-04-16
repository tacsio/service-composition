/**
 * CalcPrecoPrazoWSLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CalcPrecoPrazoWSLocator extends org.apache.axis.client.Service implements org.tempuri.CalcPrecoPrazoWS {

    public CalcPrecoPrazoWSLocator() {
    }


    public CalcPrecoPrazoWSLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalcPrecoPrazoWSLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalcPrecoPrazoWSSoap
    private java.lang.String CalcPrecoPrazoWSSoap_address = "http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx";

    public java.lang.String getCalcPrecoPrazoWSSoapAddress() {
        return CalcPrecoPrazoWSSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalcPrecoPrazoWSSoapWSDDServiceName = "CalcPrecoPrazoWSSoap";

    public java.lang.String getCalcPrecoPrazoWSSoapWSDDServiceName() {
        return CalcPrecoPrazoWSSoapWSDDServiceName;
    }

    public void setCalcPrecoPrazoWSSoapWSDDServiceName(java.lang.String name) {
        CalcPrecoPrazoWSSoapWSDDServiceName = name;
    }

    public org.tempuri.CalcPrecoPrazoWSSoap getCalcPrecoPrazoWSSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalcPrecoPrazoWSSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalcPrecoPrazoWSSoap(endpoint);
    }

    public org.tempuri.CalcPrecoPrazoWSSoap getCalcPrecoPrazoWSSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.CalcPrecoPrazoWSSoapStub _stub = new org.tempuri.CalcPrecoPrazoWSSoapStub(portAddress, this);
            _stub.setPortName(getCalcPrecoPrazoWSSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalcPrecoPrazoWSSoapEndpointAddress(java.lang.String address) {
        CalcPrecoPrazoWSSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.CalcPrecoPrazoWSSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.CalcPrecoPrazoWSSoapStub _stub = new org.tempuri.CalcPrecoPrazoWSSoapStub(new java.net.URL(CalcPrecoPrazoWSSoap_address), this);
                _stub.setPortName(getCalcPrecoPrazoWSSoapWSDDServiceName());
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
        if ("CalcPrecoPrazoWSSoap".equals(inputPortName)) {
            return getCalcPrecoPrazoWSSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "CalcPrecoPrazoWS");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "CalcPrecoPrazoWSSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalcPrecoPrazoWSSoap".equals(portName)) {
            setCalcPrecoPrazoWSSoapEndpointAddress(address);
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
