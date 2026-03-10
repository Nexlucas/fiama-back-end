package atividadeentregar;

public class Main {
    public static void main(String[] args) {
        Bolo bolo = new Bolo();
        Torta torta = new Torta();

        bolo.setNome("Bolo de cenoura");
        bolo.setCor("Laranja");
        bolo.setPeso(65);
        System.out.printf(bolo.toString());
        bolo.cobertura();
        bolo.massa();

        System.out.println();

        torta.setNome("Torta de morango");
        torta.setCor("Branco");
        torta.setPeso(30);
        System.out.printf(torta.toString());
        torta.cobertura();
    }
}
