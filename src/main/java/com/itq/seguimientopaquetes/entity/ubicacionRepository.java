package com.itq.seguimientopaquetes.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ubicacionRepository extends JpaRepository<Ubicaciones, Integer>{
    // Aquí se pueden agregar métodos personalizados para ubicacionRepository, si es necesario
}
