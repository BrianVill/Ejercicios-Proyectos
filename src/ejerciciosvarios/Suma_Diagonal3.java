package ejerciciosvarios;
public class Suma_Diagonal3 {
    public static void main(String[] args) {

        int[] num = { 5, 7, 3 };
        int[] num2 = { 14, 16, 9 };
        int[] num3 = { 18, 8, 19 };

        int suma1 = num[0] + num2[1] + num3[2];
        int suma2 = num[2] + num2[1] + num3[0];

        int resta = suma1 - suma2;

        System.out.println("Los numeros del primer array son: ");
        for (int i : num) {

            System.out.print(i);

        }
        System.out.println();
        System.out.println("Los numeros del segundo array son: ");
        for (int j : num2) {

            System.out.print(j);

        }
        System.out.println();
        System.out.println("Los numeros del tercer array son: ");
        for (int k : num3) {

            System.out.print(k);

        }

        System.out.println();
        System.out.println("La primer suma en diagonal seria: " + num[0] + "+" + num2[1] + "+" + num3[2] + "=" + suma1);
        System.out.println("La primer suma en diagonal seria: " + num[2] + "+" + num2[1] + "+" + num3[0] + "=" + suma2);
        System.out.println("Y su resta seria: " + suma1 + "-" + suma2 + "=" + resta);
    }

}
