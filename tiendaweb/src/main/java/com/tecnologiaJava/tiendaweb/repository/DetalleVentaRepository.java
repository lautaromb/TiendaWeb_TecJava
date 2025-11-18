package com.tecnologiaJava.tiendaweb.repository;

import com.tecnologiaJava.tiendaweb.modelos.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
}
