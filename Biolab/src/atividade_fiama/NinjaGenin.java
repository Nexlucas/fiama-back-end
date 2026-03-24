package atividade_fiama;

public class NinjaGenin extends Ninja {

    private int missoes;
    private String sensei;

    public NinjaGenin() {
    }

    public NinjaGenin(int missoes, String sensei) {
        this.missoes = missoes;
        this.sensei = sensei;
    }

    public NinjaGenin(String nome, int idade, String clan, String elemento, int chakra, int missoes, String sensei) {
        super(nome, idade, clan, elemento, chakra);
        this.missoes = missoes;
        this.sensei = sensei;
    }

    public int getMissoes() {
        return missoes;
    }

    public void setMissoes(int missoes) {
        this.missoes = missoes;
    }

    public String getSensei() {
        return sensei;
    }

    public void setSensei(String sensei) {
        this.sensei = sensei;
    }

    public void aprimorarControleDeChakra(){

    }

    public void participarDoExameChunin(){

    }
}
