package Atividade_personagem;

public class Arqueiro extends Personagem{

    public Arqueiro() {
    }
    public Arqueiro(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }

    public void chuvaDeFlecha(Personagem alvo) {
        int danoChuva = 90;
        System.out.println(this.getNome()+" Usou Chuva de Flecha em "+alvo.getNome());
        alvo.receberDano(danoChuva);
    }

}
