import java.util.Random;
import java.util.Scanner;

public class MatricesClases{

    public static void main(String[]args){
        int[][]matrizNull= new int[3][3];
       /*  Scanner s= new Scanner(System.in);*/

        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                /*matrizNull[i][j]=Integer.parseInt(System.console().readLine());
                matrizNull[i][j]= s.nextInt();*/
                matrizNull[i][j]= (int)(Math.random()*10);
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print("" + matrizNull [i][j]+ "");
            }
        System.out.println();
        }
    }
}
