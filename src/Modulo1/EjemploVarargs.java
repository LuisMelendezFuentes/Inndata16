package Modulo1;

public class EjemploVarargs {

    // Método que calcula la suma de un número variable de enteros
    public static int sumarNumeros(int... numeros) {
        int suma = 0;
        // Internamente, 'numeros' se trata como un array (int[])
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    // Método que concatena un número variable de cadenas
    public static String concatenarCadenas(String... palabras) {
        StringBuilder sb = new StringBuilder();
        for (String palabra : palabras) {
            sb.append(palabra).append(" ");
        }
        return sb.toString().trim(); // .trim() para quitar el espacio final
    }

    public static void main(String[] args) {
        System.out.println("Suma de 1, 2, 3: " + sumarNumeros(1, 2, 3,4,5));
        System.out.println("Suma de 10, 20: " + sumarNumeros(10, 20));
        System.out.println("Suma de nada: " + sumarNumeros()); // Cero argumentos
        System.out.println("Suma de un solo número: " + sumarNumeros(50));

        System.out.println("\nConcatenación 1: " + concatenarCadenas("Hola", "Mundo"));
        System.out.println("Concatenación 2: " + concatenarCadenas("Java", "es", "genial"));
        System.out.println("Concatenación vacía: '" + concatenarCadenas() + "'");
    }
}
