package correcaoExConta;

public class PJ extends Conta{
    public PJ() {
    }

    public PJ(int numero, int agencia, double saldo, String titular) {
        super(numero, agencia, saldo, titular);
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo()-20);
        System.out.println("houve desconto da tarifa");
        exibirSaldo();
    }
}
