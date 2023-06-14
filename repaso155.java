public class repaso155 {
    public static void main(String [] args){
        int op;
        boolean flag;
        do{
        flag = false;

        System.out.println("ingrese una opcion");
        System.out.println("1: opcion 1");
        System.out.println("2: opcion 2");
        System.out.println("3: opcion 3");
        System.out.println("4: opcion 4");

        op = Integer.parseInt(System.console().readLine());

        switch(op){
            case 1:
                System.out.println("el usuario ingreso la opcion 1");
                break;
            case 2:
                System.out.println("el usuario ingreso la opcion 2");
                break;
            case 3:
                System.out.println("el usuario ingreso la opcion 3");
                break;
            case 4:
                System.out.println("el usuario ingreso la opcion 4");
                break;    
            default:
                System.out.println("el usuario no sabe leer, opcion incorrecta, ingrese nuevamente");
                flag= true;
                

                }
            }while(flag);    
        
    }
}