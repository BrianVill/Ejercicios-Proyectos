import java.io.*;

public class escribir_leer_archivo { // Como crear y Leer un Archivo de Texto.

    public static void main(String[] args) {

        try { // Try=Intentar

            // Crear archivo | colocar en los () la ruta y por ultimo el nombre del archivo
            // a crear, en este caso es "primerTexto.txt"
            FileWriter archivo = new FileWriter("C:\\Users\\Brian\\Desktop\\Proyectos\\Java\\primerTexto.txt");

            // Modificar archivo (Escribir)
            archivo.write("Aguante Boca\n");
            archivo.write("Siempre mono nunca sapo\n");
            archivo.close(); // Para que se agregue el texto debemos cerrar si o si.

            // Leer Archivo
            FileReader archivoleer = new FileReader("C:\\Users\\Brian\\Desktop\\Proyectos\\Java\\primerTexto.txt");

            BufferedReader leyendo = new BufferedReader(archivoleer); // Se necesitan crear 2 clases

            // Crear metodo de lectura de 1 linea
            String leer = leyendo.readLine();

            // Crear while para leer todas las lineas que tenga
            while (leer != null) {

                System.out.println(leer);
                leer = leyendo.readLine();

            }

        } catch (IOException e) { // Sino funciona hace esto...

            // TODO Auto-generated catch block

            e.printStackTrace();
        }
    }
}
