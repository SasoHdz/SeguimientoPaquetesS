package com.itq.seguimientopaquetes.business;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Paquete;
import com.itq.seguimientopaquetes.entity.Paquetes;
import com.itq.seguimientopaquetes.entity.Usuario;
import com.itq.seguimientopaquetes.entity.paqueteRepository;
/* import com.itq.seguimientopaquetes.entity.usuarioRepository;
 */
@Component
public class PaqueteService { 
    @Autowired
	private paqueteRepository paqueteRepository;
/* 	private usuarioRepository usuarioRepository;
 */
	public Ack insertarPaquete(Paquete paquete) {

		Ack ack = new Ack();
		System.out.println("Paquete Recibido: '" + paquete.getDescripcion() + "'");
		
		Date fechaHoy = new Date(System.currentTimeMillis());
		
		Usuario remitente = new Usuario(Integer.parseInt(paquete.getIdRemitente()));
		Usuario destinatario = new Usuario(Integer.parseInt(paquete.getIdDestinatario()));
		System.out.println(remitente);

		Paquetes pack = new Paquetes(paquete.getDescripcion(),paquete.getPeso(),paquete.getDimensiones(),paquete.getDireccionEntrega(),fechaHoy,paquete.getEstado(),remitente,destinatario);
		paqueteRepository.save(pack);
	
		ack.setDescription("Paquete creado con exito su id es:");
		ack.setCode(pack.getIdPaquete());
		
		return ack;
	}
	
}
