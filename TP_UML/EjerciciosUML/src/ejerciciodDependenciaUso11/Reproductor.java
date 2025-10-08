/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodDependenciaUso11;

/**
 *
 * @author Gabriel
 */
public class Reproductor {
    public void reproducir(Cancion cancion) {
        if (cancion == null) return;
        System.out.println("Reproduciendo: " 
            + cancion.getTitulo() + " - " + cancion.getArtista().getNombre());
    }
}
