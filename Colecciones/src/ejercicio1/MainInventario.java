package ejercicio1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Gabriel
 */
public class MainInventario {

    public static void main(String[] args) {
        Inventario inv = new Inventario();

        // Creo 5 aproductos para agregar al invertatario. 
        inv.agregarProducto(new Producto("P1", "Arroz", 1200.00, 50, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P2", "Licuadora", 250000.00, 10, CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("P3", "Remera", 8000.50, 70, CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("P4", "Sillón", 300000.00, 5, CategoriaProducto.HOGAR));
        inv.agregarProducto(new Producto("P5", "Yerba", 2500.00, 100, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("P6", "Microondas", 45000.00, 20, CategoriaProducto.ELECTRONICA));

//Listar prodcutos 
        inv.listarProductos();

// Buscar producto por id
        Producto buscado = inv.buscarProductoPorId("P3");
        if (buscado != null) {
            System.out.print("Producto encontrado: ");
            buscado.mostrarInfo();
        } else {
            System.out.println("Producto con ID P3 no encontrado.");
        }

        //Filtar por categoria de producto
        inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS).forEach(Producto::mostrarInfo);

        // Eliminar producto por id
        if (inv.eliminarProducto("P2")) {
            System.out.println("🗑️ Producto P2 (TV 43\") eliminado.");
        } else {
            System.out.println("❌ Error al eliminar el producto P2.");
        }
        System.out.println("\nProductos restantes:");
        inv.listarProductos();

        //Actualizar stock 
        if (inv.actualizarStock("P1", 80)) {
            System.out.println("Stock P1 actualizado.");
            inv.buscarProductoPorId("P1").mostrarInfo();
        }

        System.out.println("(7) Mostrar el total de stock disponible.");
        System.out.println("Stock Total en Inventario: " + inv.obtenerTotalStock());

        // Obtener y mostrar producto
        Producto mayorStock = inv.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.print("roducto con mayor stock: ");
            mayorStock.mostrarInfo();
        }

        // Filtra proucto por valor de precio
        inv.filtrarProductosPorPrecio(1000.00, 3000.00).forEach(Producto::mostrarInfo);

        // mostrar categoria disponibles 
        inv.mostrarCategoriasDisponibles();
    }
}
