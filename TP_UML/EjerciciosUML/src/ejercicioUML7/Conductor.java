/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML7;

/**
 *
 * @author Gabriel
 */
public class Conductor {

    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public void setVehiculo(Vehiculo nuevo) {
        // Se verifica instancia actual
        if (this.vehiculo == nuevo) {
            return;
        }
        // Se rompe el vínculo
        Vehiculo anterior = this.vehiculo;
        this.vehiculo = null;
        if (anterior != null && anterior.getConductor() == this) {
            anterior.setConductor(null);
        }
        // Se establece nueva conexión
        this.vehiculo = nuevo;
        if (nuevo != null && nuevo.getConductor() != this) {
            nuevo.setConductor(this);
        }
    }
}
