import java.util.Scanner;

public class Arraysej12{
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        int vector[] = new int[10];
        int numeroIngresado;

        System.out.println("ingrese numero entre el 20 y 50");


        for (int i = 0; i<10;i++){
            System.out.print("ingrese un numero "+ (i+1) + ": ");
            numeroIngresado= s .nextInt();


            vector [i]= numeroIngresado;



        }
        System.out.println("valores del vector :");
        for(int i = 0; i<10; i++){
            System.out.println("indice "+ 1 + ": " + vector[i]);
            



