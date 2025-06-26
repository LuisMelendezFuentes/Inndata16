package Examen_Modulo_2;

// 2. Clase abstracta ProductoAbstracto
abstract class ProductoAbstracto implements Producto {
    protected String nombre;
    protected double precio;
    protected String codigo;
    protected String descripcion;

    public ProductoAbstracto(String nombre, double precio, String codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    // showProduct will be implemented by concrete classes
    @Override
    public abstract void mostrarProducto();
}
