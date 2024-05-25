package entities;

public class FuncionarioTercerizado extends Funcionario {

    private Double cobrAdicional;

    public FuncionarioTercerizado() {
        super();
    }

    public FuncionarioTercerizado(String nome, Integer horas, Double valorHora, Double cobrAdicional) {
        super(nome, horas, valorHora);
        this.cobrAdicional = cobrAdicional;
    }

    public Double getCobrAdicional() {
        return cobrAdicional;
    }

    public void setCobrAdicional(Double cobrAdicional) {
        this.cobrAdicional = cobrAdicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + cobrAdicional * 1.1;
    }

}