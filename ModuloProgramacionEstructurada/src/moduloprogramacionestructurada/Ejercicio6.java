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
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Ingrese el número " + i + ":");
            int numero = input.nextInt();
            if (numero < 0) {
                contadorNegativos += 1;
            } else if (numero == 0) {
                contadorCeros += 1;
            } else {
                contadorPositivos += 1;
            }
        }
        System.out.println("Resultados: \n Positivos: " + contadorPositivos + "\n Negativos: " + contadorNegativos + "\n Ceros: " + contadorCeros);
    }
}
