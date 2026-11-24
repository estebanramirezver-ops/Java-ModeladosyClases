package com.example;

public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int anioPublicacion;
    private double precio;
    private int stock;

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion < 0)
            System.out.println("El año ingresado es incorrecto, ingrese otro");
        else {
            this.anioPublicacion = anioPublicacion;
        }
    }

    public void setPrecio(double precio) {
        if (precio < 0)
            System.out.println("El precio ingresado es negativo, ingrese el precio correcto");
        else {
            this.precio = precio;
        }
    }

    public void setStock(int stock) {
        if (stock < 0)
            System.out.println("El número ingresado es negativo, vuelva a intentarlo");
        else {
            this.stock = stock;
        }
    }

    public Libro(String isbn) {
        this(isbn, "Desconocido");
    }

    public Libro(String isbn, String titulo) {
        this(isbn, titulo, null);
    }

    public Libro(String isbn, String titulo, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = 0;
        this.precio = 0;
        this.stock = 0;
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion) {
        this(isbn, titulo, autor);
        setAnioPublicacion(anioPublicacion);
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion, double precio) {
        this(isbn, titulo, autor, anioPublicacion);
        setPrecio(precio);
    }

    public Libro(String isbn, String titulo, Autor autor, int anioPublicacion, double precio, int stock) {
        this(isbn, titulo, autor, anioPublicacion, precio);
        setStock(stock);
    }

    @Override
    public String toString() {
        String nombreAutor = (autor == null) ? "Desconocido" : autor.getNombre();

        return "ISBN: " + isbn
                + "\nTítulo del libro: " + titulo
                + "\nAutor del libro: " + nombreAutor
                + "\nAño de publicación: " + anioPublicacion
                + "\nPrecio del libro: " + precio
                + "\nStock del libro: " + stock;
    }
}
