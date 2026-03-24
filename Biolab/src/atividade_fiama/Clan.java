package atividade_fiama;

public class Clan {
    String nome;
    String conhecimentoSecreto;

    public Clan() {
    }

    public Clan(String nome, String conhecimentoSecreto) {
        this.nome = nome;
        this.conhecimentoSecreto = conhecimentoSecreto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConhecimentoSecreto() {
        return conhecimentoSecreto;
    }

    public void setConhecimentoSecreto(String conhecimentoSecreto) {
        this.conhecimentoSecreto = conhecimentoSecreto;
    }

    public void ativarKekkeiGenkai(){
        System.out.println("KekkeiGenkai Ativada");
    }
}
