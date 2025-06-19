package Modulo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        System.out.println("**** Mostrar Solo las Vocales de una Palabra ****");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        char[] caracteres = palabra.toLowerCase().toCharArray();

        ArrayList<Character> vocalesEncontradas = new ArrayList<>();

        for (char caracter : caracteres) {
            // Verificar si el caracter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vocalesEncontradas.add(caracter); // Si es vocal, la añadimos al ArrayList
            }
        }

        System.out.println("---");

//        System.out.print("Las vocales en la palabra son (una por una): ");
//        if (vocalesEncontradas.isEmpty()) {
//            System.out.println("Ninguna vocal encontrada.");
//        } else {
//            for (char vocal : vocalesEncontradas) {
//                System.out.print(vocal + " ");
//            }
//            System.out.println(); // Salto de línea final
//        }

        Character[] vocalesArrayWrapper = vocalesEncontradas.toArray(new Character[0]);
        System.out.println("Las vocales en la palabra son (usando Arrays.toString): " + Arrays.toString(vocalesArrayWrapper));


        scanner.close(); // Cerrar el scanner

    }
}
