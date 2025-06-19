package Modulo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SerieNumerosEnteros {
    public static void main(String[] args) {
        System.out.println("**** Serie de Numeros Enteros ****");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Ingresa los numeros que desees sumar");
        System.out.println("Primer numero");
        numeros.add(scanner.nextInt());
        System.out.println("Segundo numero");
        numeros.add(scanner.nextInt());
        System.out.println("Tercer numero");
        numeros.add(scanner.nextInt());
        System.out.println("Numeros propocionados: " + numeros);

        int suma = numeros.get(0) + numeros.get(1) + numeros.get(2);
        System.out.println("La suma de los numeros ingresados es " + suma);

        double promedio = suma/numeros.size();
        System.out.println("El promedio es " + promedio);

        int valorMaximo = Collections.max(numeros);
        System.out.println("El valor maximo es " + valorMaximo);
        int valorMinimo = Collections.min(numeros);
        System.out.println("El valor minimo es " + valorMinimo);
    }
}
