package com.tecnologiaJava.tiendaweb.modelos;

import jakarta.persistence.*;

@Entity
public class CuentaSaldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double saldo;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
