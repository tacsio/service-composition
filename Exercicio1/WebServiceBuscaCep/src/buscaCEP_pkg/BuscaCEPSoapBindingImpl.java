/**
 * BuscaCEPSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package buscaCEP_pkg;

import java.rmi.RemoteException;

import buscaCEP_pkg.endereco.Endereco;
import buscaCEP_pkg.repositorio.RepositorioEndereco;

public class BuscaCEPSoapBindingImpl implements buscaCEP_pkg.BuscaCEP{
	
    public java.lang.String buscaCEP(java.lang.String cep) throws java.rmi.RemoteException {
    	
    	if(cep != null && cep.matches("[0-9]{5}-[0-9]{3}")){
	    	Endereco endereco = RepositorioEndereco.consultarEndrecoPorCep(cep);
	    	
	    	if(endereco != null){
	    		return endereco.toString();
	    	}
    	}    	
    	return "CEP INVÁLIDO";
    }
    
    
    public static void main(String[] args) {
		try {
			System.out.println(new BuscaCEPSoapBindingImpl().buscaCEP("52041-000"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
