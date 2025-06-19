package Modulo1;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de estudiantes");
        int estudiantes = scanner.nextInt();
        System.out.println("Ingresa el numero de asignaturas");
        int asignaturas = scanner.nextInt();
        double[][] notas = new double[estudiantes][asignaturas];
        for(int i = 0; i<estudiantes; i++)//primer for para las columnas
        {
            System.out.println("Notas del estudiante " + (i+1));
            for(int j=0; j<asignaturas; j++){ //Segundo for para las columnas
                System.out.println("nota de asignatura " + (j+1));
                notas[i][j] =scanner.nextDouble();
            }
        }
        //Imprimir
        for(int i = 0; i<estudiantes; i++){ //primer for para las columnas
            for(int j=0; j<asignaturas; j++){
                System.out.print(notas[i][j] + " ");
            }
            System.out.println(" ");
            //Sacar el promedio por estudiante
//            for(double[] estudiante: notas){
//                double suma=0;
//                for(double cal: estudiante){
//                    suma += cal;
//                }
//
//                double promedio=suma/estudiante.length;
//
//                System.out.println("El promedio del estudiantes es : " + promedio);
//
//            }

        }

        //Sacar el promedio por estudiante
        for(double[] estudiante: notas){
            double suma=0;
            for(double cal: estudiante){
                suma += cal;
            }

            double promedio=suma/estudiante.length;

            System.out.println("El promedio del estudiantes es : " + promedio);

        }

    }
}
