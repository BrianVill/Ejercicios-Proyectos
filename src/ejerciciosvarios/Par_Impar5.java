package ejerciciosvarios;
import java.util.Scanner;

//Si n es impar o esta entre 6 y 20, imprimir Weird. Sino Imprimir Not Weird
public class Par_Impar5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 1 || (n > 5 && n < 21)) {
            System.out.println("n=" + n + ", Weird");
        } else {
            System.out.println("n=" + n + ", Not Weird");
        }

    }
}
