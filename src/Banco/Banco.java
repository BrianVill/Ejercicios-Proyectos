package Banco;

import java.util.ArrayList;

public class Banco {
    private String nombreBanco;
    private ArrayList<Cuenta> cuentas;

    // Constructor
    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        this.cuentas = new ArrayList<>();
    }

    // Método para agregar una nueva cuenta
    public void agregarCuenta(String nombreUsuario, double saldoInicial) {
        Cuenta nuevaCuenta = new Cuenta(nombreUsuario, saldoInicial);
        cuentas.add(nuevaCuenta);
    }

    // Método para buscar una cuenta por su número
    public Cuenta buscarCuenta(String numeroCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null; // Retorna null si no encuentra la cuenta
    }

    // Método para realizar una transferencia
    public boolean realizarTransferencia(String numeroCuentaOrigen, String numeroCuentaDestino, double monto) {
        Cuenta cuentaOrigen = buscarCuenta(numeroCuentaOrigen);
        Cuenta cuentaDestino = buscarCuenta(numeroCuentaDestino);

        if (cuentaOrigen != null && cuentaDestino != null && cuentaOrigen.getSaldo() >= monto) {
            cuentaOrigen.retirar(monto);
            cuentaDestino.depositar(monto);
            return true; // Transferencia exitosa
        } else {
            return false; // Fallo en la transferencia
        }
    }

    public void realizarTransferenciaConMensaje(String numeroCuentaOrigen, String numeroCuentaDestino, double monto) {
        if (realizarTransferencia(numeroCuentaOrigen, numeroCuentaDestino, monto)) {
            System.out.println("\nTransferencia realizada con éxito.");
        } else {
            System.out.println("\nError en la transferencia.");
        }
    }
    

    // Método para mostrar todas las cuentas
    public void mostrarCuentas() {
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.mostrarInfo());
        }
    }
}

