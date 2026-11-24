package com.example;

public class User {
    private String idUser;
    private String nombre;
    private String email;
    private int librosPrestados;

    public String getIdUser() {
        return idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLibrosPrestados(int librosPrestados) {
        if (librosPrestados < 0)
            System.out.println("Ingrese un valor que no sea negativo");
        else {
            this.librosPrestados = librosPrestados;
        }
    }

    public User(String idUser) {
        this(idUser, "Desconocido");
    }

    public User(String idUser, String nombre) {
        this(idUser, nombre, "Desconocido");
    }

    public User(String idUser, String nombre, String email) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.email = email;
        this.librosPrestados = 0;
    }

    public User(String idUser, String nombre, String email, int librosPrestados) {
        this(idUser, nombre, email);
        setLibrosPrestados(librosPrestados);
    }

    @Override
    public String toString() {
        return "ID del usuario: " + idUser + "\nNombre del usuario: " + nombre + "\nCorreo electrónico: " + email + "\nLibros Prestados: " + librosPrestados;
    }
}
