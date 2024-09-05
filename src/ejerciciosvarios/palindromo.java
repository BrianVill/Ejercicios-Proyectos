package ejerciciosvarios;
import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        // Indicar si la palabra es palindromo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a identificar: ");
        String texto = scanner.nextLine();

        System.out.println(esPalindromo(texto));
        scanner.close();
    }

   public static boolean esPalindromo(String texto){
    boolean sw=true;

    texto=texto.replace(" ", "");

    for (int i = 0; i < texto.length()/2; i++) {
        if (texto.charAt(i) != texto.charAt(texto.length()-1-i)) {

            sw=false;
            break;
        }
    }

    return sw;
   }

}
