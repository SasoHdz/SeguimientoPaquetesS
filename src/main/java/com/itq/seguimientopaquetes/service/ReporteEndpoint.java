package com.itq.seguimientopaquetes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.itq.seguimientopaquetes.business.ReporteService;
import com.itq.seguimientopaquetes.dto.Ack;

@Endpoint
public class ReporteEndpoint {
    @Autowired ReporteService reporteService;

    private static final String NAMESPACE_URI = "http://com.rastreo";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ack")
	@ResponsePayload

    public String reporteDiarioPaquetes(@RequestPayload Ack request){
        String reporte = reporteService.reporteDiarioPaquetes();

        return reporte;
    } 
}
