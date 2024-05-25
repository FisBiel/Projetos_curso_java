package entities;

import java.time.LocalDate;

public class produtoUsado extends Produto {

    private LocalDate dataFabric;

    public produtoUsado(String nome, Double preco, LocalDate dataFabric) {
        super(nome, preco);
        this.dataFabric = dataFabric;
    }

    public LocalDate getDataFabric() {
        return dataFabric;
    }

    public void setDataFabric(LocalDate dataFabric) {
        this.dataFabric = dataFabric;
    }

    @Override
    public String etiquetaPreco() {
        return getNome() + "(Usado)\nR$" + String.format("%.2f", getPreco()) + "\nData da fabricação: " + dataFabric;
    }
}
