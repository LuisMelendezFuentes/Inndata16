package Modulo1;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class ConjuntoJugadores {
    public static void main(String[] args) {
        System.out.println("**** Conjunto de Jugadores del FC Barcelona ****");
        Set<String> jugadores = new HashSet<>();
        jugadores.add("Ronaldiño");
        jugadores.add("Eto");
        jugadores.add("Puyol");
        jugadores.add("Neymar JR");

        for(String j: jugadores){
            System.out.println(j + " *** ");
        }

        boolean contieneJugador = jugadores.contains("Neymar JR");
        System.out.println("¿Contiene al jugador Neymar JR? " );
        if(contieneJugador == true){
            System.out.println("Es correcto");
        }else{
            System.out.println("no");
        }



    }


}
