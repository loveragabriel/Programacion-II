/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Gabriel
 */
public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarInfo() {
        System.out.printf("ID: %s | Nombre: %s | Precio: $%.2f | Stock: %d | Categoría: %s (%s)\n",
                id, nombre, precio, cantidad, categoria.name(), categoria.getDescripcion());
    }

    // Uso toString
    @Override
    public String toString() {
        return String.format("ID: %s, Nombre: %s, Precio: $%.2f, Stock: %d, Categoría: %s",
                id, nombre, precio, cantidad, categoria.name());
    }

}
