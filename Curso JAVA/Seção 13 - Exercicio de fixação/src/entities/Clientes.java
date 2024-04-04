package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clientes {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String nome;
    private String email;
    private Date dataNascimento;

    public Clientes() {
    }

    public Clientes(String nome, String email, String dataNascimento) throws ParseException {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = sdf.parse(dataNascimento);
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        this.dataNascimento = sdf.parse(dataNascimento);
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " (" + sdf.format(dataNascimento) + ")" + " - " + email;
    }

}
