/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.Animales;

/**
 *
 * @author Gabriel
 */
public class Animal {

    protected String nombre;
    protected String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.println(this.nombre + " es un " + this.tipo + ".");
    }

    public String getNombre() {
        return nombre;
    }
}
