package Modulo2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Ticket {
    // Clase interna para representar los items en el ticket
    static class ItemTicket {
        Articulo articulo;
        int cantidad;
        double precioUnitario;
        double precioTotalProducto; // Precio unitario * cantidad

        public ItemTicket(Articulo articulo, int cantidad) {
            this.articulo = articulo;
            this.cantidad = cantidad;
            this.precioUnitario = articulo.getPrecio();
            this.precioTotalProducto = this.precioUnitario * cantidad;
        }

        @Override
        public String toString() {
            return String.format("%-25s %-5d @ $%-10.2f $%-10.2f",
                    articulo.getNombre(), cantidad, precioUnitario, precioTotalProducto);
        }
    }

    private List<ItemTicket> productosEnVenta;
    private double totalVenta;
    private double pagoCliente;
    private double cambio;
    private Scanner scanner;
    private BodegaApp bodega; // Necesitamos acceso a la bodega para obtener artículos

    public Ticket(BodegaApp bodega) {
        this.productosEnVenta = new ArrayList<>();
        this.totalVenta = 0.0;
        this.pagoCliente = 0.0;
        this.cambio = 0.0;
        this.scanner = new Scanner(System.in);
        this.bodega = bodega;
    }

    public void leerProductos() {
        System.out.println("\n--- Agregar Productos al Ticket ---");
        String codigoBarras;
        int cantidad;

        while (true) {
            System.out.print("Ingrese código de barras del producto (o 'fin' para terminar): ");
            codigoBarras = scanner.nextLine().trim();

            if (codigoBarras.equalsIgnoreCase("fin")) {
                break;
            }

            Articulo articuloEncontrado = null;
            // Buscar el artículo en la bodega usando el método buscarArticuloPorCodigoBarrasInterno
            articuloEncontrado = bodega.buscarArticuloPorCodigoBarrasInterno(codigoBarras);

            if (articuloEncontrado == null) {
                System.out.println("Artículo no encontrado con ese código de barras.");
                continue;
            }

            if (articuloEncontrado.getExistencia() <= 0) {
                System.out.println("Lo sentimos, el artículo '" + articuloEncontrado.getNombre() + "' no tiene existencia.");
                continue;
            }

            while (true) {
                try {
                    System.out.print("Ingrese cantidad para '" + articuloEncontrado.getNombre() + "' (existencia: " + articuloEncontrado.getExistencia() + "): ");
                    cantidad = scanner.nextInt();
                    if (cantidad <= 0) {
                        System.out.println("La cantidad debe ser mayor a cero.");
                    } else if (cantidad > articuloEncontrado.getExistencia()) {
                        System.out.println("No hay suficiente existencia. Solo quedan " + articuloEncontrado.getExistencia() + " unidades.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero para la cantidad.");
                    scanner.nextLine(); // Consumir la entrada incorrecta
                }
            }
            scanner.nextLine(); // Consumir el salto de línea pendiente

            // Reducir la existencia en la bodega
            articuloEncontrado.setExistencia(articuloEncontrado.getExistencia() - cantidad);

            // Agregar al ticket
            ItemTicket item = new ItemTicket(articuloEncontrado, cantidad);
            productosEnVenta.add(item);
            totalVenta += item.precioTotalProducto;
            System.out.println("Agregado: " + item.articulo.getNombre() + " x" + item.cantidad);
        }
    }

    public void pagar() {
        if (productosEnVenta.isEmpty()) {
            System.out.println("No hay productos en el ticket para pagar.");
            return;
        }

        System.out.println("\n--- Realizar Pago ---");
        System.out.printf("Total a pagar: $%.2f%n", totalVenta);

        while (true) {
            try {
                System.out.print("Ingrese el monto con el que paga el cliente: ");
                pagoCliente = scanner.nextDouble();
                if (pagoCliente < totalVenta) {
                    System.out.println("El pago del cliente es insuficiente. Faltan $" + String.format("%.2f", (totalVenta - pagoCliente)));
                } else {
                    cambio = pagoCliente - totalVenta;
                    System.out.printf("Cambio: $%.2f%n", cambio);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número para el pago.");
                scanner.nextLine(); // Consumir la entrada incorrecta
            }
        }
        scanner.nextLine(); // Consumir el salto de línea pendiente
    }

    public void imprimirTicket() {
        if (productosEnVenta.isEmpty() && totalVenta == 0) {
            System.out.println("No hay ticket para imprimir. Agregue productos y realice el pago.");
            return;
        }

        System.out.println("\n===================================");
        System.out.println("          TICKET DE VENTA          ");
        System.out.println("-----------------------------------");
        System.out.printf("%-25s %-5s %-12s %-10s%n", "Producto", "Cant.", "P.Unitario", "Total");
        System.out.println("-----------------------------------");
        for (ItemTicket item : productosEnVenta) {
            System.out.println(item);
        }
        System.out.println("-----------------------------------");
        System.out.printf("%-42s $%-10.2f%n", "TOTAL VENTA:", totalVenta);
        System.out.printf("%-42s $%-10.2f%n", "PAGO CLIENTE:", pagoCliente);
        System.out.printf("%-42s $%-10.2f%n", "CAMBIO:", cambio);
        System.out.println("===================================");
        System.out.println("          ¡GRACIAS POR SU COMPRA!          ");
        System.out.println("===================================");
    }

    /**
     * Método público para verificar si hay productos en la venta.
     * Esto soluciona el error de acceso 'private'.
     * @return true si la lista de productosEnVenta no está vacía, false en caso contrario.
     */
    public boolean hayProductosEnVenta() {
        return !productosEnVenta.isEmpty();
    }
}