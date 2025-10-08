/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML2;

/**
 *
 * @author Gabriel
 */
public class Usuario {

    private String nombre;
    private int dni;
    private Celular celular;

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular nuevo) {
        // Se verifica instancia actual
        if (this.celular == nuevo) {
            return;
        }
        // Se rompe vínculo anterior
        Celular anterior = this.celular;
        this.celular = null;
        if (anterior != null && anterior.getUsuario() == this) {
            anterior.setUsuario(null);
        }
        // Se establece nuevo vínculo
        this.celular = nuevo;
        if (nuevo != null && nuevo.getUsuario() != this) {
            nuevo.setUsuario(this);
        }
    }

}
