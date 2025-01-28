package com.c3.anotaciones.controlador;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c3.anotaciones.entidad.producto;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class request {

    private static ArrayList<producto> productos = new ArrayList();

    public static ArrayList<producto> getProductos() {
        return productos;
    }
        
    @GetMapping("/forms")
    public String getMethodName() {
        return "forms";
    }
    
    @PostMapping("/api/producto")
    @ResponseBody
    public producto postMethodName(@RequestParam String name, @RequestParam int price, @RequestParam String desc) {
        producto producto = new producto(name, price, desc);
        productos.add(producto);
        return producto;
    }
}
