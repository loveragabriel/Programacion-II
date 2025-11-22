/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica8;

import excepciones.EjerciciosExcepciones;
import java.util.Scanner;
import model.Cliente;
import model.PayPal;
import model.Pedido;
import model.Producto;
import model.TarjetaCredito;
import practica8.interfaces.Pagable;

/**
 *
 * @author lover
 */
public class Practica8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║     TP 8: INTERFACES Y EXCEPCIONES EN JAVA           ║");
        System.out.println("║            Programación II - UTN                     ║");
        System.out.println("╚══════════════════════════════════════════════════════╝");

        while (continuar) {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Demo Parte 1: Sistema E-commerce (Interfaces)");
            System.out.println("2. Demo Parte 2: Ejercicios de Excepciones");
            System.out.println("3. Salir");
            System.out.print("\nSeleccione una opción: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        demoParte1Ecommerce();
                        break;
                    case 2:
                        demoParte2Excepciones(scanner);
                        break;
                    case 3:
                        continuar = false;
                        System.out.println("\n¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        }

        scanner.close();
    }

    /**
     * Demostración de la Parte 1: Sistema de E-commerce con Interfaces
     */
    private static void demoParte1Ecommerce() {
        System.out.println("\n");
        System.out.println("PARTE 1: SISTEMA E-COMMERCE (INTERFACES)");

        // 1. Crear productos (implementan Pagable)
        System.out.println("\n>>> Creando productos...");
        Producto laptop = new Producto("Laptop Lenovo", 85000.00);
        Producto mouse = new Producto("Mouse Logitech", 3500.00);
        Producto teclado = new Producto("Teclado Mecánico", 12000.00);
        Producto monitor = new Producto("Monitor 24 pulgadas", 45000.00);

        System.out.println(laptop);
        System.out.println(mouse);
        System.out.println(teclado);
        System.out.println(monitor);

        // 2. Crear cliente (implementa Notificable)
        System.out.println("\n>>> Creando cliente...");
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@email.com");
        System.out.println(cliente);

        // 3. Crear pedido (implementa Pagable)
        System.out.println("\n>>> Creando pedido...");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(mouse);
        pedido.agregarProducto(teclado);

        System.out.println("\n" + pedido);

        // 4. Demostrar polimorfismo con Pagable
        System.out.println("\n>>> Demostración de polimorfismo con Pagable:");
        Pagable[] pagables = {laptop, mouse, pedido};
        double totalGeneral = 0;
        for (Pagable p : pagables) {
            System.out.println("  - Total: $" + String.format("%.2f", p.calcularTotal()));
            totalGeneral += p.calcularTotal();
        }
        System.out.println("Total general: $" + String.format("%.2f", totalGeneral));

        // 5. Demostrar métodos de pago (PagoConDescuento)
        System.out.println("\n>>> Procesando pago con Tarjeta de Crédito...");
        TarjetaCredito tarjeta = new TarjetaCredito("4532015112830366", "Juan Pérez");
        tarjeta.procesarPago(pedido.calcularTotal());
        System.out.println("\n>>> Aplicando descuento del 10%...");
        double montoFinal = tarjeta.aplicarDescuento(10);

        System.out.println("\n>>> Procesando pago con PayPal...");
        PayPal paypal = new PayPal("juan.perez@paypal.com");
        paypal.procesarPago(pedido.calcularTotal());
        System.out.println("\n>>> Aplicando descuento del 5%...");
        paypal.aplicarDescuento(5);

        // 6. Demostrar notificaciones (Notificable)
        System.out.println("\n>>> Cambiando estados del pedido (notificaciones)...");
        pedido.cambiarEstado(Pedido.Estado.PAGADO);

        // Pausa para mejor visualización
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        pedido.cambiarEstado(Pedido.Estado.EN_PREPARACION);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        pedido.cambiarEstado(Pedido.Estado.ENVIADO);

        System.out.println("\n>>> Estado actual del pedido:");
        System.out.println(pedido);
    }

    /**
     * Demostración de la Parte 2: Ejercicios de Excepciones
     */
    private static void demoParte2Excepciones(Scanner scanner) {
        System.out.println("\n");
        System.out.println("PARTE 2: EJERCICIOS DE EXCEPCIONES");

        EjerciciosExcepciones ejercicios = new EjerciciosExcepciones();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENÚ EXCEPCIONES ---");
            System.out.println("1. División Segura (ArithmeticException)");
            System.out.println("2. Conversión Cadena a Número (NumberFormatException)");
            System.out.println("3. Lectura de Archivo (FileNotFoundException)");
            System.out.println("4. Excepción Personalizada (EdadInvalidaException)");
            System.out.println("5. Try-With-Resources (IOException)");
            System.out.println("6. Volver al menú principal");
            System.out.print("\nSeleccione un ejercicio: ");

            try {
                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        ejercicios.ejercicioDivisionSegura();
                        break;
                    case 2:
                        ejercicios.ejercicioConversionCadena();
                        break;
                    case 3:
                        ejercicios.ejercicioLecturaArchivo();
                        break;
                    case 4:
                        ejercicios.ejercicioExcepcionPersonalizada();
                        break;
                    case 5:
                        ejercicios.ejercicioTryWithResources();
                        break;
                    case 6:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        }
    }

}
