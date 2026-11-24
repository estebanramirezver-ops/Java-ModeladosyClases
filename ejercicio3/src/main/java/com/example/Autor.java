package com.example;

import java.time.Year;

public class Autor {
    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    public String getIdAutor() {
        return idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento < 1900 || anioNacimiento > Year.now().getValue())
            System.out.println("El año de nacimiento ingresado es negativo o no concuerda con el actual, ingrese uno adecuado");
        else {
            this.anioNacimiento = anioNacimiento;
        }
    }

    public Autor(String idAutor) {
        this(idAutor, "Desconocido");
    }

    public Autor(String idAutor, String nombre) {
        this(idAutor, nombre, "Desconocida");
    }

    public Autor(String idAutor, String nombre, String nacionalidad) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = 0;
    }

    public Autor(String idAutor, String nombre, String nacionalidad, int anioNacimiento) {
        this(idAutor, nombre, nacionalidad);
        setAnioNacimiento(anioNacimiento);
    }

    @Override
    public String toString() {
        return "Id del autor: " + idAutor + "\nNombre del autor: " + nombre + "\nNacionalidad: " + nacionalidad + "\nAño de nacimiento: " + anioNacimiento;
    }
}
