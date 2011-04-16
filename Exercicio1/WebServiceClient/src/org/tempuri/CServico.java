/**
 * CServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CServico  implements java.io.Serializable {
    private int codigo;

    private java.lang.String valor;

    private int prazoEntrega;

    private java.lang.String valorMaoPropria;

    private java.lang.String valorAvisoRecebimento;

    private java.lang.String valorValorDeclarado;

    private java.lang.String entregaDomiciliar;

    private java.lang.String entregaSabado;

    private java.lang.String erro;

    private java.lang.String msgErro;

    public CServico() {
    }

    public CServico(
           int codigo,
           java.lang.String valor,
           int prazoEntrega,
           java.lang.String valorMaoPropria,
           java.lang.String valorAvisoRecebimento,
           java.lang.String valorValorDeclarado,
           java.lang.String entregaDomiciliar,
           java.lang.String entregaSabado,
           java.lang.String erro,
           java.lang.String msgErro) {
           this.codigo = codigo;
           this.valor = valor;
           this.prazoEntrega = prazoEntrega;
           this.valorMaoPropria = valorMaoPropria;
           this.valorAvisoRecebimento = valorAvisoRecebimento;
           this.valorValorDeclarado = valorValorDeclarado;
           this.entregaDomiciliar = entregaDomiciliar;
           this.entregaSabado = entregaSabado;
           this.erro = erro;
           this.msgErro = msgErro;
    }


    /**
     * Gets the codigo value for this CServico.
     * 
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this CServico.
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the valor value for this CServico.
     * 
     * @return valor
     */
    public java.lang.String getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this CServico.
     * 
     * @param valor
     */
    public void setValor(java.lang.String valor) {
        this.valor = valor;
    }


    /**
     * Gets the prazoEntrega value for this CServico.
     * 
     * @return prazoEntrega
     */
    public int getPrazoEntrega() {
        return prazoEntrega;
    }


    /**
     * Sets the prazoEntrega value for this CServico.
     * 
     * @param prazoEntrega
     */
    public void setPrazoEntrega(int prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }


    /**
     * Gets the valorMaoPropria value for this CServico.
     * 
     * @return valorMaoPropria
     */
    public java.lang.String getValorMaoPropria() {
        return valorMaoPropria;
    }


    /**
     * Sets the valorMaoPropria value for this CServico.
     * 
     * @param valorMaoPropria
     */
    public void setValorMaoPropria(java.lang.String valorMaoPropria) {
        this.valorMaoPropria = valorMaoPropria;
    }


    /**
     * Gets the valorAvisoRecebimento value for this CServico.
     * 
     * @return valorAvisoRecebimento
     */
    public java.lang.String getValorAvisoRecebimento() {
        return valorAvisoRecebimento;
    }


    /**
     * Sets the valorAvisoRecebimento value for this CServico.
     * 
     * @param valorAvisoRecebimento
     */
    public void setValorAvisoRecebimento(java.lang.String valorAvisoRecebimento) {
        this.valorAvisoRecebimento = valorAvisoRecebimento;
    }


    /**
     * Gets the valorValorDeclarado value for this CServico.
     * 
     * @return valorValorDeclarado
     */
    public java.lang.String getValorValorDeclarado() {
        return valorValorDeclarado;
    }


    /**
     * Sets the valorValorDeclarado value for this CServico.
     * 
     * @param valorValorDeclarado
     */
    public void setValorValorDeclarado(java.lang.String valorValorDeclarado) {
        this.valorValorDeclarado = valorValorDeclarado;
    }


    /**
     * Gets the entregaDomiciliar value for this CServico.
     * 
     * @return entregaDomiciliar
     */
    public java.lang.String getEntregaDomiciliar() {
        return entregaDomiciliar;
    }


    /**
     * Sets the entregaDomiciliar value for this CServico.
     * 
     * @param entregaDomiciliar
     */
    public void setEntregaDomiciliar(java.lang.String entregaDomiciliar) {
        this.entregaDomiciliar = entregaDomiciliar;
    }


    /**
     * Gets the entregaSabado value for this CServico.
     * 
     * @return entregaSabado
     */
    public java.lang.String getEntregaSabado() {
        return entregaSabado;
    }


    /**
     * Sets the entregaSabado value for this CServico.
     * 
     * @param entregaSabado
     */
    public void setEntregaSabado(java.lang.String entregaSabado) {
        this.entregaSabado = entregaSabado;
    }


    /**
     * Gets the erro value for this CServico.
     * 
     * @return erro
     */
    public java.lang.String getErro() {
        return erro;
    }


    /**
     * Sets the erro value for this CServico.
     * 
     * @param erro
     */
    public void setErro(java.lang.String erro) {
        this.erro = erro;
    }


    /**
     * Gets the msgErro value for this CServico.
     * 
     * @return msgErro
     */
    public java.lang.String getMsgErro() {
        return msgErro;
    }


    /**
     * Sets the msgErro value for this CServico.
     * 
     * @param msgErro
     */
    public void setMsgErro(java.lang.String msgErro) {
        this.msgErro = msgErro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CServico)) return false;
        CServico other = (CServico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigo == other.getCodigo() &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            this.prazoEntrega == other.getPrazoEntrega() &&
            ((this.valorMaoPropria==null && other.getValorMaoPropria()==null) || 
             (this.valorMaoPropria!=null &&
              this.valorMaoPropria.equals(other.getValorMaoPropria()))) &&
            ((this.valorAvisoRecebimento==null && other.getValorAvisoRecebimento()==null) || 
             (this.valorAvisoRecebimento!=null &&
              this.valorAvisoRecebimento.equals(other.getValorAvisoRecebimento()))) &&
            ((this.valorValorDeclarado==null && other.getValorValorDeclarado()==null) || 
             (this.valorValorDeclarado!=null &&
              this.valorValorDeclarado.equals(other.getValorValorDeclarado()))) &&
            ((this.entregaDomiciliar==null && other.getEntregaDomiciliar()==null) || 
             (this.entregaDomiciliar!=null &&
              this.entregaDomiciliar.equals(other.getEntregaDomiciliar()))) &&
            ((this.entregaSabado==null && other.getEntregaSabado()==null) || 
             (this.entregaSabado!=null &&
              this.entregaSabado.equals(other.getEntregaSabado()))) &&
            ((this.erro==null && other.getErro()==null) || 
             (this.erro!=null &&
              this.erro.equals(other.getErro()))) &&
            ((this.msgErro==null && other.getMsgErro()==null) || 
             (this.msgErro!=null &&
              this.msgErro.equals(other.getMsgErro())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getCodigo();
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        _hashCode += getPrazoEntrega();
        if (getValorMaoPropria() != null) {
            _hashCode += getValorMaoPropria().hashCode();
        }
        if (getValorAvisoRecebimento() != null) {
            _hashCode += getValorAvisoRecebimento().hashCode();
        }
        if (getValorValorDeclarado() != null) {
            _hashCode += getValorValorDeclarado().hashCode();
        }
        if (getEntregaDomiciliar() != null) {
            _hashCode += getEntregaDomiciliar().hashCode();
        }
        if (getEntregaSabado() != null) {
            _hashCode += getEntregaSabado().hashCode();
        }
        if (getErro() != null) {
            _hashCode += getErro().hashCode();
        }
        if (getMsgErro() != null) {
            _hashCode += getMsgErro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CServico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "cServico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Codigo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prazoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrazoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorMaoPropria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValorMaoPropria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorAvisoRecebimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValorAvisoRecebimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorValorDeclarado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValorValorDeclarado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entregaDomiciliar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EntregaDomiciliar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entregaSabado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EntregaSabado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Erro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgErro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MsgErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
