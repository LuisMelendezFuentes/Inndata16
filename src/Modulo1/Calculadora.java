package Modulo1;

import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("*1. Suma");
        System.out.println("*2. Resta");
        System.out.println("*3. Multiplicación");
        System.out.println("*4. División");
        System.out.println("*5. Salir");
        System.out.println("Ingresa la opción que desees ");

        int opcion = scanner.nextInt();
//        do{
//            switch (opcion){
//                case 1:
//                    int num1 = pedirValor1();
//                    int num2 = pedirValor1();
//                    int suma = num1 + num2;
//                    System.out.println(num1 + " " + num2 + " = " + suma);
//                    break;
//
//                case 2:
//                    System.out.println("Ingresa el primer dato");
//                    num1 = scanner.nextInt();
//                    System.out.println("Ingresa el segundo dato");
//                    num2 = scanner.nextInt();
//                    int resta = num1 - num2;
//                    System.out.println(num1 + " + " + num2 + " = " + resta );
//                    break;
//
//                case 3:
//                    System.out.println("Ingresa el primer dato");
//                    num1 = scanner.nextInt();
//                    System.out.println("Ingresa el segundo dato");
//                    num2 = scanner.nextInt();
//                    double multiplicacion = num1 * num2;
//                    System.out.println(num1 + " * " + num2 + " = " + multiplicacion );
//                    break;
//
//                case 4:
//                    System.out.println("Ingresa el primer dato");
//                    num1 = scanner.nextInt();
//                    System.out.println("Ingresa el segundo dato");
//                    num2 = scanner.nextInt();
//                    double division = num1 / num2;
//                    System.out.println(num1 + " / " + num2 + " = " + division );
//                    break;
//                default:
//                    System.out.println("Esa no es una opción del menu");
//
//            }
//
//        }while (opcion!=5);

        Calculadora c= new Calculadora();
        double res= c.sumar(5.0, 8.5,80,90);
        System.out.println(res);

    }
    public double sumar(double... numeros){
        double suma =0;
        for(double num:numeros ){
            suma +=num;
        }
        return suma;
    }

        static int pedirValor1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el primer dato: ");
            int num1 = scanner.nextInt();
            return num1;
        }

}
