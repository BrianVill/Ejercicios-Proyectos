package ejerciciosvarios;
import java.util.Scanner;

public class tabla {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Entero: ");
        int n = scanner.nextInt();

        System.out.println("La tabla del numero " + n + " es igual a:");

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + "= " + (n * i));

        }

        scanner.close();
    }
}
