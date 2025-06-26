package Examen_Modulo_2;
import java.util.ArrayList;
import java.util.List;

// 4. Clase Categoria
class Categoria {
    private String nombre;
    private List<Producto> productosEnCategoria;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productosEnCategoria = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(Producto producto) {
        this.productosEnCategoria.add(producto);
    }

    public List<Producto> getProductosEnCategoria() {
        return productosEnCategoria;
    }

    public void mostrarProductos() {
        if (productosEnCategoria.isEmpty()) {
            System.out.println("La categoría '" + nombre + "' no tiene productos.");
            return;
        }
        System.out.println("\nProductos en la categoría: " + nombre);
        System.out.println("------------------------------------");
        for (Producto p : productosEnCategoria) {
            System.out.println("- " + p.getNombre() + " (Código: " + p.getCodigo() + ")");
        }
        System.out.println("------------------------------------");
    }
}