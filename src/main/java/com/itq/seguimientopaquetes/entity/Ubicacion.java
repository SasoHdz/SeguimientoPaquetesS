package com.itq.seguimientopaquetes.entity;

import javax.persistence.*;

@Entity
@Table(name = "UBICACIONES_PAQUETE")
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UBICACION")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_PAQUETE")
    private Paquete paquete;

    // Constructor vacío necesario para JPA
    public Ubicacion() {}

    public Ubicacion(Paquete paquete) {
        this.paquete = paquete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
}
