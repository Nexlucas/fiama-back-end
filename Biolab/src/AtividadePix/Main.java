package AtividadePix;

public class Main {
    public static void main(String[] args) {
       Conta caio = new Pagamentos(35, 2000, "caio");
       Conta bruno = new Pagamentos(67, 4000, "bruno");

       caio.exibirSaldo();
       bruno.exibirSaldo();
        System.out.println();
       caio.pix(300,bruno);
        System.out.println();
       caio.exibirSaldo();
       bruno.exibirSaldo();
       System.out.println();
       bruno.cartaoCredito(123);
        System.out.println();
       bruno.gerarBoleto(caio,1222);




    }
}
