package Examen_Modulo_2;

import java.util.ArrayList;
import java.util.List;

// 6. Clase Libreria
class Libreria {
    private String nombre;
    private List<Categoria> categorias;
    private Inventario<Producto> inventarioGeneral; // Inventario que guarda todos los productos

    public Libreria(String nombre) {
        this.nombre = nombre;
        this.categorias = new ArrayList<>();
        this.inventarioGeneral = new Inventario<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCategoria(Categoria categoria) {
        this.categorias.add(categoria);
        System.out.println("Categoría '" + categoria.getNombre() + "' agregada a la librería.");
    }

    public void agregarProductoAlInventarioGeneral(Producto producto) {
        this.inventarioGeneral.agregarItem(producto);
    }

    public void mostrarInventarioGeneral() {
        System.out.println("\n*** Inventario de la Librería '" + nombre + "' ***");
        inventarioGeneral.mostrarInventario();
    }

    public void mostrarCategoriasYProductos() {
        System.out.println("\n--- Categorías en '" + nombre + "' ---");
        if (categorias.isEmpty()) {
            System.out.println("No hay categorías definidas.");
            return;
        }
        for (Categoria cat : categorias) {
            cat.mostrarProductos();
        }
        System.out.println("------------------------------------");
    }
}
