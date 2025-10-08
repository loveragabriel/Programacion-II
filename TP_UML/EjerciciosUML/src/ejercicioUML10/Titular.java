/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML10;

/**
 *
 * @author Gabriel
 */
public class Titular {

    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria nueva) {
        // Se verifica instancia actual
        if (this.cuentaBancaria == nueva) {
            return;
        }
        // Se rompe el vínculo
        CuentaBancaria anterior = this.cuentaBancaria;
        this.cuentaBancaria = null;
        if (anterior != null && anterior.getTitular() == this) {
            anterior.setTitular(null);
        }
        // Se establece nueva conexión
        this.cuentaBancaria = nueva;
        if (nueva != null && nueva.getTitular() != this) {
            nueva.setTitular(this);
        }
    }

}
