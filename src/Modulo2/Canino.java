package Modulo2;

public class Canino {

    private String especie;
    private String nombre;
    private int edad;
    private boolean esDomestico;

    public Canino(){

    }

    public Canino(String especie, String nombre, int edad, boolean esDomestico) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.esDomestico = esDomestico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void ladrar() {
        System.out.println(nombre + " está ladrando: ¡Guau guau!");
    }

    public void jugar() {
        System.out.println(nombre + " está jugando.");
    }

}
