package com.itq.seguimientopaquetes.entity;

import javax.persistence.*;

@Entity
@Table(name = "UBICACIONES")
public class Ubicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UBICACION")
    private Integer idUbicacion;

    @Column(name = "LATITUD")
    private String latitud;
    
    @Column(name = "LONGITUD")
    private String longitud;

    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    

    // Constructor vacío necesario para JPA
    public Ubicaciones() {}

    public Ubicaciones(String latitud, String longitud, String descripcion){
        this.latitud = latitud;
        this.longitud = longitud;
        this.descripcion = descripcion;
    }

    public Integer getIdUbicacion() {
        return idUbicacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
