package entities;

public abstract class pessoa {
    private String nome;
    private Double rendaAnul;

    public pessoa() {
    }

    public pessoa(String nome, Double rendaAnul) {
        this.nome = nome;
        this.rendaAnul = rendaAnul;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnul() {
        return rendaAnul;
    }

    public void setRendaAnul(Double rendaAnul) {
        this.rendaAnul = rendaAnul;
    }

    public abstract Double imposto();

}
