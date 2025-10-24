/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.Vehiculos;

/**
 *
 * @author Gabriel
 */
public class Vehiculo {

    public String marca;
    public String modelo;

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehiculo: " + marca + " " + modelo);
    }

}
