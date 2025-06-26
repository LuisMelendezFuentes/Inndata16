package Examen_Modulo_2;

import java.util.ArrayList;
import java.util.List;

// 5. Clase Inventario Generica
class Inventario<T extends Producto> {
    private List<T> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(T item) {
        this.items.add(item);
        System.out.println("Agregado al inventario: " + item.getNombre());
    }

    public void mostrarInventario() {
        if (items.isEmpty()) {
            System.out.println("\nEl inventario está vacío.");
            return;
        }
        System.out.println("\n--- Inventario General de Productos ---");
        for (T item : items) {
            item.mostrarProducto();
            System.out.println(); // Add a blank line for readability between products
        }
        System.out.println("---------------------------------------");
    }

    public int getCantidadTotal() {
        return items.size();
    }
}