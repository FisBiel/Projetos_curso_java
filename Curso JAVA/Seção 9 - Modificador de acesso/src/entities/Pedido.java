package entities;

import java.util.Date;

public class Pedido {
    
    private Date data;
    private Produtos produtos;

    public Pedido(Date data, Produtos produtos) {
        this.data = data;
        this.produtos = produtos;
        this.produtos.nome = "TV";
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public Produtos getProdutos() {
        return produtos;
    }
    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }
}
