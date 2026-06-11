public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double valorEstoque;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade, double valorEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valorEstoque = valorEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorEstoque() {
        return valorEstoque;
    }

    public void setValorEstoque(double valorEstoque) {
        this.valorEstoque = valorEstoque;
    }

    @Override
    public String toString() {
        return "nome do produto: " + nome + ", Preco: R$" + preco + ", Quantidade: " + quantidade + ", Valor no Estoque: R$" + valorEstoque;

    }
}
