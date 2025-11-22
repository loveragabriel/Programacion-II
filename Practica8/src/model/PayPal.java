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
public class PayPal implements PagoConDescuento {

    private String emailPayPal;
    private double montoActual;

    public PayPal(String emailPayPal) {
        this.emailPayPal = emailPayPal;
        this.montoActual = 0;
    }

    /**
     * Procesa un pago con PayPal.
     *
     */
    @Override
    public boolean procesarPago(double monto) {
        // Simulación de procesamiento de pago
        System.out.println("Procesando pago con PayPal...");
        System.out.println("Cuenta PayPal: " + emailPayPal);
        System.out.println(String.format("Monto: $%.2f", monto));

        // Simulamos que el pago siempre es exitoso
        this.montoActual = monto;
        System.out.println("¡Pago con PayPal aprobado!");
        return true;
    }

    /**
     * Aplica un descuento al monto actual.
     *
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        double descuento = montoActual * (porcentaje / 100);
        double montoConDescuento = montoActual - descuento;
        System.out.println(String.format("Descuento PayPal aplicado: %.0f%% (-$%.2f)", porcentaje, descuento));
        System.out.println(String.format("Nuevo monto: $%.2f", montoConDescuento));
        return montoConDescuento;
    }

    // Getters
    public String getEmailPayPal() {
        return emailPayPal;
    }

    public double getMontoActual() {
        return montoActual;
    }
}
