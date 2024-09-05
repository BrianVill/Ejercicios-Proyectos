package ejerciciosvarios;
public class Elemento_No_Repetido2 {
    public static void main(String[] args) {
        // MOSTRAR EL ELEMENTO QUE NO SE REPITA

        int[] numeros = { 1, 2, 3, 4, 3, 2, 1 };

        for (int i = 0; i < numeros.length; i++) {

            // Otro for para comparar los valores
            for (int j = i + 1; j < numeros.length; j++) {

                // Si los 2 numeros son iguales se ejecuta
                if (numeros[i] == numeros[j]) {
                    // Borrar los numeros repetidos y asignarlo a una nueva variable
                    int borrar = numeros[i] - numeros[j];
                    numeros[i] = borrar;
                    numeros[j] = borrar;
                    // De esta manera si se repiten el valor va a ser 0
                }

            }
            // Ahora si el valor es mayor o menor a 0 entonces nos muestra los valores que
            // no se repiten
            if (numeros[i] > 0 || numeros[i] < 0) {

                System.out.println("El elemento que no se repite es el: " + numeros[i]);

            }

        }

    }

}
