/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.Vehiculos;

/**
 *
 * @author Gabriel
 */
public class Auto extends Vehiculo {
    public int cantidadPuertas; 

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas; 
    }
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo: Auto con " + cantidadPuertas + " puertas.");
        
    }
}
