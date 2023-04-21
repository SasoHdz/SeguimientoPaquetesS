package com.itq.seguimientopaquetes.business;

import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.EstadoType;

@Component
public class SeguimientoService {
    public Ack seguimientoOperation(String idPaquete) {
		Ack ack = new Ack();
		System.out.println("Paquete Recibido:"+idPaquete);

		ack.setDescription("Paquete recibido");
		
		ack.setCode(0);
		
		return ack;
	}

	public Ack actualizarPaqueteOperation(EstadoType estadoType) {
		Ack ack = new Ack();
		System.out.println("Estado Actualizado");

		ack.setDescription("Estado Actualizado");
		
		ack.setCode(1);
		
		return ack;
	}
}
