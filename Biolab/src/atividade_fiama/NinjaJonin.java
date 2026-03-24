package atividade_fiama;

public class NinjaJonin extends Ninja {
    String missao;
    String rank;
    String especializacao;

    public NinjaJonin() {
    }

    public NinjaJonin(String missao, String rank, String especializacao) {
        this.missao = missao;
        this.rank = rank;
        this.especializacao = especializacao;
    }

    public NinjaJonin(String nome, int idade, String clan, String elemento, int chakra, String missao, String rank, String especializacao) {
        super(nome, idade, clan, elemento, chakra);
        this.missao = missao;
        this.rank = rank;
        this.especializacao = especializacao;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void conduzirEquipe(){

    }
    public void avaliarMissao (){

    }
    public void ensinarNovosJutsus(){

    }
}
