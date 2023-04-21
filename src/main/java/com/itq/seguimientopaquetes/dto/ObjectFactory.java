//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.20 at 06:05:59 PM CST 
//


package com.itq.seguimientopaquetes.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itq.seguimiento-paquetes.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IdPaquete_QNAME = new QName("http://com.rastreo", "idPaquete");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itq.seguimiento-paquetes.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link Cliente.Direccion }
     * 
     */
    public Cliente.Direccion createClienteDireccion() {
        return new Cliente.Direccion();
    }

    /**
     * Create an instance of {@link Cliente.FechaNac }
     * 
     */
    public Cliente.FechaNac createClienteFechaNac() {
        return new Cliente.FechaNac();
    }

    /**
     * Create an instance of {@link Ack }
     * 
     */
    public Ack createAck() {
        return new Ack();
    }

    /**
     * Create an instance of {@link Paquete }
     * 
     */
    public Paquete createPaquete() {
        return new Paquete();
    }

    /**
     * Create an instance of {@link Repartidor }
     * 
     */
    public Repartidor createRepartidor() {
        return new Repartidor();
    }

    /**
     * Create an instance of {@link Ubicacion }
     * 
     */
    public Ubicacion createUbicacion() {
        return new Ubicacion();
    }

    /**
     * Create an instance of {@link DireccionEnvioType }
     * 
     */
    public DireccionEnvioType createDireccionEnvioType() {
        return new DireccionEnvioType();
    }

    /**
     * Create an instance of {@link EstadoType }
     * 
     */
    public EstadoType createEstadoType() {
        return new EstadoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://com.rastreo", name = "idPaquete")
    public JAXBElement<String> createIdPaquete(String value) {
        return new JAXBElement<String>(_IdPaquete_QNAME, String.class, null, value);
    }

}
