
package SGB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saldo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="limiteCredito" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tasaInteres" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idCuenta",
    "idCliente",
    "nombreCliente",
    "saldo",
    "limiteCredito",
    "tasaInteres"
})
@XmlRootElement(name = "addCuentasCorrientes")
public class AddCuentasCorrientes {

    protected int idCuenta;
    protected int idCliente;
    protected String nombreCliente;
    protected double saldo;
    protected double limiteCredito;
    protected double tasaInteres;

    /**
     * Obtiene el valor de la propiedad idCuenta.
     * 
     */
    public int getIdCuenta() {
        return idCuenta;
    }

    /**
     * Define el valor de la propiedad idCuenta.
     * 
     */
    public void setIdCuenta(int value) {
        this.idCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     */
    public void setSaldo(double value) {
        this.saldo = value;
    }

    /**
     * Obtiene el valor de la propiedad limiteCredito.
     * 
     */
    public double getLimiteCredito() {
        return limiteCredito;
    }

    /**
     * Define el valor de la propiedad limiteCredito.
     * 
     */
    public void setLimiteCredito(double value) {
        this.limiteCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaInteres.
     * 
     */
    public double getTasaInteres() {
        return tasaInteres;
    }

    /**
     * Define el valor de la propiedad tasaInteres.
     * 
     */
    public void setTasaInteres(double value) {
        this.tasaInteres = value;
    }

}
