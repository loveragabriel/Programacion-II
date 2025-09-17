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
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese número a sumar, 0 parar ver el total");
        int numero = input.nextInt();
        int sumador = 0;
        while (numero != 0) {
            if (numero % 2 == 0) {
                sumador += numero;
            }
            numero = input.nextInt();
        }
        System.out.println("La suma de los números pares es: " + sumador);
    }

}
