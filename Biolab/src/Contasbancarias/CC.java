package Contasbancarias;

public class CC extends Conta{
    public CC() {
    }

    public CC(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override

    public void calcularTarifaMensal() {
        setSaldo(getSaldo()-12);
        System.out.println("houve desconto da tarifa");
        exibirSaldo();
    }
}
