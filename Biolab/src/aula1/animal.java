package aula1;

public class animal {
    public String nome;
    public String sexo;
    public int idade;

    public animal(String nome, String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "nome: " + nome +
                ", sexo: " + sexo +
                ", idade: " + idade;
    }
}

