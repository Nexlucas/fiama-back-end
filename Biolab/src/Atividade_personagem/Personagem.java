package Atividade_personagem;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem() {
    }

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String mostrarStatus() {
        return  "Nome: " + nome +
                ", Vida: " + vida +
                ", Ataque: " + ataque +
                ", Defesa: " + defesa;
    }
    public void atacar(Personagem alvo){
        System.out.println("O "+ this.nome + " Atacou o " + alvo.nome);
        alvo.receberDano(this.ataque);
    }
    public void receberDano(int dano){
        dano -= this.defesa;
        this.vida -= dano;
        if (vida < 0){this.vida = 0;}
        System.out.println(nome + " Recebeu: " + dano + " De dano" + " agora está com: " + vida + " de vida");

    }

}
