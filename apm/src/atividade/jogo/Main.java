package atividade.jogo;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Doador doador = new Doador();

        jogo.setNome("god of war");
        jogo.setAvaliacao("10/10");
        jogo.setDescricao("Luta");

        doador.setNickname("sabao");
        doador.setNome("Carlos");
        System.out.println(doador.getNome());
        System.out.println(doador.getNickname());

    }

}
