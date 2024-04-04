package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
    private String nome;
    private WorkerLevel level;
    private Double baseSalary;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Worker(String nome, WorkerLevel level, Double baseSalary, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void addcontrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removecontrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double renda(int ano, int mes) {
        double soma = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (ContratoHora c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);

            System.out.println(c_ano);

            System.out.println(c_mes);
            if (c_ano == ano && c_mes == mes) {

                System.out.println("BATATA");
                soma += c.totalValor();
            }
        }
        return soma;
    }
}
