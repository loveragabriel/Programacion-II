package ejercicio1;

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gabriel
 */
public class Inventario {

    private List<Producto> productos;

    // Constructor
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Ingresar producot al listado
    public void agregarProducto(Producto p) {
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
        } else {
            System.out.println("ERROR: Ya existe un producto con ID " + p.getId());
        }
    }

    // listar los productos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println(" Inventario vacío.");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    //Buscar por id
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    //Eliminar por id 
    public boolean eliminarProducto(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            return true;
        }
        return false;
    }

    //Metodo para actualizar stock
    public boolean actualizarStock(String id, int nuevaCantidad) {
        if (nuevaCantidad < 0) {
            System.out.println("ERROR: La cantidad de stock no puede ser negativa.");
            return false;
        }

        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    // Filtar por categoria
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // Obtener stock 
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Obtener por mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }

        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }

    // iltrar por precio 
    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // Mostrar categoria 
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.printf("• %s: %s\n", cat.name(), cat.getDescripcion());
        }
    }

}
