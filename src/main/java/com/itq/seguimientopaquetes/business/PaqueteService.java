package com.itq.seguimientopaquetes.business;

import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Paquete;

@Component
public class PaqueteService { 
    public Ack insertarPaquete(Paquete paquete) {
		Ack ack = new Ack();
		System.out.println("Paquete Recibido: '" + paquete.getDescripcion() + "'");

		ack.setDescription("dsdasd");
		
		ack.setCode(0);
		
		return ack;
	}

	public Ack llegoId(String idPaquete){
		Ack ack = new Ack();
		System.out.println("idPaquete Recibida");
		
		return ack;
	}
}
