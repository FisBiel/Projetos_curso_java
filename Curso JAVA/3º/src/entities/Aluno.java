package entities;

public class Aluno{

    public String nome;
    public double nota1, nota2, nota3;

    public Double totalNota(){
        return nota1 + nota2 + nota3;
    }

    public double faltaNota(){
        if (totalNota() < 60){
            return 60 - totalNota();
        }else
            return 0;
    }
    
}