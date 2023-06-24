package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double taxa;

    public double SalarioLiquido(){
        return salarioBruto - taxa;
    }

    public void IncrementeSalario(double aumento){
        this.salarioBruto += salarioBruto * (aumento / 100);
    }

    public String toString(){
        return nome + " , $" + String.format("%.2f", SalarioLiquido());
    }
    
}
