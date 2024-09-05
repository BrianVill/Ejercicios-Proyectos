package ejerciciosvarios;

import java.util.Scanner;

public class MovimientoMatriz {

    public static void mostrarMatriz(String[][] matriz, int fila, int columna) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == fila && j == columna) {
                    System.out.print("x" + "\t"); // Mostrar "x" en la posición actual
                } else {
                    System.out.print(matriz[i][j] + "\t"); // Mostrar el valor original
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Inicialización de la matriz con valores de 1 a 15 y un espacio vacío en la posición (0,0)
        String[][] matriz = {
            {"0", "1", "2", "3"},
            {"4", "5", "6", "7"},
            {"8", "9", "10", "11"},
            {"12", "13", "14", "15"}
        };

        // Posición inicial del espacio vacío
        int fila = 0;
        int columna = 0;

        Scanner scanner = new Scanner(System.in);
        String comando;

        while (true) {
            try {
                // Mostrar la matriz actual, marcando la posición actual con "x"
                mostrarMatriz(matriz, fila, columna);

                // Pedir comando al usuario
                System.out.println("Ingrese un movimiento (arriba, abajo, izquierda, derecha) o 'terminar' para salir:");
                comando = scanner.nextLine();

                // Convertir la entrada a minúsculas para que la comparación no sea sensible a mayúsculas/minúsculas
                comando = comando.trim().toLowerCase();

                if (comando.equals("terminar")) {
                    break;
                }

                // Variables para guardar la nueva posición
                int nuevaFila = fila;
                int nuevaColumna = columna;

                // Realizar el movimiento según el comando
                if (comando.equals("derecha") && columna < 3) {
                    nuevaColumna++;
                } else if (comando.equals("izquierda") && columna > 0) {
                    nuevaColumna--;
                } else if (comando.equals("abajo") && fila < 3) {
                    nuevaFila++;
                } else if (comando.equals("arriba") && fila > 0) {
                    nuevaFila--;
                } else {
                    System.out.println("Movimiento no válido.");
                    continue; // Saltar a la siguiente iteración del bucle si el movimiento no es válido
                }

                // Mostrar el valor en la nueva posición
                System.out.println("Se movió 1 espacio. Ahora está en la posición con el valor " + matriz[nuevaFila][nuevaColumna]);

                // Actualizar la posición actual
                fila = nuevaFila;
                columna = nuevaColumna;

            } catch (Exception e) {
                System.out.println("Error, Ingrese un valor válido (derecha/izquierda/arriba/abajo) o 'terminar' si desea cerrar el programa.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }

        scanner.close();
    }
}


