/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML5;

/**
 *
 * @author Gabriel
 */
public class Propietario {
    private String nombre; 
    private int numeroSerie; 
    private Computadora computadora;    

    public Propietario(String nombre, int numeroSerie) {
        this.nombre = nombre;
        this.numeroSerie = numeroSerie;
    }
    
    public void setComputadora(Computadora nueva) {
    // Se verifica instancia actual 
    if (this.computadora == nueva) {
        return;
    }
    // Se rompe el vínculo 
    Computadora anterior = this.computadora;
    this.computadora = null;
    if (anterior != null && anterior.getPropietario() == this) {
        anterior.setPropietario(null);
    }
    // Se establece nueva conexión
    this.computadora = nueva;
    if (nueva != null && nueva.getPropietario() != this) {
        nueva.setPropietario(this);
    }
}

    public Computadora getComputadora() {
        return computadora;
    }
}
