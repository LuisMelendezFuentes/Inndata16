package Modulo1;

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Determinar numero par o impar");
        System.out.println("Introduce el numero a evaluar");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

            if(numero%2 == 0){
                System.out.println("El numero es par");
            }else {
                System.out.println("El numero es impar");
            }

    }
}