package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    private String nome;
    private Integer id;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", id=" + id + ", email=" + email + "]";
    }


}