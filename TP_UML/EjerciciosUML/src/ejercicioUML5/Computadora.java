/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML5;

/**
 *
 * @author Gabriel
 */
public class Computadora {
    private String marca; 
    private int numeroDeSerie; 
    private PlacaMadre placaMadre;  // Asociacion de Composicion
    private Propietario propietario;  // Asociacion bidireccional 

    public Computadora(String marca, int numeroDeSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset); 
    }   
    
public void setPropietario(Propietario nuevo) {
    // Se verifica instancia actual 
    if (this.propietario == nuevo) {
        return;
    }
    // Se rompe el vínculo 
    Propietario anterior = this.propietario;
    this.propietario = null;
    if (anterior != null && anterior.getComputadora() == this) {
        anterior.setComputadora(null);
    }
    // Se establece nueva conexión
    this.propietario = nuevo;
    if (nuevo != null && nuevo.getComputadora() != this) {
        nuevo.setComputadora(this);
    }
}

    public Propietario getPropietario() {
        return propietario;
    }
}
