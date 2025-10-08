/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML4;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class TarjetaDeCredito {

    private int numero;
    private LocalDate fechaVencimiento;
    private Banco banco; // Asociacion de Agregacion
    private Cliente cliente; // Asociacion bidireccional.

    public Cliente getCliente() {
        return cliente;
    }

    public TarjetaDeCredito(int numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setCliente(Cliente nuevo) {
        // Se verifica instancia actual 
        if (this.cliente == nuevo) {
            return;
        }
        // Se rompe el vinculo 
        Cliente anterior = this.cliente;
        this.cliente = null;
        if (anterior != null && anterior.getTarjetaDeCredito() == this) {
            anterior.setTarjetaDeCredito(null);
        }
        // Se establece nueva conexion
        this.cliente = nuevo;
        if (nuevo != null && nuevo.getTarjetaDeCredito() != this) {
            nuevo.setTarjetaDeCredito(this);
        }
    }

}
