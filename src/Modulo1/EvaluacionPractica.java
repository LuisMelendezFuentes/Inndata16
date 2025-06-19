package Modulo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvaluacionPractica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int sumaTotal = 0;

        System.out.println("Ingresa números (ingresa 'fin' para terminar):");

        while (true) {
            System.out.print("Número: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un número válido o 'fin'.");
            }
        }

        // Filtrar, multiplicar y sumar usando Streams y Lambdas
        sumaTotal = numeros.stream()
                .filter(n -> n > 10) // Filtrar mayores que 10
                .map(n -> n * 2)    // Multiplicar por 2
                .mapToInt(Integer::intValue) // Convertir a IntStream para sumar
                .sum();             // Sumar resultados

        System.out.println("La suma total de los números procesados es: " + sumaTotal);
        scanner.close();
    }
}
