package Atividade_personagem;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("pato",300,5,15);
        Guerreiro guerreiro = new Guerreiro("Milton",450,20,30);
        Arqueiro arqueiro = new Arqueiro("Javier", 400,10,20);



        mago.podeDiamante(guerreiro);

        guerreiro.espadada(mago);

        mago.atacar(guerreiro);

        guerreiro.atacar(mago);





    }
}
