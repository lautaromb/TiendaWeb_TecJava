package com.tecnologiaJava.tiendaweb.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CuentaSaldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double saldo;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
