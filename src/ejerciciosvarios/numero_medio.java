package ejerciciosvarios;
public class numero_medio {
    public static void main(String[] args) {
        //1_Segun una lista de numeros indicar el valor que se encuentre en el medio
        int[] lista={1,2,3,4,5,6,7,8,9,10,11};

        double div= lista.length/2;
        double num=0;
        int med=0;

        if (div % 2 == 0) {
            System.out.println("Lo siento, no existe un numero que se encuentre en el medio");
        }else{
            num = div + 0.5;
            med= (int)num; //Convertir decimal en un entero.
            
            System.out.println("El numero que se encuentra en el medio es: ");
            System.out.println(lista[med]);
        }
        
    }

    

}
