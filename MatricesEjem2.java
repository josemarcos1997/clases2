import java.util.Random;
import java.util.Scanner;

public class MatricesEjem2{
//esta es la funcion principal
    public static void main(String[]args){
        int[][]matrizNull= new int[3][3];
        int[][]matrizNoNull={{1,2,3},{4,5,6},{7,8,9}};
        int num1;
        int num2;
        int resultado;
        String palabra;


        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizNull[i][j]= (int)(Math.random()*10);
            }
         }
         System.out.println("ingrese un numero");
         num1 = Integer.parseInt(System.console().readLine());
         System.out.println("ingrese otro numero");
         num2 = Integer.parseInt(System.console().readLine());


         palabra=System.console().readLine();
         resultado=SumaDosNumeros(num1,num2,palabra);
         HolaMundo();
        }
     

    //aca comineza la declaracion de las funciones
    public static void HolaMundo() {
        System.out.println("hola, mundo");

    }
    public static int SumaDosNumeros(int a ,int b ,String c) {
        int resultadoFuncion;
        resultadoFuncion= a+b;

        System.out.println("la palabra ingresada fue : " + c +  resultadoFuncion);


        return resultadoFuncion;
        
    }
}

 