import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> listFunc = new ArrayList<>();

        System.out.print("Qual o numero de funcionarios:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario " + (i + 1));
            sc.nextLine();
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            int horas = sc.nextInt();
            System.out.print("Valor hora: ");

            double valorHora = sc.nextDouble();
            char tercerizado;
            do {
                System.out.print("É tercerizado (y/n):");
                tercerizado = sc.next().charAt(0);
                if (tercerizado == 'y') {
                    System.out.print("Pagamento adicional: ");
                    Double pagAdicional = sc.nextDouble();
                    listFunc.add(new FuncionarioTercerizado(nome, horas, valorHora, pagAdicional));
                } else if (tercerizado == 'n') {
                    listFunc.add(new Funcionario(nome, horas, valorHora));
                } else
                    tercerizado = 'A';
            } while (tercerizado == 'A');
        }
        System.out.println("\nPagamentos:\n");
        for (Funcionario fun : listFunc) {
            System.out.println("Nome: " + fun.getNome() + "R$" + String.format("%.2f", fun.pagamento()));
        }
        sc.close();
    }
}
