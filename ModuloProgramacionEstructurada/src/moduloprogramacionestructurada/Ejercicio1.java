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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = input.nextInt();
        if (anio/4== 0) {
            if(anio/400 == 0)
                System.out.println("El año " + anio + " es bisiesto");
        } else 
        System.out.println("El año " + anio + " no es bisieso");
}

}
    
