import javax.swing.JOptionPane;

public class Fibonacci {
    public static void main(String[] args) {
        // Escribir la serie fibonacci

        int num1 = 0;
        int num2 = 1;
        int aux;
        int cantidad = 0;

        do {

            try {
                cantidad = Integer.parseInt(JOptionPane.showInputDialog("Indique la capacidad del barril.\nMinimo 1"));

            } catch (NumberFormatException e) {
                System.out.println("Dije un numero y mayor que 0.");
            }

        } while (cantidad == 0);

        for (int i = 0; i < cantidad; i++) {

            if (i == 0)
                System.out.print("0/");
            else if (i == 1)
                System.out.print("1/");
            else {
                System.out.print(num1 + num2 + "/");
                aux = num1 + num2;
                num1 = num2;
                num2 = aux;
            }
        }
    }

}
