/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionaobjetos;

/**
 *
 * @author Gabriel
 */
public class Caso3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Libro nuevoLibro = new Libro();
        System.out.println(nuevoLibro.getTitulo());
        System.out.println(nuevoLibro.getAutor());
        System.out.println(nuevoLibro.getAnioPublicacion());
        nuevoLibro.setAnioPublicacion(-28);
        nuevoLibro.setAnioPublicacion(2010);
        System.out.println(nuevoLibro.getAnioPublicacion());

    }
    
    static class Libro{
        private String titulo = "Clean Code"; 
        private String autor = "Robert C. Martin";
        private int anioPublicacion = 2008;
        
        public String getTitulo(){
            return titulo;
        }
        
        public String getAutor(){
            return autor;
        }
        
        public int getAnioPublicacion(){
            return anioPublicacion;
        }
        
        public void setAnioPublicacion(int anio){
            if(anio <= 0){
                System.out.println("Ingrese un valor correcto!");
            } else this.anioPublicacion = anio;
        }
        
    }
    
}
