package ejerciciosvarios;
public class Min_Max_1 {
    public static void main(String[] args) throws Exception {
        // Ponemos los numeros en un array
        int[] numeros = { 10, 20, 30, 40, 50 };

        // hacemos todas las sumas
        int sum1 = numeros[1] + numeros[2] + numeros[3] + numeros[4];
        int sum2 = numeros[0] + numeros[2] + numeros[3] + numeros[4];
        int sum3 = numeros[0] + numeros[1] + numeros[3] + numeros[4];
        int sum4 = numeros[0] + numeros[1] + numeros[2] + numeros[3];

        // ponemos todas las sumas en otro array
        int[] sumas = { sum1, sum2, sum3, sum4 };

        // sacamos el mayor y menor

        int mayor, menor;
        // Convertimos la posicion 0 como base para la comparacion
        mayor = menor = sumas[0];
        // El for para coparar cada uno
        for (int i = 0; i < sumas.length; i++) {
            // Si es el mayor de todos se sobreescribe en mayor
            if (sumas[i] > mayor) {
                mayor = sumas[i];
            }
            // Si es el menor de todos se sobreescribe en menor
            if (sumas[i] < menor) {
                menor = sumas[i];
            }
        }

        System.out.println("LA MAYOR SUMA POSIBLE ES: "+ mayor);
        System.out.println("LA MENOR SUMA POSIBLE ES: "+ menor);
    }
}
