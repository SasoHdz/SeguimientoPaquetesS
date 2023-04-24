package com.itq.seguimientopaquetes.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface paqueteRepository extends JpaRepository<Paquetes, Integer> {
    // Aquí se pueden agregar métodos personalizados para paqueteRepository, si es necesario
}
