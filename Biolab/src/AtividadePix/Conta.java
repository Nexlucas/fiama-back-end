package AtividadePix;

public abstract class Conta {
    public int agencia;
    public double saldo;
    public String titular;
    public double fatura;

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

    public abstract void pix(double valor,Conta alvo);


    public abstract void cartaoCredito(double valor);

    public abstract void gerarBoleto(Conta alvo,double valor);


}
