/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciapolimorfismo;

import herenciapolimorfismo.Animales.Animal;
import herenciapolimorfismo.Animales.Gato;
import herenciapolimorfismo.Animales.Perro;
import herenciapolimorfismo.Animales.Vaca;
import herenciapolimorfismo.EmpleadoPolimorfismo.Empleado;
import herenciapolimorfismo.EmpleadoPolimorfismo.EmpleadoPlanta;
import herenciapolimorfismo.EmpleadoPolimorfismo.EmpleadoTemporal;
import herenciapolimorfismo.FigurasGeometricas.Circulo;
import herenciapolimorfismo.FigurasGeometricas.Figura;
import herenciapolimorfismo.FigurasGeometricas.Rectangulo;
import herenciapolimorfismo.Vehiculos.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class HerenciaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Vehículos y herencia básica */
        Auto a1 = new Auto("Ford", "Fiesta", 5);
        a1.mostrarInfo();
        System.out.println("-----------------------");

        /*Figuras geométricas y métodos abstractos */
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Rectangulo(4.0, 6.0);
        figuras[2] = new Circulo(2.5);

        for (Figura figu : figuras) {
            double area = figu.calcularArea();
            System.out.printf("%s: %.2f\n", figu.getNombre(), area);
        }
        System.out.println("-----------------------");

        List<Empleado> nomina = new ArrayList<>();

        nomina.add(
                new EmpleadoPlanta("Ana lopez", 101, 50000.0, 5));
        nomina.add(
                new EmpleadoTemporal("Juan perez", 202, 500.0, 160));
        nomina.add(
                new EmpleadoPlanta("Mario gomez", 102, 60000.0, 10));
        nomina.add(
                new EmpleadoTemporal("Laura diaz", 203, 650.0, 100));

        for (Empleado e : nomina) {

            double sueldo = e.calcularSueldo();

            System.out.printf("Empleado ID %d (%s): Sueldo calculado: $%.2f\n",
                    e.getId(), e.getNombre(), sueldo);
        }
        int contadorPlanta = 0;
        int contadorTemporal = 0;

        for (Empleado e : nomina) {
            if (e instanceof EmpleadoPlanta) {
                contadorPlanta++;
                System.out.println("- " + e.getNombre() + " es un Empleado de Planta.");
            } else if (e instanceof EmpleadoTemporal) {
                contadorTemporal++;
                System.out.println("- " + e.getNombre() + " es un Empleado Temporal.");
            }

        }
        System.out.println("Total Empleados de Planta: " + contadorPlanta);
        System.out.println("Total Empleados Temporales: " + contadorTemporal);

        System.out.println("-----------------------");

        List<Animal> granja = new ArrayList<>();

        granja.add(new Perro("Fido el perro"));
        granja.add(new Gato("Michi el gato"));
        granja.add(new Vaca("Lola"));
        granja.add(new Perro("Buddy"));
        for (Animal a : granja) {

            a.hacerSonido();
        }
        System.out.println("---------------------------------------------------");
    }
}
