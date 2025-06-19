package Modulo1;

public class DefiniendoArreglos {
    public static void main(String[] args) {
        String[] nombres = {"Elena","Arturo","Berenice", "Leonardo"};
        nombres[3]="Arturo2";
        for(String name: nombres){
            System.out.println(name);
        }
    }
}
