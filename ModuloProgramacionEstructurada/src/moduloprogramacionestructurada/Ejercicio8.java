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
public class Ejercicio8 {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double setImpuesto = impuesto / 100;
        double setDescuento = descuento / 100;
        return precioBase + (precioBase * setImpuesto) - (precioBase * setDescuento);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10): ");
        double impuestoPct = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ej: 5): ");
        double descuentoPct = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuestoPct, descuentoPct);
        System.out.printf("El precio final del producto es: %.2f%n", precioFinal);
    }

}
