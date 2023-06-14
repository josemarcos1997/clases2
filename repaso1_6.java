public class repaso1_6 {
    public static void main(String[]args){
        int op;

        System.out.println("ingrese una opcion");
        System.out.println("1: opcion 1");
        System.out.println("2: opcion 2");
        System.out.println("3: opcion 3");
        System.out.println("4: opcion 4");
        op = Integer.parseInt(System.console().readLine());

        while(op < 1|| op >4){
            
            
            System.out.println("opcion incorrecta el numero esta mal");
            op = Integer.parseInt(System.console().readLine());
            System.out.println("ingresaste bien ");

        }
    }
}
