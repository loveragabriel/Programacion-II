/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Gabriel
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) == null) {
            Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(nuevoLibro);
            System.out.printf(" Libro agregado: \"%s\".\n", titulo);
        } else {
            System.out.printf("  ERROR: Ya existe un libro con ISBN %s.\n", isbn);
        }
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println(" ️ La biblioteca no contiene libros.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfoCompleta();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.printf("   Libro eliminado: \"%s\".\n", libroAEliminar.getTitulo());
            return true;
        }
        System.out.printf("  ERROR: Libro con ISBN %s no encontrado.\n", isbn);
        return false;
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        System.out.printf(" Libros publicados en el año %d ---\n", anio);
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
                libro.mostrarInfo();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println(" No se encontraron libros publicados en ese año.");
        }
        return filtrados;
    }

    public void mostrarAutoresDisponibles() {
        Set<String> autoresNombres = new HashSet<>();
        for (Libro libro : libros) {
            autoresNombres.add(libro.getAutor().getNombre());
        }

        System.out.println("Autores Únicos Disponibles en la Biblioteca");
        if (autoresNombres.isEmpty()) {
            System.out.println("No hay autores disponibles.");
            return;
        }

        for (String nombre : autoresNombres) {
            System.out.printf("  • %s\n", nombre);
        }

    }
}
