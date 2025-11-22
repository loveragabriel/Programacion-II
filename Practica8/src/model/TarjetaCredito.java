/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import practica8.interfaces.PagoConDescuento;

/**
 *
 * @author lover
 */
public class TarjetaCredito implements PagoConDescuento {

    private String numeroTarjeta;
    private String titular;
    private double montoActual;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.montoActual = 0;
    }

    /**
     * Procesa un pago con tarjeta de crédito.
     */
    @Override
    public boolean procesarPago(double monto) {
        // Simulación de procesamiento de pago
        System.out.println("Procesando pago con Tarjeta de Crédito...");
        System.out.println("Tarjeta: **** **** **** " + numeroTarjeta.substring(Math.max(0, numeroTarjeta.length() - 4)));
        System.out.println("Titular: " + titular);
        System.out.println(String.format("Monto: $%.2f", monto));

        // Simulamos que el pago siempre es exitoso
        this.montoActual = monto;
        System.out.println("¡Pago aprobado!");
        return true;
    }

    /**
     * Aplica un descuento al monto actual.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = montoActual * (porcentaje / 100);
        double montoConDescuento = montoActual - descuento;
        System.out.println(String.format("Descuento aplicado: %.0f%% (-$%.2f)", porcentaje, descuento));
        System.out.println(String.format("Nuevo monto: $%.2f", montoConDescuento));
        return montoConDescuento;
    }

    // Getters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public double getMontoActual() {
        return montoActual;
    }
}
