/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.Animales;

/**
 *
 * @author Gabriel
 */
public class Vaca extends Animal{
    
    public Vaca(String nombre) {
        super(nombre, "Vaca");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: muuuu");
    }
    
}
