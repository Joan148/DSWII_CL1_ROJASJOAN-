//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 05:14:05 PM PET 
//


package pe.cl1.joan_rojas.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Tiempo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Tiempo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minutos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="segundos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tiempo", propOrder = {
    "minutos",
    "segundos"
})
public class Tiempo {

    protected int minutos;
    protected int segundos;

    /**
     * Obtiene el valor de la propiedad minutos.
     * 
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Define el valor de la propiedad minutos.
     * 
     */
    public void setMinutos(int value) {
        this.minutos = value;
    }

    /**
     * Obtiene el valor de la propiedad segundos.
     * 
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Define el valor de la propiedad segundos.
     * 
     */
    public void setSegundos(int value) {
        this.segundos = value;
    }

}
