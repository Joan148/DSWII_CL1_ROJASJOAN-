//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 05:14:05 PM PET 
//


package pe.cl1.joan_rojas.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Estudiante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Estudiante"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nota1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nota2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nota3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nota4" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nota_menor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="promedio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estudiante", propOrder = {
    "nota1",
    "nota2",
    "nota3",
    "nota4",
    "notaMenor",
    "promedio"
})
public class Estudiante {

    protected int nota1;
    protected int nota2;
    protected int nota3;
    protected int nota4;
    @XmlElement(name = "nota_menor")
    protected int notaMenor;
    protected double promedio;

    /**
     * Obtiene el valor de la propiedad nota1.
     * 
     */
    public int getNota1() {
        return nota1;
    }

    /**
     * Define el valor de la propiedad nota1.
     * 
     */
    public void setNota1(int value) {
        this.nota1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota2.
     * 
     */
    public int getNota2() {
        return nota2;
    }

    /**
     * Define el valor de la propiedad nota2.
     * 
     */
    public void setNota2(int value) {
        this.nota2 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota3.
     * 
     */
    public int getNota3() {
        return nota3;
    }

    /**
     * Define el valor de la propiedad nota3.
     * 
     */
    public void setNota3(int value) {
        this.nota3 = value;
    }

    /**
     * Obtiene el valor de la propiedad nota4.
     * 
     */
    public int getNota4() {
        return nota4;
    }

    /**
     * Define el valor de la propiedad nota4.
     * 
     */
    public void setNota4(int value) {
        this.nota4 = value;
    }

    /**
     * Obtiene el valor de la propiedad notaMenor.
     * 
     */
    public int getNotaMenor() {
        return notaMenor;
    }

    /**
     * Define el valor de la propiedad notaMenor.
     * 
     */
    public void setNotaMenor(int value) {
        this.notaMenor = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio.
     * 
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Define el valor de la propiedad promedio.
     * 
     */
    public void setPromedio(double value) {
        this.promedio = value;
    }

}
