package Examen_Modulo_2;

import java.util.ArrayList;
import java.util.List;

// Clase Main para demostración
public class Main {
    public static void main(String[] args) {
        // 1. Instanciar al menos tres productos diferentes
        ProductoLibro libro1 = new ProductoLibro("Cien años de soledad", 15.99, "L001", "Novela de realismo mágico.", "Gabriel García Márquez", "978-0307474278");
        ProductoLibro libro2 = new ProductoLibro("1984", 12.50, "L002", "Novela distópica de George Orwell.", "George Orwell", "978-0451524935");
        ProductoRevista revista1 = new ProductoRevista("National Geographic Julio", 7.99, "R001", "Edición de Julio 2023", "National Geographic", 250);
        ProductoRevista revista2 = new ProductoRevista("PC Gamer Agosto", 9.50, "R002", "Especial de juegos de rol.", "Future Publishing", 320);

        // 2. Instanciar al menos dos categorías
        Categoria ficcion = new Categoria("Ficción");
        Categoria ciencia = new Categoria("Ciencia y Naturaleza");
        Categoria tecnologia = new Categoria("Tecnología"); // Adding a third category for more variety

        // 3. Agregar productos a la categoría
        ficcion.agregarProducto(libro1);
        ficcion.agregarProducto(libro2);
        ciencia.agregarProducto(revista1);
        tecnologia.agregarProducto(revista2); // Adding magazine to technology

        // Mostrar productos por categoría
        ficcion.mostrarProductos();
        ciencia.mostrarProductos();
        tecnologia.mostrarProductos();

        // 4. Crear una librería y agregar categorías
        Libreria miLibreria = new Libreria("La Esquina del Lector");
        miLibreria.agregarCategoria(ficcion);
        miLibreria.agregarCategoria(ciencia);
        miLibreria.agregarCategoria(tecnologia);
        miLibreria.mostrarCategoriasYProductos();


        // 5. Crear inventario genérico para almacenar productos
        Inventario<Producto> inventarioGeneralLibreria = new Inventario<>();

        // Agregar todos los productos al inventario general
        inventarioGeneralLibreria.agregarItem(libro1);
        inventarioGeneralLibreria.agregarItem(libro2);
        inventarioGeneralLibreria.agregarItem(revista1);
        inventarioGeneralLibreria.agregarItem(revista2);

        // También podemos usar el método de la librería para agregar al inventario general si lo preferimos
        // miLibreria.agregarProductoAlInventarioGeneral(libro1);
        // miLibreria.agregarProductoAlInventarioGeneral(libro2);
        // miLibreria.agregarProductoAlInventarioGeneral(revista1);
        // miLibreria.agregarProductoAlInventarioGeneral(revista2);

        // 6. Mostrar el inventario genérico
        inventarioGeneralLibreria.mostrarInventario();
        // O si usamos el de la librería:
        // miLibreria.mostrarInventarioGeneral();

        System.out.println("\n--- Demostración de polimorfismo ---");
        List<Producto> productosVarios = new ArrayList<>();
        productosVarios.add(libro1);
        productosVarios.add(revista1);
        for (Producto p : productosVarios) {
            p.mostrarProducto();
            System.out.println();
        }
    }
}