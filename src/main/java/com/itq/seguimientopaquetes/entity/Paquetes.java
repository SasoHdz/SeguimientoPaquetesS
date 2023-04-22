package com.itq.seguimientopaquetes.entity;

import java.sql.Date;
//import java.util.List;

import javax.persistence.*;
import javax.persistence.Table;


@Entity
@Table(name = "PAQUETES")
public class Paquetes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAQUETE")
    private Integer idPaquete;
    
    @Column(name = "DESCRIPCION")
    private String descripcion;
    
    @Column(name = "PESO")
    private Float peso;
    
    @Column(name = "DIMENSIONES")
    private String dimensiones;
    
    @Column(name = "DIRECCION_ENTREGA")
    private String direccionEntrega;
    
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;
    
    @Column(name = "ESTADO")
    private String estado;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO_REMITENTE")
    private Usuario remitente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO_DESTINATARIO")
    private Usuario destinatario;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UBICACION")
    private Ubicaciones ubicacion;
    
    //@OneToMany(mappedBy = "paquete")
    //private List<RegistroPaquete> registroPaquetes;

    // constructor vacío
    public Paquetes() {
    }

    // constructor con parámetros
    public Paquetes(String descripcion, Float peso, String dimensiones, String direccionEntrega, Date fechaCreacion, String estado, Usuario remitente, Usuario destinatario, Ubicaciones ubicacion) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.dimensiones = dimensiones;
        this.direccionEntrega = direccionEntrega;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.ubicacion = ubicacion;
    }
    
    // getters y setters
    public Integer getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Integer idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getRemitente() {
        return remitente;
    }

    public void setRemitente(Usuario remitente) {
        this.remitente = remitente;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Usuario destinatario) {
        this.destinatario = destinatario;
    }

    public Ubicaciones getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicaciones ubicacion) {
        this.ubicacion = ubicacion;
    }

}
