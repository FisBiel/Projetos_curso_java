import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.produtoImport;
import entities.produtoUsado;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Produto> listaProduto = new ArrayList<>();
        char tipo;

        System.out.print("Quantidade de variedades: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto " + (1 + i));
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            System.out.print("Tipo de produto (c/u/i): ");
            tipo = sc.next().charAt(0);
            if (tipo == 'u') {
                System.out.print("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate datafabric = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                listaProduto.add(new produtoUsado(nome, preco, datafabric));
            } else if (tipo == 'i') {
                System.out.print("Taxa de importação: ");
                Double taxa = sc.nextDouble();
                listaProduto.add(new produtoImport(nome, preco, taxa));
            } else
                listaProduto.add(new Produto(nome, preco));
        }
        System.out.println();
        System.out.print("Etiqueta de preco: ");
        for (Produto produto : listaProduto) {
            System.out.print(produto.etiquetaPreco());
        }

        sc.close();
    }
}
