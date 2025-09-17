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
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numerosEnteros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un número entero: ");
            numerosEnteros[i] = input.nextInt();
        }
        if (numerosEnteros[0] > numerosEnteros[1]) {
            if (numerosEnteros[0] > numerosEnteros[2]) {
                System.out.println("El numero " + numerosEnteros[0] + " es el número mayor");
            }
        } else if (numerosEnteros[1] > numerosEnteros[2]) {
            System.out.println("El numero " + numerosEnteros[1] + " es el número mayor");

        } else {
            System.out.println("El numero " + numerosEnteros[2] + " es el número mayor");
        }

    }
}
