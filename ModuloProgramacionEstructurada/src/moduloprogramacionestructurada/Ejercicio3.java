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
public class Ejercicio3 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();
        if(edad < 12){
            System.out.println("Eres unNiño");
        } else if (edad > 11 && edad < 18){
            System.out.println("Eres un Adolescente");
        } else if (edad > 17 && edad < 60){
            System.out.println("Eres un Adulto");
        } else 
        System.out.print("Eres un Adulto Mayor");
    }
}
