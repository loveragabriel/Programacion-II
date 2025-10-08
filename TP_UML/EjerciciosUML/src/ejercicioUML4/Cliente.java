/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML4;

/**
 *
 * @author Gabriel
 */
public class Cliente {

    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito nuevaTarjeta) {
        // Se verifica si es la misma instancia y en caso de coincidir no hay cambios.  
        if (this.tarjetaDeCredito == nuevaTarjeta) {
            return;
        }
        // Se rompe el vinculo anterior. 
        TarjetaDeCredito tarjetaAnterior = this.tarjetaDeCredito;
        if (tarjetaAnterior != null && tarjetaAnterior.getCliente() == this) {
            tarjetaAnterior.setCliente(null);
        }
        // Se asigna una nueva tarjeta al cliente. 
        this.tarjetaDeCredito = nuevaTarjeta;
        if (nuevaTarjeta != null && nuevaTarjeta.getCliente() != this) {
            nuevaTarjeta.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

}
