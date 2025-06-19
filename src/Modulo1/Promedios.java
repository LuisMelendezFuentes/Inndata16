package Modulo1;

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero de estudiantes");
        int numeroEstudiantes = entrada.nextInt();
        /*Creando un arreglo vacio*/
        double[] calificaciones = new double[numeroEstudiantes];
        for (int i=0; i<numeroEstudiantes; i++){
            System.out.println("Ingresa la calificación del alumno " + (i+1));
            double calificacion = entrada.nextDouble();
            calificaciones[i] = calificacion;
        }
        //For each
        double total =0;

        for(double cal: calificaciones){
            total+=cal;
        }

        double promedio=total/numeroEstudiantes;
        System.out.println("El promedio de calificaciones es " + promedio);
        //System.out.println(calificaciones);
    }
}
