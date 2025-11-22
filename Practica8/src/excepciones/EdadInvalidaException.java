/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author lover
 */
class EdadInvalidaException extends Exception {

    private int edadIngresada;

    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }

    public EdadInvalidaException(String mensaje, int edadIngresada) {
        super(mensaje);
        this.edadIngresada = edadIngresada;
    }

    public int getEdadIngresada() {
        return edadIngresada;
    }

    @Override
    public String toString() {
        return "EdadInvalidaException: " + getMessage()
                + (edadIngresada != 0 ? " (Edad ingresada: " + edadIngresada + ")" : "");
    }
}
