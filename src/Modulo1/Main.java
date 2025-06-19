package Modulo1;

/*Mi primer progrma en
java
 */
public class Main {
    public static void main(String[] args) {
        // Imprimiendo Hola Mundo  en consola
        System.out.println("Hello World");
        //Declaración de tipo de variable

        final int numero = 25;
        System.out.println("Numero: " + numero);


        String nombre = "Veronica";
        int numeroCaracteres = nombre.length();
        System.out.println(nombre + " tiene " + numeroCaracteres + " caracteres. ");
        /*
        Byte edad = 18;
        edad.
        Short
        Interger
        Long
        */

        //float cuadrado = Math.pow(3,2);
        //System.out.println(cuadrado);

        var x = 5;
        var y = 3;
        var z = 1;
        var resultado = z + x * y;

        System.out.println( "Resultado de 1 + 3*5 = " + resultado);

        x = 6;
        y = 3;
        z = 5;

        resultado = (x/y)*z+(x/y);
        System.out.println("resultado de 6/3*5+(6/3) = " + resultado);

        x = 5;
        y= 6;
        z= 7;
        var a = 3;

        resultado = ((x+y)*z-a)+x;

        System.out.println("Resultado de ((5+6)*7-3)+5 = " + resultado);

        x = 3;
        y = 2;
        z= 10;
        a = 6;
        resultado = (byte) ((Math.pow((x+y),y)+(z/y))/a);
        System.out.println("El resultado es: " + resultado);

        int prueba = 300;
        byte pruebaByte = (byte) prueba;
        System.out.println(pruebaByte);


        x = 6;
        y = 5;
        z = 9;

        resultado = ((x*y)/(z+x));

        x = 2*16/9*2;
        System.out.println(x);




    }
}
