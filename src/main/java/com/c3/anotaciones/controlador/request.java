package com.c3.anotaciones.controlador;

import org.springframework.web.bind.annotation.RestController;

import com.c3.anotaciones.entidad.cliente;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class request {
    @GetMapping("/api/clientes")
    public cliente[] getMethodName() {
        cliente[] clientes = new cliente[]{new cliente(0, "Sisero", 60), new cliente(1, "Fran", 30), new cliente(2, "Esteban", 43)};
        return clientes;
    }
    
}
