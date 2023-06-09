package com.itq.seguimientopaquetes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.seguimientopaquetes.business.SeguimientoService;
import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.EstadoType;
import com.itq.seguimientopaquetes.dto.IdPaquete;

@Endpoint
public class SeguimientoEndPoint {
    @Autowired SeguimientoService seguimientoService;

    private static final String NAMESPACE_URI = "http://com.rastreo";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "idPaquete")
	@ResponsePayload

    public Ack seguimientoOperation(@RequestPayload IdPaquete idPaquete){
        System.out.println("Llegue a seguimiento registration");
        Ack response = seguimientoService.seguimientoOperation(idPaquete);
        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "estadoType")
	@ResponsePayload

    public Ack actualizarPaqueteOperation(@RequestPayload EstadoType request){
        System.out.println("Llegue actualizar paquete operation");
        Ack response = seguimientoService.actualizarPaqueteOperation(request);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "crearSeguimiento")
	@ResponsePayload

    public Ack crearSequimientoOperation(@RequestPayload IdPaquete request){
        System.out.println("Crear Seguimiento");
        Ack response = seguimientoService.crearSequimientoOperation(request);
        return response;
    }
}
