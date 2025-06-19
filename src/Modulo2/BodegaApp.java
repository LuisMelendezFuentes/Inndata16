package Modulo2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BodegaApp {
    private ArrayList<Articulo> articulos;
    private int nextId;
    private Scanner scanner;

    public BodegaApp() {
        articulos = new ArrayList<>();
        nextId = 1;
        scanner = new Scanner(System.in);
    }

    public void agregarArticulo() {
        System.out.print("Ingrese el nombre del artículo: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nombre = scanner.nextLine();

        String codigoBarras;
        while (true) {
            System.out.print("Ingrese el código de barras del artículo: ");
            codigoBarras = scanner.nextLine();
            if (buscarArticuloPorCodigoBarrasInterno(codigoBarras) == null) {
                break; // El código de barras no existe, es válido
            } else {
                System.out.println("¡Error! Ya existe un artículo con ese código de barras. Intente con otro.");
            }
        }

        double precio = -1;
        while (precio < 0) {
            try {
                System.out.print("Ingrese el precio del artículo: ");
                precio = scanner.nextDouble();
                if (precio < 0) {
                    System.out.println("El precio no puede ser negativo. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número para el precio.");
                scanner.nextLine(); // Consumir la entrada incorrecta
            }
        }

        int existencia = -1;
        while (existencia < 0) {
            try {
                System.out.print("Ingrese la existencia inicial del artículo: ");
                existencia = scanner.nextInt();
                if (existencia < 0) {
                    System.out.println("La existencia no puede ser negativa. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero para la existencia.");
                scanner.nextLine(); // Consumir la entrada incorrecta
            }
        }

        Articulo nuevoArticulo = new Articulo(nextId++, nombre, codigoBarras, precio, existencia);
        articulos.add(nuevoArticulo);
        System.out.println("Artículo '" + nombre + "' agregado con éxito. ID: " + nuevoArticulo.getId());
    }

    public void editarArticulo() {
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos para editar en la bodega.");
            return;
        }

        int idEditar = -1;
        while (idEditar <= 0) {
            try {
                System.out.print("Ingrese el ID del artículo que desea editar: ");
                idEditar = scanner.nextInt();
                if (idEditar <= 0) {
                    System.out.println("El ID debe ser un número positivo. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero para el ID.");
                scanner.nextLine(); // Consumir la entrada incorrecta
            }
        }
        scanner.nextLine(); // Consumir el salto de línea pendiente

        Articulo articuloAEditar = null;
        for (Articulo art : articulos) {
            if (art.getId() == idEditar) {
                articuloAEditar = art;
                break;
            }
        }

        if (articuloAEditar != null) {
            System.out.println("\n--- Editando Artículo: " + articuloAEditar.getNombre() + " (ID: " + articuloAEditar.getId() + ") ---");
            System.out.println("Deje en blanco si no desea modificar el campo.");

            System.out.print("Nuevo nombre (actual: " + articuloAEditar.getNombre() + "): ");
            String nuevoNombre = scanner.nextLine();
            if (!nuevoNombre.isEmpty()) {
                articuloAEditar.setNombre(nuevoNombre);
            }

            String nuevoCodigoBarras;
            while (true) {
                System.out.print("Nuevo código de barras (actual: " + articuloAEditar.getCodigoBarras() + "): ");
                nuevoCodigoBarras = scanner.nextLine();
                if (nuevoCodigoBarras.isEmpty()) {
                    break; // No se modifica
                }
                Articulo existingArticulo = buscarArticuloPorCodigoBarrasInterno(nuevoCodigoBarras);
                if (existingArticulo == null || existingArticulo.getId() == articuloAEditar.getId()) {
                    articuloAEditar.setCodigoBarras(nuevoCodigoBarras);
                    break;
                } else {
                    System.out.println("¡Error! Ese código de barras ya pertenece a otro artículo. Intente con otro.");
                }
            }

            while (true) {
                System.out.print("Nuevo precio (actual: $" + String.format("%.2f", articuloAEditar.getPrecio()) + "): ");
                String precioStr = scanner.nextLine();
                if (precioStr.isEmpty()) {
                    break; // No se modifica
                }
                try {
                    double nuevoPrecio = Double.parseDouble(precioStr);
                    if (nuevoPrecio < 0) {
                        System.out.println("El precio no puede ser negativo. Intente de nuevo.");
                    } else {
                        articuloAEditar.setPrecio(nuevoPrecio);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número para el precio.");
                }
            }

            while (true) {
                System.out.print("Nueva existencia (actual: " + articuloAEditar.getExistencia() + "): ");
                String existenciaStr = scanner.nextLine();
                if (existenciaStr.isEmpty()) {
                    break; // No se modifica
                }
                try {
                    int nuevaExistencia = Integer.parseInt(existenciaStr);
                    if (nuevaExistencia < 0) {
                        System.out.println("La existencia no puede ser negativa. Intente de nuevo.");
                    } else {
                        articuloAEditar.setExistencia(nuevaExistencia);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero para la existencia.");
                }
            }

            System.out.println("Artículo con ID " + idEditar + " actualizado con éxito.");
            System.out.println(articuloAEditar); // Mostrar el artículo actualizado
        } else {
            System.out.println("No se encontró ningún artículo con el ID " + idEditar + ".");
        }
    }

    public void buscarArticuloPorCodigoBarras() {
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos en la bodega para buscar.");
            return;
        }

        System.out.print("Ingrese el código de barras del artículo a buscar: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String codigoBuscar = scanner.nextLine();

        Articulo articuloEncontrado = buscarArticuloPorCodigoBarrasInterno(codigoBuscar);

        if (articuloEncontrado != null) {
            System.out.println("\n--- Información del Artículo ---");
            System.out.println(articuloEncontrado);
            System.out.println("------------------------------");
        } else {
            System.out.println("No se encontró ningún artículo con el código de barras '" + codigoBuscar + "'.");
        }
    }

    public void eliminarArticulo() {
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos para eliminar en la bodega.");
            return;
        }

        int idEliminar = -1;
        while (idEliminar <= 0) {
            try {
                System.out.print("Ingrese el ID del artículo a eliminar: ");
                idEliminar = scanner.nextInt();
                if (idEliminar <= 0) {
                    System.out.println("El ID debe ser un número positivo. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero para el ID.");
                scanner.nextLine(); // Consumir la entrada incorrecta
            }
        }
        scanner.nextLine(); // Consumir el salto de línea pendiente

        Articulo articuloAEliminar = null;
        for (Articulo art : articulos) {
            if (art.getId() == idEliminar) {
                articuloAEliminar = art;
                break;
            }
        }

        if (articuloAEliminar != null) {
            articulos.remove(articuloAEliminar);
            System.out.println("Artículo '" + articuloAEliminar.getNombre() + "' con ID " + idEliminar + " eliminado con éxito.");
        } else {
            System.out.println("No se encontró ningún artículo con el ID " + idEliminar + " para eliminar.");
        }
    }

    public void buscarArticulosPorNombre() {
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos en la bodega para buscar.");
            return;
        }

        System.out.print("Ingrese el nombre (o parte del nombre) del artículo a buscar: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nombreBuscar = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para búsqueda insensible a mayúsculas/minúsculas

        List<Articulo> resultados = new ArrayList<>();
        for (Articulo art : articulos) {
            if (art.getNombre().toLowerCase().contains(nombreBuscar)) {
                resultados.add(art);
            }
        }

        if (!resultados.isEmpty()) {
            System.out.println("\n--- Artículos encontrados por nombre ('" + nombreBuscar + "') ---");
            for (Articulo art : resultados) {
                System.out.println(art);
            }
            System.out.println("-----------------------------------------");
        } else {
            System.out.println("No se encontraron artículos con el nombre que contenga '" + nombreBuscar + "'.");
        }
    }

    public void mostrarListaArticulosDisponibles() {
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos registrados en la bodega.");
            return;
        }

        System.out.println("\n--- Lista de Artículos Disponibles ---");
        for (Articulo art : articulos) {
            System.out.println(art);
        }
        System.out.println("------------------------------------");
    }

    public void buscarArticuloPorId() {
        if (articulos.isEmpty()) {
            System.out.println("No hay artículos en la bodega para buscar.");
            return;
        }

        int idBuscar = -1;
        while (idBuscar <= 0) {
            try {
                System.out.print("Ingrese el ID del artículo a buscar: ");
                idBuscar = scanner.nextInt();
                if (idBuscar <= 0) {
                    System.out.println("El ID debe ser un número positivo. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero para el ID.");
                scanner.nextLine(); // Consumir la entrada incorrecta
            }
        }
        scanner.nextLine(); // Consumir el salto de línea pendiente

        Articulo articuloEncontrado = null;
        for (Articulo art : articulos) {
            if (art.getId() == idBuscar) {
                articuloEncontrado = art;
                break;
            }
        }

        if (articuloEncontrado != null) {
            System.out.println("\n--- Información del Artículo (por ID) ---");
            System.out.println(articuloEncontrado);
            System.out.println("---------------------------------------");
        } else {
            System.out.println("No se encontró ningún artículo con el ID " + idBuscar + ".");
        }
    }

    // Método auxiliar para buscar un artículo por código de barras (uso interno)
    // Se hizo público para que la clase Ticket pueda acceder a él.
    public Articulo buscarArticuloPorCodigoBarrasInterno(String codigoBarras) {
        for (Articulo art : articulos) {
            if (art.getCodigoBarras().equals(codigoBarras)) {
                return art;
            }
        }
        return null;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú Principal de Bodega ---");
            System.out.println("1. Gestión de Artículos");
            System.out.println("2. Realizar Venta (Generar Ticket)");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        menuGestionArticulos();
                        break;
                    case 2:
                        // Crear un nuevo ticket y iniciar el proceso de venta
                        Ticket ticket = new Ticket(this); // Pasar la instancia de BodegaApp al ticket
                        ticket.leerProductos();
                        // Utilizamos el método público hayProductosEnVenta()
                        if (ticket.hayProductosEnVenta()) {
                            ticket.pagar();
                            ticket.imprimirTicket();
                        } else {
                            System.out.println("No se agregaron productos al ticket.");
                        }
                        break;
                    case 3:
                        System.out.println("¡Gracias por usar el sistema de gestión de bodega!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Consumir la entrada incorrecta
                opcion = 0; // Para que el bucle continúe
            }

        } while (opcion != 3);
        scanner.close();
    }

    public void menuGestionArticulos() {
        int opcionGestion;
        do {
            System.out.println("\n--- Menú de Gestión de Artículos ---");
            System.out.println("1. Agregar nuevo artículo");
            System.out.println("2. Editar datos de un artículo");
            System.out.println("3. Buscar un artículo por código de barras");
            System.out.println("4. Eliminar un artículo");
            System.out.println("5. Buscar artículos por nombre");
            System.out.println("6. Mostrar una lista de artículos disponibles");
            System.out.println("7. Buscar artículo por ID");
            System.out.println("8. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            try {
                opcionGestion = scanner.nextInt();
                switch (opcionGestion) {
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        editarArticulo();
                        break;
                    case 3:
                        buscarArticuloPorCodigoBarras();
                        break;
                    case 4:
                        eliminarArticulo();
                        break;
                    case 5:
                        buscarArticulosPorNombre();
                        break;
                    case 6:
                        mostrarListaArticulosDisponibles();
                        break;
                    case 7:
                        buscarArticuloPorId();
                        break;
                    case 8:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Consumir la entrada incorrecta
                opcionGestion = 0; // Para que el bucle continúe
            }
        } while (opcionGestion != 8);
    }

    public static void main(String[] args) {
        BodegaApp miBodega = new BodegaApp();
        miBodega.mostrarMenu();
    }
}