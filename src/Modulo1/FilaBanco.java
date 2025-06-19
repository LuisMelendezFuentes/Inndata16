package Modulo1;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {
        System.out.println("*** Fila de Banco ***");
        Scanner scanner = new Scanner(System.in);
        Random numeroTicket = new Random();
        System.out.println("Digite true para tomar un turno");
        boolean si = scanner.nextBoolean();
        System.out.println("Quiere otro turno");

        int ticket0 = numeroTicket.nextInt();
        System.out.println("Primer turno " +  ticket0);
        int ticket1 = numeroTicket.nextInt();
        System.out.println("Segundo turno " +  ticket1);
        int ticket2 = numeroTicket.nextInt();
        System.out.println("Tercer turno " +  ticket2);
        int ticket3 = numeroTicket.nextInt();
        System.out.println("Cuarto turno " +  ticket3);


        if(si == true){
            LinkedList<Integer> mensajes = new LinkedList<>();
            mensajes.offer(ticket0);
            mensajes.offer(ticket1);
            mensajes.offer(ticket2);
            mensajes.offer(ticket3);
            System.out.println("Los clientes se atendera de acuerdo al orden que llegaron " + mensajes);
        }else{
            System.out.println("Gracias por visitarnos");
        }

    }

}
