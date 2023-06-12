import java.lang.invoke.SwitchPoint;
import java.security.PublicKey;
import java.util.Scanner;

public class EjemploSwitchCase {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int numeroMes;
        System.out.println("ingrese numero del mes");
        numeroMes = s .nextInt();

        Switch(numeroMes){
            case 1:
                System.out.println("el mes de enero");
                case 2:
                System.out.println("el mes de febrero");
                case 3:
                System.out.println("el mes de marzo");
                case 4:
                System.out.println("el mes de abril");
                case 5:
                System.out.println("el mes de mayo");
                case 6:
                System.out.println("el mes de junio");
                case 7:
                System.out.println("el mes de julio");
                case 8:
                System.out.println("el mes de agosto");
                case 9:
                System.out.println("el mes de septiembre");
                case 10:
                System.out.println("el mes de octubre");
                case 11:
                System.out.println("el mes de noviembre");
                case 12:
                System.out.println("el mes de diciembre");
                


                

        }


    }
    
}
