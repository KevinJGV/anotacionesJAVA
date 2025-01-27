package com.c3.anotaciones;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class bienvenidos {
    
    @GetMapping("/bienvenida")
    public String getMethodName(@RequestParam String param) {
        
        return "";
    }
}
