/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionaobjetos;

/**
 *
 * @author Gabriel
 */
public class Caso2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Mascota nuevaMascota = new Mascota("Capitan", "Perro", 8);
        System.out.println(nuevaMascota.mostrarInfo());
        nuevaMascota.cumplirAnios();
        System.out.println(nuevaMascota.mostrarInfo());

    }

    static class Mascota {

        String nombre;
        String especie;
        int edad;

        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        public String mostrarInfo() {
            return "Nombre: " + nombre
                    + "\nEspecie: " + especie
                    + "\nedad: " + edad;
        }

        public int cumplirAnios() {
            return edad += 1;
        }

    }

}
