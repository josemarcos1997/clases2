import java.util.Scanner;

public class ArraysEj1Vectores {
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        int vector[] = new int[10];
        for (int i = 0; i<10;i++){
            System.out.print("ingrese un numero "+ i + ": ");

            vector [i]=s.nextInt();


        }
        System.out.println("valores del vector :");
        for(int i = 0; i<10; i++){
            System.out.println("indice "+ 1 + ": " + vector[i]);
            

        }
    }

    
}
