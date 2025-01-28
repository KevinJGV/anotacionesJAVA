package com.c3.anotaciones.entidad;

public class cliente {
    private int id;
    private String nombre;
    private int edad;
    public cliente(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
}
