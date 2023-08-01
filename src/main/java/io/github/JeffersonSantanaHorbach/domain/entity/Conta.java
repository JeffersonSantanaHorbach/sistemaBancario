package io.github.JeffersonSantanaHorbach.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Conta{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer Id;

    @Column
    @NotEmpty(message = "{campo.agencia.obrigatorio}")
    private Integer agencia;

    @Column
    @NotEmpty(message = "{campo.numeroConta.obrigatorio}")
    private Integer numeroConta;

    @Column
    @NotEmpty(message = "{campo.titularConta.obrigatorio}")
    private String titularConta;

    @Column
    @NotEmpty(message = "{campo.saldo.obrigatorio}")
    private double saldo;


//    sacar
//    depositar
//    tarsnferir

}


