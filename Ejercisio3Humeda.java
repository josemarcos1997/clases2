
//un grupo de cientificos esta realizando un estudio de clima en bariloche en el año 2020
//se sabe que la temperatura promedio es de 8.1 c°y la humedad promedio es del 72% ambos valores son de años ateriores 
//los cientificos piden que realice un programa que le soliciten el ingreso de  temperatura y humedad promedios de cada mes y
//luega devuelva la siguiente informacion:
//1:temperatura promedio del 2020
//2:humedad promedio del 2020
//3:indicar si la  temperatura promedio del 2020 fue distinta a los registros historicos.Es decir 
//indicar si fue mayor o menor  y de cuantos grados
//4:indicar el promedio de humedad en el mes mas seco.
//5:indicar el promedio de temperatura en el mes caluroso

import java.util.Scanner;

public class Ejercisio3Humeda {
    public static void main(String[] args){
        float meses = 0;
        float acum = 1;

        Scanner r = new Scanner(System.in);
        System .out.println("ingrese la cantidad de meses a promediar");
        float cm = r.nextFloat();
        while(acum<=cm){
            System.out.println("ingrese el mes numero: " + acum);
            float m = r.nextFloat();
            meses += m;
            acum++;


        }
        float promedio = meses /cm;
        System.out.println("el promedio es : "+ promedio); 
   }
}
