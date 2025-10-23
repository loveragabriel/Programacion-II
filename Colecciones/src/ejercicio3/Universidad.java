/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class Universidad {
        private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad() {
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            profesores.add(p);
            System.out.printf("  ✅ Profesor agregado: %s\n", p.getNombre());
        } else {
            System.out.printf("  ❌ ERROR: Profesor con ID %s ya existe.\n", p.getId());
        }
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            cursos.add(c);
            System.out.printf("  ✅ Curso agregado: %s\n", c.getNombre());
        } else {
            System.out.printf("  ❌ ERROR: Curso con código %s ya existe.\n", c.getCodigo());
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    // Asigna profesor al curso y mantiene la coherencia bidireccional
    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor nuevoProfesor = buscarProfesorPorId(idProfesor);

        if (curso == null || nuevoProfesor == null) {
            System.out.printf("  ❌ ERROR: Curso (%s) o Profesor (%s) no encontrado.\n", codigoCurso, idProfesor);
            return false;
        }

        Profesor profesorAnterior = curso.getProfesor();

        // 1. Remover relación antigua
        if (profesorAnterior != null) {
            if (!profesorAnterior.getId().equalsIgnoreCase(idProfesor)) {
                profesorAnterior.removerCurso(curso);
            } else {
                return true; 
            }
        }

        // 2. Establecer nueva relación bidireccional
        curso.setProfesor(nuevoProfesor); // Lado Curso -> Profesor
        nuevoProfesor.agregarCurso(curso); // Lado Profesor -> Curso
        
        System.out.printf("  ✅ Asignación: %s ahora dicta %s.\n", nuevoProfesor.getNombre(), curso.getNombre());
        return true;
    }
    
    public void listarProfesores() {
        if (profesores.isEmpty()) return;
        System.out.println("--- LISTADO DE PROFESORES ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.mostrarCursosDictados();
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) return;
        System.out.println("--- LISTADO DE CURSOS ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
    
    // Elimina un Curso y rompe su relación con el profesor
    public boolean eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar != null) {
            
            Profesor profesorAsignado = cursoAEliminar.getProfesor();
            if (profesorAsignado != null) {
                profesorAsignado.removerCurso(cursoAEliminar);
            }
            
            cursos.remove(cursoAEliminar);
            System.out.printf("  🗑️ Curso eliminado: %s.\n", cursoAEliminar.getNombre());
            return true;
        }
        System.out.printf("  ❌ ERROR: Curso %s no encontrado.\n", codigo);
        return false;
    }
    
    // Elimina un Profesor, rompiendo primero todas sus relaciones con los cursos
    public boolean eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            
            // Romper las relaciones
            List<Curso> cursosDictados = new ArrayList<>(profesorAEliminar.getCursos());
            
            for (Curso c : cursosDictados) {
                c.setProfesor(null); 
            }
            
            profesores.remove(profesorAEliminar);
            System.out.printf("  🗑️ Profesor eliminado: %s. Sus cursos quedaron SIN ASIGNAR.\n", profesorAEliminar.getNombre());
            return true;
        }
        System.out.printf("  ❌ ERROR: Profesor %s no encontrado.\n", id);
        return false;
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("--- REPORTE: Cursos por Profesor ---");
        if (profesores.isEmpty()) return;
        
        for (Profesor p : profesores) {
            System.out.printf("  • %s: %d cursos\n", p.getNombre(), p.getCursos().size());
        }
    }
}
