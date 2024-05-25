package entities;

public class juridica extends pessoa {

    private int numFunc;

    public juridica(String nome, Double rendaAnul, int numFunc) {
        super(nome, rendaAnul);
        this.numFunc = numFunc;
    }

    public int getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }

    @Override
    public Double imposto() {
        Double renda = getRendaAnul();
        if (numFunc < 10)
            renda *= 0.16;
        else
            renda *= 0.14;
        return renda;
    }

}
