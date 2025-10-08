/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML10;

import java.time.LocalDateTime;

/**
 *
 * @author Gabriel
 */
public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldoInicial, String codigoClave, LocalDateTime ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModificacion);
    }
    
    public void setTitular(Titular nuevo) {
        // Se verifica instancia actual
        if (this.titular == nuevo) {
            return;
        }
        // Se rompe el vínculo
        Titular anterior = this.titular;
        this.titular = null;
        if (anterior != null && anterior.getCuentaBancaria() == this) {
            anterior.setCuentaBancaria(null);
        }
        // Se establece nueva conexión
        this.titular = nuevo;
        if (nuevo != null && nuevo.getCuentaBancaria() != this) {
            nuevo.setCuentaBancaria(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }
}
