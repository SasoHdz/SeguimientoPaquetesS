package com.itq.seguimientopaquetes.business;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Paquete;
import com.itq.seguimientopaquetes.entity.Paquetes;
import com.itq.seguimientopaquetes.entity.paqueteRepository;

@Component
public class PaqueteService {

	@Autowired
	private paqueteRepository paqueteRepository;

	public Ack insertarPaquete(Paquete paquete) {

		Ack ack = new Ack();
		System.out.println("Paquete Recibido: '" + paquete.getDescripcion() + "'");
		
		Date fechaHoy = new Date(System.currentTimeMillis());
		Paquetes pack = new Paquetes(paquete.getDescripcion(),paquete.getPeso(),paquete.getDimensiones(),paquete.getDireccionEntrega().toString(),fechaHoy,paquete.getEstado(),Integer.valueOf(paquete.getIdRemitente()),Integer.valueOf(paquete.getIdDestinatario()));
		paqueteRepository.save(pack);
	
		ack.setDescription("Paquete creado con exito");
		ack.setCode(pack.getIdPaquete());
		
		return ack;
	}

}
