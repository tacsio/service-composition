/**
 * BuscaCEPSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package buscaCEP_pkg;

public class BuscaCEPSoapBindingSkeleton implements buscaCEP_pkg.BuscaCEP, org.apache.axis.wsdl.Skeleton {
    private buscaCEP_pkg.BuscaCEP impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://buscaCEP", "cep"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("buscaCEP", _params, new javax.xml.namespace.QName("http://buscaCEP", "buscaCEPReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://buscaCEP", "buscaCEP"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("buscaCEP") == null) {
            _myOperations.put("buscaCEP", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("buscaCEP")).add(_oper);
    }

    public BuscaCEPSoapBindingSkeleton() {
        this.impl = new buscaCEP_pkg.BuscaCEPSoapBindingImpl();
    }

    public BuscaCEPSoapBindingSkeleton(buscaCEP_pkg.BuscaCEP impl) {
        this.impl = impl;
    }
    public java.lang.String buscaCEP(java.lang.String cep) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.buscaCEP(cep);
        return ret;
    }

}
