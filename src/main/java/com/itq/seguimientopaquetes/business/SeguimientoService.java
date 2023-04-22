package com.itq.seguimientopaquetes.business;

import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.EstadoType;
import com.itq.seguimientopaquetes.dto.IdPaquete;
import com.itq.seguimientopaquetes.entity.paqueteRepository;
import com.itq.seguimientopaquetes.entity.registroPaqueteRepository;
import com.itq.seguimientopaquetes.entity.ubicacionRepository;
import com.itq.seguimientopaquetes.entity.usuarioRepository;

@Component
public class SeguimientoService {
    public Ack seguimientoOperation(IdPaquete idPaquete) {
		Ack ack = new Ack();
		System.out.println("Paquete Recibido:"+idPaquete.getId());

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

	public Ack crearSequimientoOperation(IdPaquete idPaquete) {
		Ack ack = new Ack();
		System.out.println("Creacion Seguimiento");

		ack.setDescription("Creacion Seguimiento con idPaquete:"+idPaquete.getId());
		
		ack.setCode(1);
		
		return ack;
	}
}
