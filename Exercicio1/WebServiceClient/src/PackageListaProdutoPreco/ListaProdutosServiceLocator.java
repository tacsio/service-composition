/**
 * ListaProdutosServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PackageListaProdutoPreco;

public class ListaProdutosServiceLocator extends org.apache.axis.client.Service implements PackageListaProdutoPreco.ListaProdutosService {

    public ListaProdutosServiceLocator() {
    }


    public ListaProdutosServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ListaProdutosServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ListaProdutos
    private java.lang.String ListaProdutos_address = "http://localhost:8080/WebServiceListarProdutos/services/ListaProdutos";

    public java.lang.String getListaProdutosAddress() {
        return ListaProdutos_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ListaProdutosWSDDServiceName = "ListaProdutos";

    public java.lang.String getListaProdutosWSDDServiceName() {
        return ListaProdutosWSDDServiceName;
    }

    public void setListaProdutosWSDDServiceName(java.lang.String name) {
        ListaProdutosWSDDServiceName = name;
    }

    public PackageListaProdutoPreco.ListaProdutos getListaProdutos() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ListaProdutos_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListaProdutos(endpoint);
    }

    public PackageListaProdutoPreco.ListaProdutos getListaProdutos(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PackageListaProdutoPreco.ListaProdutosSoapBindingStub _stub = new PackageListaProdutoPreco.ListaProdutosSoapBindingStub(portAddress, this);
            _stub.setPortName(getListaProdutosWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setListaProdutosEndpointAddress(java.lang.String address) {
        ListaProdutos_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PackageListaProdutoPreco.ListaProdutos.class.isAssignableFrom(serviceEndpointInterface)) {
                PackageListaProdutoPreco.ListaProdutosSoapBindingStub _stub = new PackageListaProdutoPreco.ListaProdutosSoapBindingStub(new java.net.URL(ListaProdutos_address), this);
                _stub.setPortName(getListaProdutosWSDDServiceName());
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
        if ("ListaProdutos".equals(inputPortName)) {
            return getListaProdutos();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "ListaProdutosService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "ListaProdutos"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ListaProdutos".equals(portName)) {
            setListaProdutosEndpointAddress(address);
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
