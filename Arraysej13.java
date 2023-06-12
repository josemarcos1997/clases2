
    //un programa que ingrese tres notas de un alumno e imprima su promedio, 
    //usar vectores
    public class Arraysej13 {
        public static void main(String[]args){
            int vector[]= new int[3];
            float acumulado=0;

            for (int i = 0; i<3;i ++){
                System.out.println("ingrese la nota numero " + (i+1));
                vector[i] = Integer.parseInt(System.console().readLine());
            }

            for (int i = 0; i < 3; i++){
                acumulado = vector[i] + acumulado;
            }    
            System.out.print("el promedio de nota es: "+ acumulado/vector.length);
        }
    }