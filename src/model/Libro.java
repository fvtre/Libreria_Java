/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ismae
 */
public class Libro {
    private int id;
    private String titulo;
    private String isbn;
    private short paginas;
    private int precio;
    private short anio;
    private String genero;
    private String editorial;
    
    public Libro(int id, String titulo, String isbn, short paginas, int precio, short anio, String genero, String editorial) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = paginas;
        this.precio = precio;
        this.anio = anio;
        this.genero = genero;
        this.editorial = editorial;        
    }

    public Libro() {
        
    }

    @Override
    public String toString() {
        return titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public short getPaginas() {
        return paginas;
    }

    public void setPaginas(short paginas) {
        this.paginas = paginas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public short getAnio() {
        return anio;
    }

    public void setAnio(short anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
        public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
