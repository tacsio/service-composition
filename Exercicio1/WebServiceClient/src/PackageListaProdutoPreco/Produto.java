/**
 * Produto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PackageListaProdutoPreco;

public class Produto  implements java.io.Serializable {
    private double altura;

    private double comprimento;

    private double diametro;

    private double largura;

    private java.lang.String nome;

    private double peso;

    private double preco;

    public Produto() {
    }

    public Produto(
           double altura,
           double comprimento,
           double diametro,
           double largura,
           java.lang.String nome,
           double peso,
           double preco) {
           this.altura = altura;
           this.comprimento = comprimento;
           this.diametro = diametro;
           this.largura = largura;
           this.nome = nome;
           this.peso = peso;
           this.preco = preco;
    }


    /**
     * Gets the altura value for this Produto.
     * 
     * @return altura
     */
    public double getAltura() {
        return altura;
    }


    /**
     * Sets the altura value for this Produto.
     * 
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }


    /**
     * Gets the comprimento value for this Produto.
     * 
     * @return comprimento
     */
    public double getComprimento() {
        return comprimento;
    }


    /**
     * Sets the comprimento value for this Produto.
     * 
     * @param comprimento
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }


    /**
     * Gets the diametro value for this Produto.
     * 
     * @return diametro
     */
    public double getDiametro() {
        return diametro;
    }


    /**
     * Sets the diametro value for this Produto.
     * 
     * @param diametro
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }


    /**
     * Gets the largura value for this Produto.
     * 
     * @return largura
     */
    public double getLargura() {
        return largura;
    }


    /**
     * Sets the largura value for this Produto.
     * 
     * @param largura
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }


    /**
     * Gets the nome value for this Produto.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Produto.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the peso value for this Produto.
     * 
     * @return peso
     */
    public double getPeso() {
        return peso;
    }


    /**
     * Sets the peso value for this Produto.
     * 
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }


    /**
     * Gets the preco value for this Produto.
     * 
     * @return preco
     */
    public double getPreco() {
        return preco;
    }


    /**
     * Sets the preco value for this Produto.
     * 
     * @param preco
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produto)) return false;
        Produto other = (Produto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.altura == other.getAltura() &&
            this.comprimento == other.getComprimento() &&
            this.diametro == other.getDiametro() &&
            this.largura == other.getLargura() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            this.peso == other.getPeso() &&
            this.preco == other.getPreco();
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
        _hashCode += new Double(getAltura()).hashCode();
        _hashCode += new Double(getComprimento()).hashCode();
        _hashCode += new Double(getDiametro()).hashCode();
        _hashCode += new Double(getLargura()).hashCode();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        _hashCode += new Double(getPeso()).hashCode();
        _hashCode += new Double(getPreco()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "Produto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "altura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comprimento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "comprimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diametro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "diametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "largura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "peso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://PackageListaProdutoPreco", "preco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
