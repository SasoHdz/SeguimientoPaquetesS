//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.19 at 11:00:40 PM CST 
//


package com.itq.seguimientopaquetes.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPaquete"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idRemitente"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idDestinatario"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direccionEntrega" type="{}direccionEnvioType"/&gt;
 *         &lt;element name="fechaEnvio" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dimensiones" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="peso" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="estado" type="{}estadoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idPaquete",
    "idRemitente",
    "idDestinatario",
    "descripcion",
    "direccionEntrega",
    "fechaEnvio",
    "dimensiones",
    "peso",
    "estado"
})
@XmlRootElement(name = "paquete")
public class Paquete {

    @XmlElement(required = true)
    protected String idPaquete;
    @XmlElement(required = true)
    protected String idRemitente;
    @XmlElement(required = true)
    protected String idDestinatario;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected DireccionEnvioType direccionEntrega;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEnvio;
    @XmlElement(required = true)
    protected BigDecimal dimensiones;
    @XmlElement(required = true)
    protected BigDecimal peso;
    @XmlElement(required = true)
    protected EstadoType estado;

    /**
     * Gets the value of the idPaquete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPaquete() {
        return idPaquete;
    }

    /**
     * Sets the value of the idPaquete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPaquete(String value) {
        this.idPaquete = value;
    }

    /**
     * Gets the value of the idRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRemitente() {
        return idRemitente;
    }

    /**
     * Sets the value of the idRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRemitente(String value) {
        this.idRemitente = value;
    }

    /**
     * Gets the value of the idDestinatario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDestinatario() {
        return idDestinatario;
    }

    /**
     * Sets the value of the idDestinatario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDestinatario(String value) {
        this.idDestinatario = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the direccionEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link DireccionEnvioType }
     *     
     */
    public DireccionEnvioType getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Sets the value of the direccionEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionEnvioType }
     *     
     */
    public void setDireccionEntrega(DireccionEnvioType value) {
        this.direccionEntrega = value;
    }

    /**
     * Gets the value of the fechaEnvio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Sets the value of the fechaEnvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEnvio(XMLGregorianCalendar value) {
        this.fechaEnvio = value;
    }

    /**
     * Gets the value of the dimensiones property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDimensiones() {
        return dimensiones;
    }

    /**
     * Sets the value of the dimensiones property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDimensiones(BigDecimal value) {
        this.dimensiones = value;
    }

    /**
     * Gets the value of the peso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeso() {
        return peso;
    }

    /**
     * Sets the value of the peso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeso(BigDecimal value) {
        this.peso = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoType }
     *     
     */
    public EstadoType getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoType }
     *     
     */
    public void setEstado(EstadoType value) {
        this.estado = value;
    }

}
