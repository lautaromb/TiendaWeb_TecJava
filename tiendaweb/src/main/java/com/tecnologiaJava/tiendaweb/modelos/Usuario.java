package com.tecnologiaJava.tiendaweb.modelos;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreUsuario;
    private String password;
    private String rol; // "CLIENTE" o "EMPLEADO"

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private CuentaSaldo cuentaSaldo;
}
