import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.fisica;
import entities.juridica;
import entities.pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        List<pessoa> listPessoa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Double total = 0.0;

        System.out.print("Quantas pessoas?");
        int numPessoas = sc.nextInt();

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Pessoa " + (i + 1));
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            Double renda = sc.nextDouble();
            System.out.print("Fisíca ou Juridica? (f/j): ");
            char tipo = sc.next().charAt(0);
            if (tipo == 'f') {
                System.out.print("Gastos medicos: ");
                listPessoa.add(new fisica(nome, renda, sc.nextDouble()));
            } else {
                System.out.print("Quantidades de funcionarios: ");
                listPessoa.add(new juridica(nome, renda, sc.nextInt()));
            }
        }

        System.out.println("TAXA:");
        for (pessoa pessoa : listPessoa) {
            System.out.println("Nome: " + pessoa.getNome() + "\tR$" + String.format("%.2f", pessoa.imposto()));
            total += pessoa.imposto();
        }
        System.out.println(("Taxa total: " + total));
        sc.close();
    }
}
