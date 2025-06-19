package Modulo1;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para la entrada

        System.out.print("Ingresa un número para verificar si es primo: ");
        int numero = scanner.nextInt(); // Leemos el número entero ingresado por el usuario

        // Llamamos a nuestra función para verificar si el número es primo
        boolean esPrimo = verificarPrimo(numero);

        // Imprimimos el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " NO es un número primo.");
        }

        scanner.close(); // Es buena práctica cerrar el objeto Scanner cuando ya no se usa
    }

    /**
     * Esta función determina si un número es primo o no.
     * @param num El número entero a verificar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean verificarPrimo(int num) {
        // Los números menores o iguales a 1 no son primos
        if (num <= 1) {
            return false;
        }

        // El 2 es el único número primo par
        if (num == 2) {
            return true;
        }

        // Si el número es par y mayor que 2, no es primo
        if (num % 2 == 0) {
            return false;
        }

        // Verificamos divisores impares desde 3 hasta la raíz cuadrada del número
        // No necesitamos ir más allá de la raíz cuadrada porque si un número tiene
        // un divisor mayor que su raíz cuadrada, también tendrá uno menor.
        for (int i = 3; i <= Math.sqrt(num); i += 2) { // i += 2 para verificar solo números impares
            if (num % i == 0) { // Si encontramos un divisor, no es primo
                return false;
            }
        }

        // Si no encontramos ningún divisor, el número es primo
        return true;
    }
}