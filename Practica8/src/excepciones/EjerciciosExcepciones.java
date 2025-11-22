/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lover
 */
public class EjerciciosExcepciones {
    
    private Scanner scanner;
    
    public EjerciciosExcepciones() {
        scanner = new Scanner(System.in);
    }
    
    // ==========================================
    // Ejercicio 1: División Segura
    // ==========================================
    /**
     * Solicita dos números y los divide.
     * Maneja ArithmeticException si el divisor es cero.
     */
    public void ejercicioDivisionSegura() {
        System.out.println("\n=== EJERCICIO 1: División Segura ===");
        
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Ingrese el divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());
            
            // Realizamos la división
            int resultado = dividir(dividendo, divisor);
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("ERROR: No se puede dividir por cero.");
            System.out.println("Detalle: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Debe ingresar números enteros válidos.");
        }
    }
    
    /**
     * Método auxiliar que realiza la división.
     * @param dividendo el número a dividir
     * @param divisor el número por el cual dividir
     * @return el resultado de la división
     * @throws ArithmeticException si el divisor es cero
     */
    private int dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return dividendo / divisor;
    }
    
    // ==========================================
    // Ejercicio 2: Conversión de Cadena a Número
    // ==========================================
    /**
     * Lee texto del usuario e intenta convertirlo a int.
     * Maneja NumberFormatException si no es válido.
     */
    public void ejercicioConversionCadena() {
        System.out.println("\n=== EJERCICIO 2: Conversión de Cadena a Número ===");
        
        System.out.print("Ingrese un texto para convertir a número: ");
        String texto = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa: \"" + texto + "\" -> " + numero);
            System.out.println("El doble del número es: " + (numero * 2));
        } catch (NumberFormatException e) {
            System.out.println("ERROR: \"" + texto + "\" no es un número entero válido.");
            System.out.println("Por favor ingrese solo dígitos (opcionalmente precedidos por - para negativos).");
        }
    }
    
    // ==========================================
    // Ejercicio 3: Lectura de Archivo
    // ==========================================
    /**
     * Lee un archivo de texto y lo muestra.
     * Maneja FileNotFoundException si el archivo no existe.
     */
    public void ejercicioLecturaArchivo() {
        System.out.println("\n=== EJERCICIO 3: Lectura de Archivo ===");
        
        System.out.print("Ingrese la ruta del archivo a leer: ");
        String rutaArchivo = scanner.nextLine();
        
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            System.out.println("\n--- Contenido del archivo ---");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("--- Fin del archivo ---");
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: El archivo \"" + rutaArchivo + "\" no existe.");
            System.out.println("Verifique que la ruta sea correcta.");
        } catch (IOException e) {
            System.out.println("ERROR: Ocurrió un error al leer el archivo.");
            System.out.println("Detalle: " + e.getMessage());
        } finally {
            // Cerramos el recurso en el bloque finally
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("(Recurso cerrado correctamente en finally)");
                } catch (IOException e) {
                    System.out.println("ERROR al cerrar el archivo: " + e.getMessage());
                }
            }
        }
    }
    
    // ==========================================
    // Ejercicio 4: Excepción Personalizada
    // ==========================================
    /**
     * Valida una edad usando EdadInvalidaException.
     * Lanza la excepción si la edad es menor a 0 o mayor a 120.
     */
    public void ejercicioExcepcionPersonalizada() {
        System.out.println("\n=== EJERCICIO 4: Excepción Personalizada ===");
        
        System.out.print("Ingrese una edad para validar: ");
        
        try {
            int edad = Integer.parseInt(scanner.nextLine());
            validarEdad(edad);
            System.out.println("La edad " + edad + " es válida.");
            
            // Información adicional según la edad
            if (edad < 18) {
                System.out.println("Es menor de edad.");
            } else if (edad < 65) {
                System.out.println("Es adulto.");
            } else {
                System.out.println("Es adulto mayor.");
            }
            
        } catch (EdadInvalidaException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("La edad debe estar entre 0 y 120 años.");
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Debe ingresar un número entero válido.");
        }
    }
    
    /**
     * Valida que la edad esté en un rango válido.
     * @param edad la edad a validar
     * @throws EdadInvalidaException si la edad es inválida
     */
    private void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa", edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120 años", edad);
        }
    }
    
    // ==========================================
    // Ejercicio 5: Try-With-Resources
    // ==========================================
    /**
     * Lee un archivo usando try-with-resources.
     * El recurso se cierra automáticamente al finalizar.
     */
    public void ejercicioTryWithResources() {
        System.out.println("\n=== EJERCICIO 5: Try-With-Resources ===");
        
        System.out.print("Ingrese la ruta del archivo a leer: ");
        String rutaArchivo = scanner.nextLine();
        
        // Try-with-resources: el BufferedReader se cierra automáticamente
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            
            String linea;
            int numeroLinea = 1;
            System.out.println("\n--- Contenido del archivo (con números de línea) ---");
            
            while ((linea = reader.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }
            
            System.out.println("--- Fin del archivo ---");
            System.out.println("Total de líneas leídas: " + (numeroLinea - 1));
            System.out.println("(El recurso se cerró automáticamente con try-with-resources)");
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: El archivo \"" + rutaArchivo + "\" no fue encontrado.");
        } catch (IOException e) {
            System.out.println("ERROR: Ocurrió un problema al leer el archivo.");
            System.out.println("Detalle: " + e.getMessage());
        }
    }
    
    /**
     * Cierra el scanner cuando ya no se necesita.
     */
    public void cerrarScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
