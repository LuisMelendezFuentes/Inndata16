package Modulo1;

public class DoWhile {
    public static void main(String[] args) {
        int contador = 0;
        System.out.println("Ejemplo de bucle do-while:");
        do {
            System.out.println("Este mensaje se imprimirá al menos una vez. Contador: " + contador);
            contador++;
        } while (contador < 5); // La condición (6 < 5) es falsa después de la primera ejecución
        System.out.println("Fin del bucle do-while. Contador: " + contador);
// Salida:
// Ejemplo de bucle do-while:
// Este mensaje se imprimirá al menos una vez. Contador: 5
// Fin del bucle do-while. Contador: 6
    }
}
