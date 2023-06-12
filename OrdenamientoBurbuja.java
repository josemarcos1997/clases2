public class OrdenamientoBurbuja {
    public static void main (String[]args){
        int[]array ={-2,45,0,11,-9};
        int n =array.length;
        int tmp;
        System.out.println("******Array desordenado******");
        for (int i = 0;i<n; i++){
            System.out.println(array[i]+ "");

        }
        System.out.println("****array ordenados*****");
        for (int i = 0;i<n-1;i++){ /*esto recorre todo el array -bucle para acceder a los elementos del array*/
            for (int j = 0; j<n-i-1; j++){ /*bucle para comparar con los elementos adyasentes*/
                if(array[j]>array[j+1]){/*cambia el> a < para ordenar ordenar de menor a mayor */
                    tmp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= tmp;
                }
            }
        }
    
        System.out.println("***array ordenado***");
        for (int i = 0;i< n;i++){
            System.out.println(array[i]+"");

    }
    
}
}