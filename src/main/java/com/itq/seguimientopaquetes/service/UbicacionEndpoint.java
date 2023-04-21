package com.itq.seguimientopaquetes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.seguimientopaquetes.business.UbicacionService;
import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Ubicacion;

@Endpoint
public class UbicacionEndpoint {

    @Autowired UbicacionService ubicacionService;

    private static final String NAMESPACE_URI = "http://com.rastreo";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ubicacion")
    @ResponsePayload

    public Ack creacionUbicacionOperation(@RequestPayload Ubicacion request) {
        System.out.println("Llegue a paquete registration");
        Ack response = ubicacionService.creacionUbicacionOperation(request);
        return response;
    }

}
