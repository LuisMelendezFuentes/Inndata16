package Examen_Modulo_2;

// 3. Clase concreta ProductoRevista
class ProductoRevista extends ProductoAbstracto {
    private String editorial;
    private int numero;

    public ProductoRevista(String nombre, double precio, String codigo, String descripcion, String editorial, int numero) {
        super(nombre, precio, codigo, descripcion);
        this.editorial = editorial;
        this.numero = numero;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void mostrarProducto() {
        System.out.println("--- Revista ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Editorial: " + editorial);
        System.out.println("Número: " + numero);
        System.out.println("Precio: $" + String.format("%.2f", precio));
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("----------------");
    }
}