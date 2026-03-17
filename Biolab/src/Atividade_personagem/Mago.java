package Atividade_personagem;

public class Mago extends Personagem{

    public Mago() {
    }

    public Mago(String nome, int vida, int ataque, int defesa) {
        super(nome, vida, ataque, defesa);
    }


    public void podeDiamante(Personagem alvo) {
        int danoPo = 60;
        System.out.println(this.getNome()+" Usou Pó de diamante em "+alvo.getNome());
        alvo.receberDano(danoPo);
    }


}
