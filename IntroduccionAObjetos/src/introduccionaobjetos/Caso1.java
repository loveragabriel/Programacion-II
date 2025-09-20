/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionaobjetos;

/**
 *
 * @author Gabriel
 */
public class Caso1 {
    
     public static void main(String[] args) {
        // TODO code application logic here
         Estudiante nuevoEstudiante = new Estudiante("Gabriel", "Lovera", "Programación", 9.0); 
         System.out.println(nuevoEstudiante.mostrarInfo());
         nuevoEstudiante.subirCalificacion(5);
         System.out.println(nuevoEstudiante.mostrarInfo());
         nuevoEstudiante.bajarCalificacion(2);
         System.out.println(nuevoEstudiante.mostrarInfo());
    }
     
     static class Estudiante {
         String nombre;
         String apellido; 
         String curso;
         double calificacion; 
         
         public Estudiante(String nombre, String apellido, String curso, double calificacion){
             this.nombre = nombre; 
             this.apellido = apellido;
             this.curso = curso;
             this.calificacion = calificacion;
         }
         
         public String mostrarInfo(){
             return "Nombre: " + nombre +
                     "\nApellido: " + apellido +
                     "\nCurso: " + curso +
                     "\nCalificación:" + calificacion;
         }
         
         public double subirCalificacion(double puntos){
             calificacion += puntos;
             return calificacion;
         }
         
         public double bajarCalificacion(double puntos){
             calificacion -= puntos;
             return calificacion;
         }
         
     }
    
      
}
