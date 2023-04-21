package com.itq.seguimientopaquetes.business;

import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Ubicacion;

@Component
public class UbicacionService {
    public Ack creacionUbicacionOperation(Ubicacion ubicacion) {
		Ack ack = new Ack();
		System.out.println("Ubicacion Creada");

		ack.setDescription("dsdasd");
		
		ack.setCode(0);
		
		return ack;
	}

}
