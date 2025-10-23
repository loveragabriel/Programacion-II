/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.Objects;

/**
 *
 * @author lover
 */
public class Curso {

    private String codigo;
    private String nombre;
    private int creditos;
    private Profesor profesor;

    public Curso(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Establecer relación
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void mostrarInfo() {
        String infoProfesor = (profesor != null) ? profesor.getNombre() : "SIN ASIGNAR";
        System.out.printf("  [Código: %s] %s (Créditos: %d) | Profesor: %s\n",
                codigo, nombre, creditos, infoProfesor);
    }

    // Útil para búsquedas o uso en colecciones
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Curso curso = (Curso) o;
        return Objects.equals(codigo, curso.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

}
