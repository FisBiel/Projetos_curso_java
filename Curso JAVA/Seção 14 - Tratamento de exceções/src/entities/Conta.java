package entities;

import exceptions.BusinessException;

public class Conta {

    private Integer numero;
    private String suporte;
    private Double saldo;
    private Double limite;

    public Conta() {
    }

    public Conta(Integer numero, String suporte, Double saldo, Double limite) {
        this.numero = numero;
        this.suporte = suporte;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSuporte() {
        return suporte;
    }

    public void setSuporte(String suporte) {
        this.suporte = suporte;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void saque(Double valor) {
        limiteSaque(valor);
        saldo -= valor;
    }

    public void limiteSaque(Double valor) {
        if (valor > getLimite()) {
            throw new BusinessException("Erro de saque: A quantia exede o limite de saque");
        }
        if (valor > getSaldo()) {
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }

}
