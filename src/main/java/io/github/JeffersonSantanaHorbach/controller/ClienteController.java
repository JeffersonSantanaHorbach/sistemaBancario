package io.github.JeffersonSantanaHorbach.controller;

import io.github.JeffersonSantanaHorbach.domain.entity.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    private final Cliente cliente;

    public ClienteController( Cliente cliente ) {
        this.cliente = cliente;
    }

    @GetMapping("{id}")
    public Cliente getClienteById (@PathVariable Integer id){
        return cliente;
    }
}
