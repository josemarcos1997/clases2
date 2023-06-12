import java.net.ContentHandler;

public class BuclesEj3 {
    public static void main(String[]args){
        int numeroIngresado;
        int contadorPares;
    

        System.out.println("***Contador de pares***");
        System.out.println("Ingrese 5 numeros");
        
        for (int i=0; i<5; i++);{
        System.out.println("n"+ (i+1) +": ");
        numeroIngresado=Integer.parseInt(System.console().readLine());
        if ((numeroIngresado%2)==0){
            contadorPares++;

        }
    }
    System.out.println("\ncantidad de pares: " + contadorPares);


    }

    
}
