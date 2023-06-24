package entities;

public class Conta {
    
    private int numConta;
    private String nome;
    private double saldo;

    @Override
    public String toString() {
        return "Numero da conta: " + numConta + "\nNome: " + nome + "\nSaldo: $" + String.format("%.2f", saldo) + "\n";
    }

    public Conta(int numConta, String nome, double saldo) {
        this.numConta = numConta;
        this.nome = nome;
        addSaldo(saldo);
    }

    public Conta(int numConta, String nome){
        this.numConta = numConta;
        this.nome = nome;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void saqueSaldo(double saldo) {
        this.saldo -= saldo + 5;
    }
}
