package ejerciciosvarios;
public class min_menos_max {
    public static void main(String[] args) {
        // De 1 array sacamos el numero max y min, luego los restamos y el resultado lo
        // mostramos
        int[] numeros = { 40, 50, 20, 80, };
        int max, min;
        max = min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {

                max = numeros[i];
            }
            if (numeros[i] < min) {

                min = numeros[i];
            }
        }

        System.out.println(max + " - " + min + " = " + (max - min));
    }

}
