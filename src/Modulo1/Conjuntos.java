package Modulo1;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
//        Set<String> frutas = new HashSet<>();
//        //Para añadir se utiliza el metodo ADD
//        frutas.add("durazno");
//        frutas.add("manzana");
//        frutas.add("pera");
//        frutas.add("manzana");//No se repite o lo ingnora mi compilador
//        frutas.add("uva");
//        System.out.println(frutas);
//        boolean continuaUva = frutas.contains("Manzana");
//        System.out.println(continuaUva);
//        frutas.remove("manzana");
//        System.out.println(frutas);
//        int longitud = frutas.size();
//        System.out.println(longitud);
//        //Para recorrer el conjunto
//        for(String f: frutas){
//            System.out.println(f + " *** ");

        Set<String> frutas = new TreeSet<>();
        //Para añadir se utiliza el metodo ADD
        frutas.add("durazno");
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("Manzana");//No se repite o lo ingnora mi compilador
        frutas.add("uva");
        System.out.println(frutas);
        boolean contieneUva = frutas.contains("Manzana");
        System.out.println(contieneUva);
        frutas.remove("manzana");
        System.out.println(frutas);
        int longitud = frutas.size();
        System.out.println(longitud);
        //Para recorrer el conjunto
        for(String f: frutas){
            System.out.println(f + " *** ");
        }

    }
}
