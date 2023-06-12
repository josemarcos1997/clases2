import java.lang.invoke.SwitchPoint;
import java.util.function.BiPredicate;

public class MenuSwitch {
    public static void main (String[]args){
        int seleccion;
        int num1;
        int num2;
        System.out.println("ingrese primer numero");
        num1=Integer.parseInt(System.console().readLine());
        System.out.println("ingrese segundo numero");
        num2=Integer.parseInt(System.console().readLine());
        

        System.out.println("***Menu de opciones***");
        System.out.println("1: suma");
        System.out.println("2:resta");
        System.out.println("3:multiplicacion");
        System.out.println("4:Division");
        seleccion =Integer.parseInt(System.console().readLine());

        switch(seleccion){
            case 1:System.out.println(num1+num2);
            break;
            case 2:System.out.println(num1-num2);
            break;
            case 3:System.out.println(num1*num2);
            break;
            case 4:System.out.println((double)num1/(double)num2);
            break;
            default:
                System.out.println("Opcion incorrecta");
 
    }
}
}