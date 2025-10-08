/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodDependenciaUso11;

/**
 *
 * @author Gabriel
 */
public class Cancion {
    private  String titulo;

    public String getTitulo() {
        return titulo;
    }

    public Artista getArtista() {
        return artista;
    }
    private final Artista artista; 

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
}
