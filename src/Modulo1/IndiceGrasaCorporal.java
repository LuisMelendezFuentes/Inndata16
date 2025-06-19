package Modulo1;

import java.util.Scanner;

public class IndiceGrasaCorporal {
    public static void main(String[] args) {
        //Se solicitan datos para caluclar IMC
        System.out.println("**** Calcula tu indice de grasa corporal ****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona Peso de la Persona en Kg. ");
        double pesoPersona = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona la Altura de la Persona en metros");
        double alturaPersona = Double.parseDouble(scanner.nextLine());
        double indiceGrasaCorporal = (pesoPersona) / Math.pow(alturaPersona, 2);
        String formato1 = String.format("%.2f", indiceGrasaCorporal);

        System.out.println("El indice de masa corporal es: " + formato1);
        System.out.println(" ");

        String correo;
        boolean seguirPreguntando = true;

        while (seguirPreguntando){
            System.out.println("*1.Enviar los resultados a tu correo");
            System.out.println("*2.Imprimir los resultados en un ticket");
            System.out.println("*3.Pegar los resultados");
            System.out.println("*4.Salir");
            int opcion = scanner.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("Ingresa tu correo: ");
                    correo = scanner.next();
                    System.out.println("El resultado se envio al correo: " + correo);
                    System.out.println("Deseeas elegir mas opciones");
                    System.out.println("*1.Si");
                    System.out.println("*2.No");
                    int salir = scanner.nextInt();
                        if(salir == 1){
                            seguirPreguntando = true;
                        }else
                            seguirPreguntando = false;
                    break;

                case 2:
                    System.out.println("El ticket esta impreso");
                    System.out.println("Peso: " + pesoPersona + "Altura: " + alturaPersona);
                    System.out.println("Indice de masa corporal: " + indiceGrasaCorporal);
                    System.out.println("Deseeas elegir mas opciones");
                    System.out.println("*1.Si");
                    System.out.println("*2.No");
                    salir = scanner.nextInt();;
                    if(salir == 1){
                        seguirPreguntando = true;
                    }else
                        seguirPreguntando = false;
                    break;

                case 3:
                    System.out.println("El resulado del IMC de a cargado al portapapeles");
                    System.out.println("Deseeas elegir mas opciones");
                    System.out.println("*1.Si");
                    System.out.println("*2.No");
                    salir = scanner.nextInt();;
                    if(salir == 1){
                        seguirPreguntando = true;
                    }else
                        seguirPreguntando = false;
                    break;

                case 4:
                    System.out.println("Elegiste Salir");
                    seguirPreguntando = false;
                    break;

                default:
                    System.out.println("Esa no es una opción del menu");
                    break;
            }

        }
        System.out.println("Gracias por utilizar el servicio");

    }

}

