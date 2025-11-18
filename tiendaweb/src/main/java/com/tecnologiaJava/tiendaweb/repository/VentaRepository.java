package com.tecnologiaJava.tiendaweb.repository;

import com.tecnologiaJava.tiendaweb.modelos.Usuario;
import com.tecnologiaJava.tiendaweb.modelos.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaRepository extends JpaRepository <Venta, Long> {
    List<Venta> findByUsuario(Usuario usuario);
    List<Venta> findByEntregada(Boolean entregada);
}
