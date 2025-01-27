package com.c3.anotaciones;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class bienvenidos {
    
    @GetMapping("/bienvenida")
    public String getMethodName() {
        return "bienvenida";
    }
}
