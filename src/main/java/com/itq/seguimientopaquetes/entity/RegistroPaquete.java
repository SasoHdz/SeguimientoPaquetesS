package com.itq.seguimientopaquetes.entity;


import java.sql.Date;

import javax.persistence.*;

@Entity
public class RegistroPaquete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PAQUETE")
    private Integer idRegistro;

	private Date fechaHoraCambio;

	private String estadoAnterior;

	private String estadoNuevo;

	@ManyToOne
	@JoinColumn(name = "idRepartidor")
	private Repartidor repartidor;

	@ManyToOne
	@JoinColumn(name = "idPaquete")
	private Paquetes paquete;

	@ManyToOne
	@JoinColumn(name = "idUbicacion")
	private Ubicaciones ubicacionPaquete;

	public Integer getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(Integer idRegistro) {
		this.idRegistro = idRegistro;
	}

	public Date getFechaHoraCambio() {
		return fechaHoraCambio;
	}

	public void setFechaHoraCambio(Date fechaHoraCambio) {
		this.fechaHoraCambio = fechaHoraCambio;
	}

	public String getEstadoAnterior() {
		return estadoAnterior;
	}

	public void setEstadoAnterior(String estadoAnterior) {
		this.estadoAnterior = estadoAnterior;
	}

	public String getEstadoNuevo() {
		return estadoNuevo;
	}

	public void setEstadoNuevo(String estadoNuevo) {
		this.estadoNuevo = estadoNuevo;
	}

	public Repartidor getRepartidor() {
		return repartidor;
	}

	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}

	public Paquetes getPaquete() {
		return paquete;
	}

	public void setPaquete(Paquetes paquete) {
		this.paquete = paquete;
	}

	public Ubicaciones getUbicacionPaquete() {
		return ubicacionPaquete;
	}

	public void setUbicacionPaquete(Ubicaciones ubicacionPaquete) {
		this.ubicacionPaquete = ubicacionPaquete;
	}

}

