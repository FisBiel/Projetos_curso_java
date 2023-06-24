package entities;

public class Produtos {
    
    public String nome;
    public double preco;
    public int quantidade;

    public double TotalValorEstoque(){
        return quantidade * preco;
    }

    public void AddProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void RemoveProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + " $" + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $" + String.format("%.2f", TotalValorEstoque());
    }
}
