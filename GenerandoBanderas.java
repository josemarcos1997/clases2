import java.util.Scanner;



public class GenerandoBanderas {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        int franjas;
        System.out.println("Generador de bamnderas");
        String[] color ={"\033[31m █████████████","\033[33m█████████████","\033[32m█████████████","\033[34m█████████████","\033[37m█████████████","\033[30m█████████████"};
        System.out.println("¿Cuantas franjas tiene su bandera?");
        franjas = s.nextInt();

        System.out.println("-----------------");
        for (int i = 0; i <franjas; i++){
            System.out.println(color[(int)(6*Math.random())]);
        System.out.println("\033[37m-----------------------");
        }

    }
}
