package ejerciciosvarios;
import java.util.Random;
import java.util.Scanner;

// Clase que representa un auto
class Auto extends Thread {
    private int posicion = 0; // Posición del auto en la pista
    private final int pistaLongitud;
    private final String nombre;
    private static boolean carreraTerminada = false;
    private static Auto[] autos; // Array de autos para sincronizar la impresión
    private static String ganador; // Variable para almacenar el ganador

    public Auto(String nombre, int pistaLongitud) {
        this.nombre = nombre;
        this.pistaLongitud = pistaLongitud;
    }

    public static void setAutos(Auto[] autos) {
        Auto.autos = autos; // Establecer el array de autos
    }

    public void run() {
        Random random = new Random();
        while (!carreraTerminada) {
            // Avanzar de forma aleatoria (entre 1 y 3 posiciones)
            posicion += random.nextInt(3) + 1;

            // Verificar si el auto ha llegado a la meta de forma sincronizada
            verificarMeta();

            // Mostrar el progreso de todos los autos
            imprimirProgresoCarrera();

            // Pausa antes del siguiente movimiento
            try {
                Thread.sleep(500); // 500 milisegundos de pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Método sincronizado para verificar si el auto ha llegado a la meta
    private synchronized void verificarMeta() {
        if (!carreraTerminada && posicion >= pistaLongitud) {
            posicion = pistaLongitud; // Asegurar que no se pase de la meta
            ganador = nombre; // Guardar el nombre del ganador
            carreraTerminada = true; // Marcar la carrera como terminada
        }
    }

    // Método sincronizado para mostrar el progreso de todos los autos
    private synchronized static void imprimirProgresoCarrera() {
        // Limpiar la consola simulando (esto es solo estético, no limpiará la consola realmente)
        System.out.print("\033[H\033[2J"); // Comando ANSI para limpiar la consola (funciona en algunas terminales)
        System.out.flush();

        // Imprimir el progreso de cada auto
        for (Auto auto : autos) {
            StringBuilder pista = new StringBuilder();
            for (int i = 0; i < auto.pistaLongitud; i++) {
                if (i == auto.posicion) {
                    pista.append(auto.nombre.charAt(0)); // Representación del auto
                } else {
                    pista.append("-");
                }
            }
            pista.append("| META");
            System.out.println(auto.nombre + ": " + pista.toString());
        }
        System.out.println(); // Salto de línea entre actualizaciones

        // Si la carrera ha terminado, mostrar el ganador
        if (carreraTerminada) {
            System.out.println("¡" + ganador + " ha llegado a la meta y es el ganador!");
        }
    }
}

public class CarreraAutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de autos para la carrera: ");
        int numAutos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        int pistaLongitud = 50; // Longitud fija de la pista
        System.out.println("La longitud de la pista es: " + pistaLongitud);

        // Crear y arrancar los hilos para cada auto
        Auto[] autos = new Auto[numAutos];
        for (int i = 1; i <= numAutos; i++) {
            System.out.print("Ingrese el nombre del auto " + i + ": ");
            String nombreAuto = scanner.nextLine();
            autos[i - 1] = new Auto(nombreAuto, pistaLongitud);
        }

        // Establecer el array de autos para uso compartido
        Auto.setAutos(autos);

        // Iniciar la carrera
        for (Auto auto : autos) {
            auto.start();
        }
    }
}


