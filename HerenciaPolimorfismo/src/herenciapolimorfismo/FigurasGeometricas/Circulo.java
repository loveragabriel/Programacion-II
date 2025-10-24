/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.FigurasGeometricas;

/**
 *
 * @author Gbariel
 */
public class Circulo extends Figura {
    private double radio; 
    
    public Circulo(double radio){
        super("Circulo"); 
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI *  radio * radio; 
    }
}
