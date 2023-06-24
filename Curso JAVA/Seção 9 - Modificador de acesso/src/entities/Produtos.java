package entities;

public class Produtos {

    String nome;
    private double preco;
    private int quantidade;

    public Produtos(){
    }

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
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

    public double TotalValorEstoque() {
        return quantidade * preco;
    }

    public void AddProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void RemoveProduto(int quantidade) {
        this.quantidade -= quantidade;
        if (this.quantidade < 0)
            this.quantidade = 0;
    }

    public String toString() {
        return nome + " $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $"
                + String.format("%.2f", TotalValorEstoque());
    }
}
