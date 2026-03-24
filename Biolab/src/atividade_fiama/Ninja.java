package atividade_fiama;

public class Ninja {
    String nome;
    int idade;
    String clan;
    String elemento;
    int chakra;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String clan, String elemento, int chakra) {
        this.nome = nome;
        this.idade = idade;
        this.clan = clan;
        this.elemento = elemento;
        this.chakra = chakra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }

    public void aprenderJutsu(){
        System.out.println("Você aprendeu um jutsu");
    }
    public void meditar(){
        System.out.println("Você está meditando ");
    }
    public void recuperarChakra(){
        System.out.println("Chakra recuperado");
    }

}
