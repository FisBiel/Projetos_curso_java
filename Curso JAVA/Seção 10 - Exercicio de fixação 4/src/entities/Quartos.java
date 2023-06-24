package entities;

public class Quartos {

    private String nome;
    private String email;
    private boolean Vago;

    public Quartos(String nome, String email, boolean Vago) {
        this.nome = nome;
        this.email = email;
        this.Vago = Vago;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getVago() {
        return Vago;
    }

    public void setVago(boolean vago) {
        Vago = vago;
    }
}