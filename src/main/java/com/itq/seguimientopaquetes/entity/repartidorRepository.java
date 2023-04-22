package com.itq.seguimientopaquetes.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repartidorRepository extends JpaRepository<Repartidor, Integer> {
    // Aquí se pueden agregar métodos personalizados para repartidorRepository, si es necesario
}
