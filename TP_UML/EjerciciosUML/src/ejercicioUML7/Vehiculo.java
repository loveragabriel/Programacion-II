/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML7;

/**
 *
 * @author Gabriel
 */
public class Vehiculo {

    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor nuevo) {
        // Se verifica instancia actual 
        if (this.conductor == nuevo) {
            return;
        }
        // Se rompe el vínculo 
        Conductor anterior = this.conductor;
        this.conductor = null;
        if (anterior != null && anterior.getVehiculo() == this) {
            anterior.setVehiculo(null);
        }
        // Se establece nueva conexión
        this.conductor = nuevo;
        if (nuevo != null && nuevo.getVehiculo() != this) {
            nuevo.setVehiculo(this);
        }
    }

}
