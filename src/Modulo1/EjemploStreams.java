package Modulo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        try{
            for(int i= 0; i<5; i++){
                System.out.println("Ingresa un nombre");
                nombres.add(scanner.nextLine());
            }
            List<String> mayoresACinco = nombres.stream().filter(nombre->nombre.startsWith("a")).toList();
            System.out.println(mayoresACinco);
        }catch (Exception e){
            System.out.println("Valor invalido");
        }
    }
}
