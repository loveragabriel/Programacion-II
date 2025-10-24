/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.EmpleadoPolimorfismo;

/**
 *
 * @author Gabriel
 */
public class EmpleadoTemporal extends Empleado {

    private double tarifaHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, int id, double tarifaHora, int horasTrabajadas) {
        super(nombre, id); // Llama al constructor de la Superclase
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSueldo() {
        return tarifaHora * horasTrabajadas;
    }

}
