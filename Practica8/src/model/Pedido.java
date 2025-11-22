/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import practica8.interfaces.Pagable;

/**
 *
 * @author lover
 */
public class Pedido implements Pagable {

    public enum Estado {
        PENDIENTE("Pendiente"),
        PAGADO("Pagado"),
        EN_PREPARACION("En preparación"),
        ENVIADO("Enviado"),
        ENTREGADO("Entregado"),
        CANCELADO("Cancelado");

        private final String descripcion;

        Estado(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }
    private int numeroPedido;
    private List<Producto> productos;
    private Cliente cliente;
    private Estado estado;
    private static int contadorPedidos = 1;

    public Pedido(Cliente cliente) {
        this.numeroPedido = contadorPedidos++;
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = Estado.PENDIENTE;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public boolean removerProducto(Producto producto) {
        return productos.remove(producto);
    }

    public void cambiarEstado(Estado nuevoEstado) {
        Estado estadoAnterior = this.estado;
        this.estado = nuevoEstado;

        // Notificar al cliente del cambio de estado
        String mensaje = String.format(
                "Su pedido #%d ha cambiado de estado: %s -> %s",
                numeroPedido,
                estadoAnterior.getDescripcion(),
                nuevoEstado.getDescripcion()
        );
        cliente.notificar(mensaje);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos); // Retorna copia para proteger la lista
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getCantidadProductos() {
        return productos.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Pedido #").append(numeroPedido).append(" ===\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("Estado: ").append(estado.getDescripcion()).append("\n");
        sb.append("Productos:\n");
        for (Producto p : productos) {
            sb.append("  - ").append(p.toString()).append("\n");
        }
        sb.append(String.format("TOTAL: $%.2f", calcularTotal()));
        return sb.toString();
    }
}
