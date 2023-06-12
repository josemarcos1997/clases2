import java.util.Scanner;

public class Tarea01 {
    public static void main(String[]args){

        int dia
        Scanner numeroIngresado= new Scanner(System.in);
        System.out.printnl("ingrese un numero del 1 al 7: ");
        dia= numeroIngresado.nextInt();
        switch (dia)
         {
            case 1: System.out.println("hoy es domingo:");
                
                break;
            case 2: System.out.println("hoy es lunes:")+("hoy tenes curso");
                

                break;

            case 3: System.out.println("hoy es martes:");
                
                break;
            case 4: System.out.println("hoy es miercoles:")+("hoy tenes curso");
                
                break;
            case 5: System.out.println("hoy es jueves:");
                
                break;
            case 6: System.out.println("hoy es viernes:")+("hoy tenes curso");
                
                break;
                

        
            default:System.out.println("hoy es sabado");
                break;

    


    }
}
