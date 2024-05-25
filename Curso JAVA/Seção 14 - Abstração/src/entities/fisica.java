package entities;

public class fisica extends pessoa {

    private Double planoMedic;

    public fisica(String nome, Double rendaAnul, Double planoMedic) {
        super(nome, rendaAnul);
        this.planoMedic = planoMedic;
    }

    public Double getPlanoMedic() {
        return planoMedic;
    }

    public void setPlanoMedic(Double planoMedic) {
        this.planoMedic = planoMedic;
    }

    @Override
    public Double imposto() {
        Double renda = super.getRendaAnul();
        if (renda < 20000)
            renda *= 0.15;
        else
            renda *= 0.25;
        if (planoMedic > 0)
            renda -= (planoMedic * 0.5);
        return renda;
    }

}
