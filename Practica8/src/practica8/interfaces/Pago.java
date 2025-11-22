/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica8.interfaces;

/**
 *
 * @author lover
 */
public interface Pago {
    
    /**
     * Procesa un pago por el monto indicado.
     * @return true si el pago fue exitoso, false en caso contrario
     */
    boolean procesarPago(double monto);
}
