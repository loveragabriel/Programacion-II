/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccionaobjetos;

/**
 *
 * @author Gabriel
 */
public class Caso5 {

    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        System.out.println(nave.mostrarEstado());
        System.out.println(nave.avanzar(60));
        nave.recargarCombustible(30);
        nave.avanzar(60);
        System.out.println(nave.mostrarEstado());
    }

    static class NaveEspacial {

        private static final int CAPACIDAD_MAX = 100;
        String nombre = "Nave Terricola";
        double combustible = 50;

        public void despegar() {
            combustible -= 10;
        }

        public double avanzar(double distancia) {
            if (distancia <= 0) {
                System.out.println("Distancia inválida.");
                return combustible;
            } else if (distancia > combustible) {
                System.out.println("Combustible insuficiente. No se avanzó.");
                return combustible;
            }
            combustible -= distancia;
            return combustible;
        }

        public void recargarCombustible(double cantidad) {
            double suma = combustible + cantidad;
            if (cantidad <= 0) {
                System.out.println("Cantidad inválida para recargar.");
            } else if (combustible == CAPACIDAD_MAX) {
                System.out.println("No se pudo recargar: el tanque ya está al maximo");
            } else if (suma >= CAPACIDAD_MAX) {
                combustible = CAPACIDAD_MAX;
                System.out.println("Se cargó al máximo");
            } else {
                combustible = suma;
                System.out.println("Se recargó " + cantidad + ". " + "Combustible actual: " + combustible);
            }
        }

        public String mostrarEstado() {
            return "Nave: " + nombre
                    + "\nCombutible: " + combustible;
        }

    }
}
