import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\t--Informações dos alunos--");
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextInt();
        System.out.print("Nota 3: ");
        aluno.nota3  = sc.nextInt();

        System.out.println("Média final: " + aluno.totalNota());

        if(aluno.faltaNota() == 0){
            System.out.println("Aprovado, parábens!!!");
        }else{
            System.out.printf("Reprovado, faltaram %.1f para aprovação!!! \n", aluno.faltaNota());
        }
        sc.close();
    }
}
