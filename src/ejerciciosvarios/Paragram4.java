package ejerciciosvarios;
public class Paragram4 {
    public static void main(String[] args) {
        // Colocamos el texto
        String texto = "The quick brown fox jumps over the lazy dog";
        // Convertir en array y spliteamos
        String[] arrayt = texto.split("");
        //Ponemos el abecedario
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String[] abc1 = abc.split("");
        //Crear contador
        int contador = 0;
        //Generamos 2 for para comparar los 2 arrays
        for (int i = 0; i < abc1.length; i++) {
            for (int j = 0; j < arrayt.length; j++) {

                /*
                 * Para comparar Strings se usa .EQUALS y para que no importe si tiene o no
                 * Mayuscula se usa .equalsIgnoreCase
                 */
                if (abc1[i].equalsIgnoreCase(arrayt[j])) {
                    //Si es igual cambia el valor del abecedario por 0 y al contador sumamos 1.
                    abc1[i] = "0";
                    contador++;

                }
            }
        }

        //Si la cantidad de caracteres del abecedario es igual al contador
        if (abc1.length == contador) {
            System.out.println("Es un Pangram");
        } else {
            System.out.println("No es un Pangram");
        }

    }

}
