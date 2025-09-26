/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejerciciosadicionales;

/**
 *
 * @author Gabriel
 */
public class POOEjerciciosAdicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro libro1 = new Libro("El Aleph", "Jorge Luis Borges");
        Libro libro2 = new Libro("Sobre héroes y tumbas", "Ernesto Sabato");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        libro1.actualizarTitulo("Nuevo título");
        libro2.actualizarTitulo("Versión Bolsillo", "Título Nuevo");
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        Libro.cambiarEditorial("Planeta");
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
    }
    
    static class Libro{
        private String titulo;
        private String autor; 
        static private String editorial = "Independiente";
        
        public Libro(String titulo, String autor){
            this.titulo = titulo;
            this.autor = autor;
        }
        
        public Libro(String titulo, String autor, String editorial){
            this.titulo = titulo;
            this.autor = autor;
        }
        
        public void actualizarTitulo(String titulo){
            setTitulo(titulo);            
        }
        
        public void actualizarTitulo(String prefijo, String nuevoTitulo){
            setTitulo(prefijo + " " + nuevoTitulo);            
        }
        
        static public void cambiarEditorial(String nuevaEditorial){
            setEditorial(nuevaEditorial);
        }
        
        @Override
        public String toString(){
            return titulo + ", " + autor + " " + editorial;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public static String getEditorial() {
            return editorial;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public static void setEditorial(String editorial) {
            Libro.editorial = editorial;
        }        
    }
}
