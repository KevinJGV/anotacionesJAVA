package com.c3.anotaciones.controlador;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c3.anotaciones.entidad.producto;

@RestController
public class restController {

    @GetMapping("/api/productos")
    public static ArrayList<producto> getProductos() {
        return request.getProductos();
    }

}
