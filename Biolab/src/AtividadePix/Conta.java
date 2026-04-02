package AtividadePix;

public class Conta {
    private int agencia;
    private double saldo;
    private String titular;
    private double fatura;

    public Conta() {
    }

    public Conta(int agencia, double saldo, String titular) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
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

    public void pix(double valor,Conta alvo){
        System.out.println("Pix realizado de " + this.titular + " para " + alvo.titular + " No Valor de: " + valor);
        alvo.depositar(valor);
        this.sacar(valor);
    }

    public void cartaoCredito(double valor){
        this.fatura += valor;
        System.out.println(valor + "R$ foi adicionado a sua fatura valor da fatura atual: " + fatura);
    }
    public void cartaoDebito(double valor){
        sacar(valor);
    }


}
