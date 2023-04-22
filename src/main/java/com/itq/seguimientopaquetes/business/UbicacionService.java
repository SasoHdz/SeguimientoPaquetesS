package com.itq.seguimientopaquetes.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Ubicacion;
import com.itq.seguimientopaquetes.entity.Ubicaciones;
import com.itq.seguimientopaquetes.entity.ubicacionRepository;

@Component
public class UbicacionService {
	@Autowired
	private ubicacionRepository ubicacionRepository;

	public Ack creacionUbicacionOperation(Ubicacion ubicacion) {
		ubicacionRepository
				.save(new Ubicaciones(ubicacion.getLatitud(), ubicacion.getLongitud(), ubicacion.getDescripcion()));

		Ack ack = new Ack();
		System.out.println("Ubicacion:" + ubicacion.getDescripcion() + "creada con exito");

		ack.setDescription("Ubicacion:" + ubicacion.getDescripcion() + "creada exitosamente");
		ack.setCode(1);

		return ack;
	}

}
