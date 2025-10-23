/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Gabriel
 */
public class MainUniversidad {
        public static void main(String[] args) {
        Universidad utn = new Universidad();
        System.out.println("== EJERCICIO 3: UNIVERSIDAD Y CURSOS ==");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P101", "Dr. Pérez", "Sistemas");
        Profesor p2 = new Profesor("P102", "Lic. Gómez", "Electrónica");
        Profesor p3 = new Profesor("P103", "Ing. Torres", "Mecánica");

        Curso c1 = new Curso("C201", "POO Avanzada", 6);
        Curso c2 = new Curso("C202", "Bases de Datos", 8);
        Curso c3 = new Curso("C301", "Circuitos Digitales", 5);
        Curso c4 = new Curso("C302", "Termodinámica", 7);
        Curso c5 = new Curso("C401", "Estructura de Datos", 6);

        // 2. Agregar profesores y cursos a la universidad.
        System.out.println("\n== 2. Agregando == ");
        utn.agregarProfesor(p1); utn.agregarProfesor(p2); utn.agregarProfesor(p3);
        utn.agregarCurso(c1); utn.agregarCurso(c2); utn.agregarCurso(c3); utn.agregarCurso(c4); utn.agregarCurso(c5);

        // 3. Asignar profesores a cursos.
        System.out.println("\n== 3. Asignaciones Iniciales ==");
        utn.asignarProfesorACurso(c1.getCodigo(), p1.getId()); // C201 -> P101
        utn.asignarProfesorACurso(c2.getCodigo(), p1.getId()); // C202 -> P101
        utn.asignarProfesorACurso(c5.getCodigo(), p1.getId()); // C401 -> P101
        utn.asignarProfesorACurso(c3.getCodigo(), p2.getId()); // C301 -> P102
        utn.asignarProfesorACurso(c4.getCodigo(), p3.getId()); // C302 -> P103
        
        // 4. Listar
        System.out.println("\n== 4. Listado Inicial ==");
        utn.listarProfesores();
        utn.listarCursos();

        // 5. Cambiar el profesor de un curso (C202: P101 -> P102) y verificar sincronización.
        System.out.println("\n== 5. Cambio de Profesor (C202) ==");
        utn.asignarProfesorACurso(c2.getCodigo(), p2.getId()); 
        
        System.out.println("\nVerificación de P101 (debe tener 1 curso):");
        utn.buscarProfesorPorId(p1.getId()).mostrarInfo();
        
        System.out.println("Verificación de P102 (debe tener 2 cursos):");
        utn.buscarProfesorPorId(p2.getId()).mostrarInfo();

        // 6. Remover un curso (C401) y confirmar que desaparece de la lista del profesor (P101).
        System.out.println("\n== 6. Remoción de Curso C401 ==");
        utn.eliminarCurso(c5.getCodigo()); 
        
        System.out.println("\nVerificación de P101 (debe tener 1 curso restante):");
        utn.buscarProfesorPorId(p1.getId()).mostrarInfo();
        utn.buscarProfesorPorId(p1.getId()).mostrarCursosDictados();

        // 7. Remover un profesor (P103) y dejar profesor = null en los cursos que dictaba (C302).
        System.out.println("\n== 7. Remoción de Profesor P103 ==");
        utn.eliminarProfesor(p3.getId());
        
        System.out.println("\nVerificación de Curso C302 (SIN ASIGNAR):");
        utn.buscarCursoPorCodigo(c4.getCodigo()).mostrarInfo();

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        System.out.println("\n== 8. Reporte final ==");
        utn.mostrarReporteCursosPorProfesor();
    }
}
