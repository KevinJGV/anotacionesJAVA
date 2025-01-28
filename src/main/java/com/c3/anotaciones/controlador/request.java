package com.c3.anotaciones.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c3.anotaciones.entidades.producto;



@Controller
public class request {

    @GetMapping("/api/producto")
    @ResponseBody
    public producto getMethodName() {
        producto producto = new producto("Leche asada", 5000, "Leche asada de 250g marca ACME");
        return producto;
    }
    
}
