/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML2;

/**
 *
 * @author Gabriel
 */
public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario; // Asociacion bidireccional 1 a 1
    private Bateria bateria; // Asociacion de agregacion

    public Usuario getUsuario() {
        return usuario;
    }

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void mostrarBateria() {
        if (bateria != null) {
            System.out.println("La bateria es " + bateria);
        } else {
            System.out.println("El celular no tiene bateria.");
        }
    }

    public void setUsuario(Usuario nuevo) {
        // Se verifica instancia actual 
        if (this.usuario == nuevo) {
            return;
        }
        // Se rompe vinculo anterior
        Usuario anterior = this.usuario;
        this.usuario = null;
        if (anterior != null && anterior.getCelular() == this) {
            anterior.setCelular(null);
        }
        // Se establece nuevo vinculo
        this.usuario = nuevo;
        if (nuevo != null && nuevo.getCelular() != this) {
            nuevo.setCelular(this);
        }
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

}
