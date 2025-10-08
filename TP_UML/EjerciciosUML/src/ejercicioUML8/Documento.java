/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioUML8;

import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Documento {
    private String titulo; 
    private String contenido;
    private FirmaDigital firmaDigital; 

    public Documento(String titulo, String contenido, String codigoHash, LocalDate fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }
    
    
}
