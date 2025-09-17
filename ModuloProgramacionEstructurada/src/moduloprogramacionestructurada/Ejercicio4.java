/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloprogramacionestructurada;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = input.nextDouble();
        System.out.println("Seleccione una Categoría entre A, B y C");
        Scanner scLetra = new Scanner(System.in);
        String letra = scLetra.nextLine().toUpperCase();
        double descuentoA = 0.10;
        double descuetoB = 0.15;
        double descuentoC = 0.20;
        double precioFinal;

        switch (letra) {
            case "A" -> {
                precioFinal = precio - precio * descuentoA;
                System.out.println("Descuento aplicado: " + descuentoA * 100 + " %\n " + "Precio Final: " + precioFinal);
            }
            case "B" -> {
                precioFinal = precio - precio * descuetoB;
                System.out.println("Descuento aplicado: " + descuetoB * 100 + " %\n " + "Precio Final: " + precioFinal);
            }
            case "C" -> {
                precioFinal = precio - precio * descuentoC;
                System.out.println("Descuento aplicado: " + descuentoC * 100 + " %\n " + "Precio Final: " + precioFinal);
            }
            default ->
                System.out.println("Ingrese un opción correcta!");

        }

    }

}
