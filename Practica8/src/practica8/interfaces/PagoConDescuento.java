/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica8.interfaces;

/**
 *
 * @author lover
 */
public interface PagoConDescuento extends Pago {

    /**
     * Aplica un descuento al pago.
     *
     * @return el monto con descuento aplicado
     */
    double aplicarDescuento(double porcentaje);
}
