package com.itq.seguimientopaquetes.business;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.itq.seguimientopaquetes.entity.Paquetes;
import com.itq.seguimientopaquetes.entity.paqueteRepository;

@Component
public class ReporteService {
    @Autowired
    private paqueteRepository paqueteRepository;

    public String reporteDiarioPaquetes() {
        /*
         * SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
         */
        Date fechaInicio = Date.valueOf("2023-04-20");
        Date fechaFin = Date.valueOf(LocalDate.now());

        System.out.println("fecha inicio: " + fechaInicio);
        System.out.println("fecha fin: " + fechaFin);

        List<Paquetes> reporteHoy = paqueteRepository.findByFechaCreacionBetweenAndFechaCreacion(fechaInicio, fechaFin,
                fechaFin);
        StringBuilder reportes = new StringBuilder();
        reporteHoy.forEach(reporte -> {
            reportes.append("\n ").append(reporte.toString());
            System.out.println(reporte.toString());
        });

        System.out.println("Reporte Hoy:" + reportes);

        return reportes.toString();
    }

}
