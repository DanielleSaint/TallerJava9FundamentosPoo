package TallerJava9FundamentosPoo;

public class CuentaBancaria {
    //? Atributos
    private String nombreTitular;
    private int numeroCuenta;
    private String tipoCuenta;
    private double saldo = 0;

    //? Constructores

    public CuentaBancaria() {}

    public CuentaBancaria(String nombreTitular, int numeroCuenta, String tipoCuenta, double saldo) {
        this.nombreTitular = nombreTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    //? Getters & Setters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    //? Metodos
    public void depositar (double monto){
        if (monto >= 0){
            saldo += monto;
            System.out.println("Dinero $" + monto + " depositado.");
        }else {
            System.out.println("Error al depositar el dinero");
        }
    }
    public void retirar (double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("Dinero $" + monto + " retirado.");
        }else {
            System.out.println("No tiene fondos suficientes");
        }
    }
    public void mostrarDatos(){
        System.out.println("--------- Datos de la cuenta bancaria: ---------");
        System.out.println("Titular de la cuenta: " + nombreTitular);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldo);
    }
}
