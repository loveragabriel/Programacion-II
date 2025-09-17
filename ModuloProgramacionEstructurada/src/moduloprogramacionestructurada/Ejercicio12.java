/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloprogramacionestructurada;
/**
 *
 * @author Gabriel
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precio:");
        for(int i=0; i<precios.length; i++){
            System.out.println("Precio: $ "+ precios[i]);
        }
        precios[2]=129.99;
        
        System.out.println("Precios Actualizados:");
        for(int i=0;i<precios.length;i++){
            System.out.println("Precios: $ " + precios[i]);
        }
    }
      
    
}
