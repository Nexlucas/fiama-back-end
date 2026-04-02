package AtividadePix;

public class Main {
    public static void main(String[] args) {
        Conta teste = new Conta(23,1000,"teste");
        Conta teste1 = new Conta(24,1500,"teste1");

        teste1.pix(100,teste);

        teste1.cartaoCredito(10000);
        teste1.cartaoCredito(50);

    }
}
