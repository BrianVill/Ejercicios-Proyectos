package Banco;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del banco
        Banco miBanco = new Banco("Banco Ficticio");

        // Crear algunas cuentas (números de cuenta se generan automáticamente)
        miBanco.agregarCuenta("Juan Perez", 1000.0);
        miBanco.agregarCuenta("Maria Lopez", 2000.0);

        // Mostrar las cuentas antes de la transferencia
        System.out.println("Cuentas antes de la transferencia:");
        miBanco.mostrarCuentas();

        // Realizar una transferencia con mensaje
        miBanco.realizarTransferenciaConMensaje("1001", "1002", 500.0);

        // Mostrar las cuentas después de la transferencia
        System.out.println("\nCuentas después de la transferencia:");
        miBanco.mostrarCuentas();
    }
}


