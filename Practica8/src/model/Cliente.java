/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import practica8.interfaces.Notificable;

/**
 *
 * @author lover
 */
public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Implementación de Notificable.
     */
    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para " + nombre + " ===");
        System.out.println("Email: " + email);
        System.out.println("Mensaje: " + mensaje);
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s (%s)", nombre, email);
    }

}
