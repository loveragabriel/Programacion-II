/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosUML1;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Pasaporte {

    private int numero;
    private LocalDate fechaEmision;
    private Foto foto; // Asociacion de composicion con foto 
    private Titular titular; // Asociacion 1:1

    public Titular getTitular() {
        return titular;
    }

    public Pasaporte(int numero, LocalDate fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public void setTitular(Titular nuevo) {
        // Se verifica instancia actual
        if (this.titular == nuevo) {
            return;
        }
        // Se rompe vínculo anterior
        Titular anterior = this.titular;
        this.titular = null;
        if (anterior != null && anterior.getPasaporte() == this) {
            anterior.setPasaporte(null);
        }
        // Se establece nuevo vínculo
        this.titular = nuevo;
        if (nuevo != null && nuevo.getPasaporte() != this) {
            nuevo.setPasaporte(this);
        }
    }

}
