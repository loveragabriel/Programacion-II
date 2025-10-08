/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML6;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Gabriel
 */
public class Reserva {

    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente; // Asociacion unidireccional 
    private Mesa mesa; // Asociacion de agregacion

    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

}
