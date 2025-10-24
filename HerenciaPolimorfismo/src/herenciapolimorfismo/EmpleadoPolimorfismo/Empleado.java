/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.EmpleadoPolimorfismo;

/**
 *
 * @author Gabriel
 */
public abstract class Empleado {

    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

}
