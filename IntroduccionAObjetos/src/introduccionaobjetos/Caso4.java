/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionaobjetos;

/**
 *
 * @author Gabriel
 */
public class Caso4 {
        public static void main(String[] args) {
           Gallina gallina1 = new Gallina(1,3,80);
           Gallina gallina2 = new Gallina(2,1,20);
           System.out.println(gallina1.mostrarEstado());
           System.out.println(gallina2.mostrarEstado());
           gallina1.ponerHuevo();
           gallina2.envejecer();
           System.out.println(gallina1.mostrarEstado());
           System.out.println(gallina2.mostrarEstado());
        }
    
        
    static class Gallina{
        int idGallina; 
        int edad;
        int huevosPuestos;
        
        public Gallina(int idGallina, int edad, int huevosPuestos){
            this.idGallina =idGallina;
            this.edad = edad;
            this.huevosPuestos = huevosPuestos;
        }
        
        public String mostrarEstado(){
            return "Gallina: " + idGallina +
                    "\nEdad: " + edad +
                    "\nHuevos Puestos: " + huevosPuestos;
    }
        public void ponerHuevo(){
            huevosPuestos += 1;
        }
        
        public void envejecer(){
            edad += 1;
        }
        
  }
}
