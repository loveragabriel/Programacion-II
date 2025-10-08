/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUML1;

/**
 *
 * @author Gabriel
 */
public class Titular {

    private String nombre;
    private String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte nuevo) {
        // Se verifica instancia actual
        if (this.pasaporte == nuevo) {
            return;
        }
        // Se rompe vínculo anterior
        Pasaporte anterior = this.pasaporte;
        this.pasaporte = null;
        if (anterior != null && anterior.getTitular() == this) {
            anterior.setTitular(null);
        }
        // Se establece nuevo vínculo
        this.pasaporte = nuevo;
        if (nuevo != null && nuevo.getTitular() != this) {
            nuevo.setTitular(this);
        }
    }

}
