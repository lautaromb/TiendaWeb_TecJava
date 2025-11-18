package com.tecnologiaJava.tiendaweb.repository;

import com.tecnologiaJava.tiendaweb.modelos.CuentaSaldo;
import com.tecnologiaJava.tiendaweb.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CuentaSaldoRepository extends JpaRepository<CuentaSaldo, Long> {
    Optional<CuentaSaldo> findByUsuario(Usuario usuario);
}
