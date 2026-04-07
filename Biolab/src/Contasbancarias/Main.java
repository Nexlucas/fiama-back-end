package Contasbancarias;

public class Main {
    public static void main(String[] args) {
        CC cc = new CC(1996, 23, 1000, "Arthur");
        CP cp = new CP(2007, 33, 2000, "Nicolly");
        PJ pj = new PJ(3243, 21, 3000, "Heitor");

        System.out.println("Conta Corrente");
        cc.depositar(200);
        cc.sacar(150);
        cc.exibirSaldo();
        cc.calcularTarifaMensal();


        System.out.println("=============================");
        System.out.println("Conta Poupança");
        cp.depositar(1000);
        cp.sacar(670);
        cp.exibirSaldo();
        cp.calcularTarifaMensal();

        System.out.println("=============================");
        System.out.println("Pessoa Juridica");
        pj.depositar(500);
        pj.sacar(5000);
        pj.exibirSaldo();
        pj.calcularTarifaMensal();
    }
}
