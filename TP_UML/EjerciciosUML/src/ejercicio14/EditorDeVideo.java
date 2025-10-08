/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author lover
 */
public class EditorDeVideo {
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Render exportado en formato: " + render.getFormato());
        System.out.println("Proyecto: " + proyecto.getNombre() + " (" + proyecto.getDuracionMin() + " min)");
    }
}
