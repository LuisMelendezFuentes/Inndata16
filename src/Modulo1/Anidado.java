package Modulo1;

import java.util.Scanner;
/*El usuario debe teenr una calificacion minima de 7
* y al menos 8 asistencias de 10+7
* La primera es usando una condicion que involucra operadores relacionales
* y operadores boolenos califiacion>=70 && asistencias >=8
* y la otra el if anidado*/

public class Anidado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona tu califaicón");
        double calificacion = scanner.nextDouble();
        System.out.println("¿Cuantas asistencias tienes");
        double asistencias = scanner.nextInt();
        if(calificacion>=70){
            if(asistencias<=8){
                System.out.println("Aprobaste el curso");
            }else {
                System.out.println("No aprobaste");
            }
        }else{
            System.out.println("No aprobaste");
        }
    }
}
