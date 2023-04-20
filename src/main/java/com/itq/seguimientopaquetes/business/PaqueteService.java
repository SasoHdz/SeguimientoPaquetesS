package com.itq.seguimientopaquetes.business;

import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Paquete;

@Component
public class PaqueteService {
    public Ack insertarPaquete(Paquete pac) {
		Ack ack = new Ack();
		System.out.println("Paquete Recibido: '" + pac.getDescripcion() + "'");

		ack.setDescription("dsdasd");
		
		ack.setCode(0);
		
		return ack;
	}
}
