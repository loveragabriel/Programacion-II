/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloprogramacionestructurada;

/**
 *
 * @author Gabriel
 */
public class Ejercicio13 {
        
        public static void mostrarPrecios(double[] arr, int i){
            if(i==arr.length){
                return;
            }
            System.out.println("Precio: $ " + arr[i]);
            mostrarPrecios(arr,i+1);
            
        }
        
        public static void preciosModificados(double[] arr, int i){
            if(i==arr.length){
                return;
            }
            System.out.println("Precio: $ " + arr[i]);
            preciosModificados(arr,i+1);
            
        }
    
        public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios:");
        mostrarPrecios(precios,0);
        
        precios[2] = 129.99;
        System.out.println("Precios Modificados:");
        preciosModificados(precios,0);
        }
    
}
