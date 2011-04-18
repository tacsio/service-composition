/**
 * BuscaCEPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package buscaCEP_pkg;

public interface BuscaCEPService extends javax.xml.rpc.Service {
    public java.lang.String getBuscaCEPAddress();

    public buscaCEP_pkg.BuscaCEP getBuscaCEP() throws javax.xml.rpc.ServiceException;

    public buscaCEP_pkg.BuscaCEP getBuscaCEP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
