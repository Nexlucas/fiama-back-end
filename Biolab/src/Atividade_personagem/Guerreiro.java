package Atividade_personagem;

public class Guerreiro extends Personagem{

    public Guerreiro() {
    }

    public Guerreiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void espadada(Personagem alvo) {
        int danobateEstaca = 150;
        System.out.println(this.getNome()+" Deu uma Espadada em "+alvo.getNome());
        alvo.receberDano(danobateEstaca);
    }

}
