package Modulo1;

import java.util.Scanner;

public class TablaMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual tabla deseeas?");
        int tabla = scanner.nextInt();
        for(int i = 0; i<=10; i++ ){
            int respuesta = tabla * i;
//            System.out.println(tabla "*" + i + resultado);
        }
    }
}
