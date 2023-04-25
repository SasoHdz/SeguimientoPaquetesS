package com.itq.seguimientopaquetes.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.seguimientopaquetes.business.PaqueteService;
import com.itq.seguimientopaquetes.dto.Ack;
import com.itq.seguimientopaquetes.dto.Paquete;

@Endpoint 
public class PaqueteEndpoint {

	@Autowired PaqueteService paqueteService;

    private static final String NAMESPACE_URI = "http://com.rastreo";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "paquete")
	@ResponsePayload

    public Ack insertarPaquete(@RequestPayload Paquete request){
        System.out.println("OperacionInsertarPaquete:");
        Ack response = paqueteService.insertarPaquete(request);
        return response;
    }
    
}