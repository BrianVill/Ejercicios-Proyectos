package ejerciciosvarios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Barril_con_Agua {
    public static void main(String[] args) { // Generar barril de agua con capacidad aleatoria (DIBUJAR)

        int capacidad = 0, agua;
        final int ANCHO = 6;
        Random rnd = new Random(); // Generar numero aleatorio

        do {
            try {
                capacidad = Integer.parseInt(JOptionPane.showInputDialog("Indique la capacidad del barril.\nMinimo 1"));

            } catch (NumberFormatException e) {
                System.out.println("Dije un numero y mayor que 0.");
            }

        } while (capacidad == 0);

        agua = rnd.nextInt(capacidad + 1); // Para que el numero aleatorio no sea mayor a la capacidad del barril.

        System.out.println("Capacidad = " + capacidad + " Agua = " + agua);

        for (int i = capacidad; i >= 0; i--) {

            for (int j = ANCHO; j > 0; j--) {

                if (i == 0)
                    System.out.print("*");

                else {
                    if (j == ANCHO || j == 1)
                        System.out.print("*");

                    else {
                        if (i <= agua)
                            System.out.print("~");

                        else
                            System.out.print(" ");
                    }
                }

            }
            System.out.println();

        }

        
    }
}
