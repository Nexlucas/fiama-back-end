package atividadeentregar;

public class Doce {
    private String nome;
    private String cor;
    private double peso;

    public Doce() {
    }

    public Doce(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void cobertura(){
        System.out.printf(", A Cobertura é de: ");
    }
    public void massa(){
        System.out.printf(", A massa é de: ");
    }

    @Override
    public String toString() {
        return nome+", Cor: " + cor+", Peso: " + peso;
    }
}
