package Contasbancarias;

public class CP extends Conta{

    public CP() {
    }

    public CP(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo()-20);
        System.out.println("houve desconto da tarifa");
        exibirSaldo();
    }
}
