package ejerciciosvarios;
public class Par_Mayor6 {
    public static void main(String[] args) {
        // Dado un texto indicar cuales son las palabras pares y cual es la palabra par
        // mas grande

        // Colocamos el texto
        String texto = "Hay muchas serpientes en mi bota";
        // Lo convertimos en array y con split separamos las palabras
        String[] text = texto.split(" ");

        System.out.println("Las palabras pares son: ");
        int mayor = 0;// Para obtener el mayor a la hora de iterar
        String parm = "";// Aca va la palabra mas grande

        for (int i = 0; i < text.length; i++) {

            if (text[i].length() % 2 == 0) {// Si es par...

                System.out.println(text[i]);// Se muestra

                if (text[i].length() > mayor) { // Si es el mayor par
                    // Se sobreescribe
                    mayor = text[i].length();
                    parm = text[i];
                }
            }

        }

        System.out.println("La palabra par mas grande es: " + parm);
    }

}
