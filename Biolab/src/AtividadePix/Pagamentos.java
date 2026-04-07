package AtividadePix;

public class Pagamentos extends Conta{
    public Pagamentos() {
    }

    public Pagamentos(int agencia, double saldo, String titular) {
        super(agencia, saldo, titular);
    }

    @Override
    public void pix(double valor,Conta alvo) {
        System.out.println("Pix realizado de " + this.titular + " para " + alvo.titular + " No Valor de: " + valor);
        alvo.depositar(valor);
        this.sacar(valor);
    }

    @Override
    public void cartaoCredito(double valor) {
        this.fatura += valor;
        System.out.println(valor + "R$ foi adicionado a sua fatura valor da fatura atual: " + fatura);
    }

    @Override
    public void gerarBoleto(Conta alvo,double valor) {
        System.out.println(this.titular + " Gerou um boleto para o " + alvo.titular + " no valor de: " + valor + "R$");
    }
}
