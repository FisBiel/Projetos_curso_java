package entities;

public class Produtos {
    
    public String nome;
    public double preco;
    public int quantidade;

    public Produtos(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double TotalValorEstoque(){
        return quantidade * preco;
    }

    public void AddProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoveProduto(int quantidade){
        this.quantidade -= quantidade;
        if (this.quantidade < 0)
            this.quantidade = 0;
    }

    public String toString(){
        return nome + " $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $" + String.format("%.2f", TotalValorEstoque());
    }
}
