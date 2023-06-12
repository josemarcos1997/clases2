import java.util.Scanner;

import javax.print.event.PrintEvent;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class EjemploOperadoresLogicos {
    public static void main(String[]args){
        
    
    Scanner s=new Scanner(System.in);
    int num1;
    int num2;

//primero arrancamos con && que es "y"
    System.out.println("ingrese un numero");
    num1= s.nextInt();
    System.out.println("ingrese otro numero");
    num2= s.nextInt();
    if (num1>50 && num1<100){
        System.out.println("numero ingresado se encuentra entre 50 y 100");
        }else{
            System.out.println("numero esta fuera de rango");

        }
    

        //ahora vamos con el || que es "o"
        System.out.println("ingrese un numero");
        num1= s.nextInt();
        System.out.println("ingrese otro numero");
        num2= s .nextInt();
        if ((num1>10&&num1<20)||(num2>10&&num2<20)){
            System.out.println("algunos de los valores esta entre 10 y 20");
            }else{
                System.out.println("ningun numero esta entre 10 y 20");
            }

        } 


    }
}

    

