package com.itq.seguimientopaquetes.entity;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

//import com.itq.seguimientopaquetes.dto.Cliente;
//import com.itq.seguimientopaquetes.entity.Usuario;

@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Integer> {
    // Aquí se pueden agregar métodos personalizados para usuarioRepository, si es necesario
}
