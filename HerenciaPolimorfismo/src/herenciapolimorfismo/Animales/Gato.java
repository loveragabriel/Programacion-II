/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.Animales;

/**
 *
 * @author Gabriel
 */
public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre, "Gato");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: miau");
    }
    
}
