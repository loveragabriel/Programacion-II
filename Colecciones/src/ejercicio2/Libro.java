/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author Gabriel
 */
public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.printf("  - Título: %s (ISBN: %s, Año: %d)\n", titulo, isbn, anioPublicacion);
        System.out.printf("    Autor: %s\n", autor.toString()); // Usa el toString de Autor
    }

    public void mostrarInfoCompleta() {
        System.out.printf("  - Título: %s (ISBN: %s, Año: %d)\n", titulo, isbn, anioPublicacion);
        System.out.print("    Autor: ");
        autor.mostrarInfo();
    }

}
