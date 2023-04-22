package com.itq.seguimientopaquetes.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paqueteRepository extends JpaRepository<Paquete, Integer> {
    // Aquí se pueden agregar métodos personalizados para paqueteRepository, si es necesario
}
