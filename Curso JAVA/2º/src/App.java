import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario funcionario = new Funcionario();
        System.out.println("\t--Informações do funcionario--");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("salário: $");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: $");
        funcionario.taxa = sc.nextDouble();

        System.out.print("Status atual:");
        System.out.println(funcionario);

        System.out.print("Aumento de: %");
        funcionario.IncrementeSalario(sc.nextDouble());

        System.out.print("Status atual:");
        System.out.println(funcionario);
        sc.close();
    }
}
