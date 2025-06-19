package Modulo1;

import java.util.LinkedList;
import  java.util.PriorityQueue;

public class Queve {
    public static void main(String[] args) {

//        LinkedList<String> mensajes = new LinkedList<>();
//        //Para añadir podemos usar offer que nos regresa false si el elmento
//        // no puede ser añadido y add nos regresa una excepcion o error si el elemento
//        // no puede ser añadido
//
//        mensajes.offer("Hola");
//        mensajes.offer("Mundo");
//        mensajes.offer("Adiós");
//        mensajes.offer("java");
//        System.out.println(mensajes);

       PriorityQueue<String> mensajes = new PriorityQueue<>();
        //Para añadir podemos usar offer que nos regresa false si el elmento
        // no puede ser añadido y add nos regresa una excepcion o error si el elemento
        // no puede ser añadido

        mensajes.offer("Hola");
        mensajes.offer("Mundo");
        mensajes.offer("Adiós");
        mensajes.offer("java");
        System.out.println(mensajes);

        //Si queremos que no regrese la parte delantera element() o peek()
        //Si usamos peek() nos regresa  null si esta vacio
        //si usamos element() nos arroja una excepcion
        System.out.println(mensajes.peek());
        //Para eliminar elmentos poll() regresa null y remove() regresa una exepcion
        for(String message: mensajes){
            System.out.println("*** " + message + " ***");
        }
        while(!mensajes.isEmpty()){
            System.out.println(mensajes.poll());
        }
        System.out.println(mensajes.poll());
        System.out.println(mensajes.poll());
        System.out.println(mensajes.poll());
        System.out.println(mensajes.remove());
        System.out.println(mensajes.element());

            }
}
