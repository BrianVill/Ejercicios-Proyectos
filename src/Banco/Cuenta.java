package Banco;

public class Cuenta {
    private static int contadorCuentas = 1000; // Comienza en 1000 para darle un formato
    private String nombreUsuario;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public Cuenta(String nombreUsuario, double saldoInicial) {
        this.nombreUsuario = nombreUsuario;
        this.numeroCuenta = generarNumeroCuenta();
        this.saldo = saldoInicial;
    }

    // Generador de número de cuenta
    private String generarNumeroCuenta() {
        contadorCuentas++;
        return String.valueOf(contadorCuentas); // Convierte el contador a String
    }

    // Métodos getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos para depositar y retirar dinero 
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    // Método para mostrar la información de la cuenta
    public String mostrarInfo() {
        return "Nombre: " + nombreUsuario + ", Número de Cuenta: " + numeroCuenta + ", Saldo: " + saldo;
    }
}

