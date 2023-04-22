package com.itq.seguimientopaquetes.business;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Paquete;
import com.itq.seguimientopaquetes.entity.Paquetes;
import com.itq.seguimientopaquetes.entity.Ubicaciones;
import com.itq.seguimientopaquetes.entity.Usuario;
import com.itq.seguimientopaquetes.entity.paqueteRepository;
import com.itq.seguimientopaquetes.entity.registroPaqueteRepository;
import com.itq.seguimientopaquetes.entity.ubicacionRepository;
import com.itq.seguimientopaquetes.entity.usuarioRepository;

@Component
public class PaqueteService { 

	@Autowired
    private paqueteRepository paqueteRepository;

    public Ack insertarPaquete(Paquete paquete) {

		Ack ack = new Ack();
		System.out.println("Paquete Recibido: '" + paquete.getDescripcion() + "'");
		Usuario remitente = new Usuario();
		Usuario destinatario = new Usuario();
		Ubicaciones ubicacion = new Ubicaciones();
		Date fecha = Date.valueOf("2023-04-21");
		Paquetes pack = new Paquetes("descripcion", (float) 25, "dimensiones", "direccionEntrega", fecha, "estado",  remitente,  destinatario, ubicacion);
		paqueteRepository.save(pack);

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
