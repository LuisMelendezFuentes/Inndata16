package Modulo2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Articulo {
    private int id;
    private String nombre;
    private String codigoBarras;
    private double precio;
    private int existencia;

    // Constructor
    public Articulo(int id, String nombre, String codigoBarras, double precio, int existencia) {
        this.id = id;
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precio = precio;
        this.existencia = existencia;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencia() {
        return existencia;
    }

    // Setters (para permitir la edición)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Código de Barras: " + codigoBarras +
                ", Precio: $" + String.format("%.2f", precio) + ", Existencia: " + existencia;
    }
}

