package Examen_Modulo_2;

// 3. Clase concreta ProductoLibro
class ProductoLibro extends ProductoAbstracto {
    private String autor;
    private String isbn;

    public ProductoLibro(String nombre, double precio, String codigo, String descripcion, String autor, String isbn) {
        super(nombre, precio, codigo, descripcion);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void mostrarProducto() {
        System.out.println("--- Libro ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Precio: $" + String.format("%.2f", precio));
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("-------------");
    }
}