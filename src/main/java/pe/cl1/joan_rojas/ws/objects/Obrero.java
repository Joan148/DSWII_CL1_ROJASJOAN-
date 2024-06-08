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
 * <p>Clase Java para obrero complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obrero"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="horas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salario_hora" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="salario_horaextra" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="horas_limite" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="horas_extra" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salario_final" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obrero", propOrder = {
    "horas",
    "salarioHora",
    "salarioHoraextra",
    "horasLimite",
    "horasExtra",
    "salarioFinal"
})
public class Obrero {

    protected int horas;
    @XmlElement(name = "salario_hora")
    protected double salarioHora;
    @XmlElement(name = "salario_horaextra")
    protected double salarioHoraextra;
    @XmlElement(name = "horas_limite")
    protected int horasLimite;
    @XmlElement(name = "horas_extra")
    protected int horasExtra;
    @XmlElement(name = "salario_final")
    protected double salarioFinal;

    /**
     * Obtiene el valor de la propiedad horas.
     * 
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Define el valor de la propiedad horas.
     * 
     */
    public void setHoras(int value) {
        this.horas = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioHora.
     * 
     */
    public double getSalarioHora() {
        return salarioHora;
    }

    /**
     * Define el valor de la propiedad salarioHora.
     * 
     */
    public void setSalarioHora(double value) {
        this.salarioHora = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioHoraextra.
     * 
     */
    public double getSalarioHoraextra() {
        return salarioHoraextra;
    }

    /**
     * Define el valor de la propiedad salarioHoraextra.
     * 
     */
    public void setSalarioHoraextra(double value) {
        this.salarioHoraextra = value;
    }

    /**
     * Obtiene el valor de la propiedad horasLimite.
     * 
     */
    public int getHorasLimite() {
        return horasLimite;
    }

    /**
     * Define el valor de la propiedad horasLimite.
     * 
     */
    public void setHorasLimite(int value) {
        this.horasLimite = value;
    }

    /**
     * Obtiene el valor de la propiedad horasExtra.
     * 
     */
    public int getHorasExtra() {
        return horasExtra;
    }

    /**
     * Define el valor de la propiedad horasExtra.
     * 
     */
    public void setHorasExtra(int value) {
        this.horasExtra = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioFinal.
     * 
     */
    public double getSalarioFinal() {
        return salarioFinal;
    }

    /**
     * Define el valor de la propiedad salarioFinal.
     * 
     */
    public void setSalarioFinal(double value) {
        this.salarioFinal = value;
    }

}
