package atividade.jogo;

public class Jogo extends ADM{
    private String avaliacao;
    private String descricao;

    public Jogo() {
    }

    public Jogo(String avaliacao, String descricao) {
        this.avaliacao = avaliacao;
        this.descricao = descricao;
    }

    public Jogo(String nome, int idade, int id, String avaliacao, String descricao) {
        super(nome, idade, id);
        this.avaliacao = avaliacao;
        this.descricao = descricao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
