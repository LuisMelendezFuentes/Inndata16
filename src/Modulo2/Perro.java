package Modulo2;

public class Perro extends Canino{

    private String raza;
    private boolean tieneVacunas;

    public Perro(String especie, String nombre, int edad, boolean esDomestico, String raza, boolean tieneVacunas) {
        super(especie, nombre, edad, esDomestico);
        this.raza = raza;
        this.tieneVacunas = tieneVacunas;
    }

    public String getRaza() {
        return raza;
    }

    public boolean tieneVacunas() {
        return tieneVacunas;
    }





    public static void main(String[] args) {
        Perro perro = new Perro("Perro","Sparky", 5 ,true, "Chihuahua",true);
        perro.jugar();
        perro.ladrar();
    }
}
