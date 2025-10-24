/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapolimorfismo.EmpleadoPolimorfismo;

/**
 *
 * @author Gbriel
 */
public class EmpleadoPlanta extends Empleado {

    private double sueldoBase;
    private int antiguedad;

    public EmpleadoPlanta(String nombre, int id, double sueldoBase, int antiguedad) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        double bono = this.antiguedad * 1000.0; 
        return sueldoBase + bono;
    }

}
