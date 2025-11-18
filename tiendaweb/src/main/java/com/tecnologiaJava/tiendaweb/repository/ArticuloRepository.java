package com.tecnologiaJava.tiendaweb.repository;

import com.tecnologiaJava.tiendaweb.modelos.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    Optional<Articulo> findByCodigo(String codigo);
    List<Articulo> findByStockGreaterThan(Integer stock);
}
