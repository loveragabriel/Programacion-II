/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author lover
 */
public class MainBiblioteca {

    public static void main(String[] args) {

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca");

        // Crear autores
        System.out.println("Creación de Autores");
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A2", "Julio Cortázar", "Argentino");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chilena");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();

// Agregar libro a los autores
        biblioteca.agregarLibro("978-1234567890", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0987654321", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("978-1112223334", "Crónica de una muerte anunciada", 1981, autor1);
        biblioteca.agregarLibro("978-4445556667", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("978-7778889990", "Bestiario", 1951, autor2);
// Listar libros
        System.out.println("Listado Completo de Libros y Autores");
        biblioteca.listarLibros();

        // Buscar libro por codigo 
        System.out.println("Búsqueda por ISBN (978-0987654321)");
        Libro buscado = biblioteca.buscarLibroPorIsbn("978-0987654321");
        if (buscado != null) {
            System.out.println(" Libro encontrado:");
            buscado.mostrarInfoCompleta();
        } else {
            System.out.println(" Libro no encontrado.");
        }

//Filtar libro por añoo
        System.out.println("Filtrado por Año de Publicación (1981)");
        biblioteca.filtrarLibrosPorAnio(1981);

        // Eliminar libro por codigo
        biblioteca.eliminarLibro("978-7778889990");

        System.out.println("\nLibros restantes en la biblioteca:");
        biblioteca.listarLibros();

//Listar los libros
        System.out.println("Cantidad Total de Libros");
        System.out.printf(" Total de libros en la biblioteca: %d\n", biblioteca.obtenerCantidadLibros());

    }
}
