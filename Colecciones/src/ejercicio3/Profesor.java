/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Profesor {

    private String id;
    private String nombre;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    // Métodos para gestionar la lista de cursos del profesor
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void mostrarInfo() {
        System.out.printf("  [ID: %s] %s | Cursos: %d\n",
                id, nombre, cursos.size());
    }

    public void mostrarCursosDictados() {
        if (cursos.isEmpty()) {
            System.out.println("    - No dicta cursos.");
            return;
        }
        for (Curso c : cursos) {
            System.out.printf("    - %s (%s)\n", c.getNombre(), c.getCodigo());
        }
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
        Profesor profesor = (Profesor) o;
        return Objects.equals(id, profesor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
