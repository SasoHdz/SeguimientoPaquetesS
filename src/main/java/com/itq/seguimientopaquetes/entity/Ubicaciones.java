package com.itq.seguimientopaquetes.entity;

import javax.persistence.*;

@Entity
@Table(name = "UBICACIONES_PAQUETE")
public class Ubicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UBICACION")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ID_PAQUETE")
    private Paquetes paquete;

    // Constructor vacío necesario para JPA
    public Ubicaciones() {}

    public Ubicaciones(Paquetes paquete) {
        this.paquete = paquete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paquetes getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquetes paquete) {
        this.paquete = paquete;
    }
}
