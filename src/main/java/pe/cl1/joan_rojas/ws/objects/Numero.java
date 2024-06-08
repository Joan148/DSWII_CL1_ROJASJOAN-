//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 06:28:38 PM PET 
//


package pe.cl1.joan_rojas.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Numero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Numero"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="limite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="suma" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Numero", propOrder = {
    "limite",
    "suma"
})
public class Numero {

    protected int limite;
    protected int suma;

    /**
     * Obtiene el valor de la propiedad limite.
     * 
     */
    public int getLimite() {
        return limite;
    }

    /**
     * Define el valor de la propiedad limite.
     * 
     */
    public void setLimite(int value) {
        this.limite = value;
    }

    /**
     * Obtiene el valor de la propiedad suma.
     * 
     */
    public int getSuma() {
        return suma;
    }

    /**
     * Define el valor de la propiedad suma.
     * 
     */
    public void setSuma(int value) {
        this.suma = value;
    }

}
