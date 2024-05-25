package entities;

public class produtoImport extends Produto {

    private Double taxaImport;

    public produtoImport(String nome, Double preco, Double taxaImport) {
        super(nome, preco);
        this.taxaImport = taxaImport;
    }

    public Double getTaxaImport() {
        return taxaImport;
    }

    public void setTaxaImport(Double taxaImport) {
        this.taxaImport = taxaImport;
    }

    public Double precoTotal() {
        return getPreco() + taxaImport;
    }

    @Override
    public String etiquetaPreco() {
        return getNome() + "\nR$" + String.format("%.2f", getPreco()) + "\nCupom: " + String.format("%.2f", taxaImport);
    }

}
