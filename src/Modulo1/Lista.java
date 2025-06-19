package Modulo1;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        //Para añadir elementos
        nombres.add("Alexis");
        nombres.add("Berenice");
        nombres.add("Catalina");
        nombres.add("Esperanza");
        System.out.println(nombres);
        System.out.println("El 3er nombre es " + nombres.get(2));
        int longitud = nombres.size();
        System.out.println("La longitud de las lista es " + longitud);
        nombres.set(0,"Alex");
        System.out.println(nombres);
        nombres.remove("Esperanza");
        System.out.println(nombres);
        System.out.println("Esperanza esta en la lista? " + nombres.contains("Alex"));

        for(String name:nombres){
            System.out.println(name);
        }
    }
}
