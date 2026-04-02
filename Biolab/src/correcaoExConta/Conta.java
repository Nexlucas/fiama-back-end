package correcaoExConta;

public abstract class Conta {
    private int numero;
    private int agencia;
    private double saldo;
    private String titular;

    public Conta(){}

    public Conta(int numero, int agencia, double saldo, String titular) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double depositar(double valor){
        System.out.println(this.titular + " Fez um deposito de: " + valor + "Seu saldo atual é: " + saldo);
        return saldo = saldo + valor;
    }

    public double sacar(double valor){

        if (valor > saldo){
            System.out.println("Seu saldo é insuficiente para completar o saque seu saldo é: " + saldo);
            return valor;
        } else {
            return saldo = saldo - valor;
        }
    }

    public void exibirSaldo(){
        System.out.println("Seu saldo é: " + saldo);
    }

    public abstract void calcularTarifaMensal();
}
