
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
 *         &lt;element name="cuentasResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cuentasResult"
})
@XmlRootElement(name = "cuentasResponse")
public class CuentasResponse {

    protected String cuentasResult;

    /**
     * Obtiene el valor de la propiedad cuentasResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentasResult() {
        return cuentasResult;
    }

    /**
     * Define el valor de la propiedad cuentasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentasResult(String value) {
        this.cuentasResult = value;
    }

}
