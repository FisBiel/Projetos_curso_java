import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produtos produtos = new Produtos();

        System.out.println("\t--Entrada do novo produto--");
        System.out.print("Digite o nome: ");
        produtos.setNome(sc.nextLine());
        System.out.print("Digite o preço: ");
        produtos.setPreco(sc.nextDouble());
        System.out.print("Digite a quantidade: ");
        produtos.AddProduto(sc.nextInt());

        //System.out.println("Produto: " + produto); OU
        System.out.println(produtos.getNome() + " $" + String.format("%.2f", produtos.getPreco()) + ", " + produtos.getQuantidade() + " unidades, Total: $"
        + String.format("%.2f", produtos.TotalValorEstoque()));

        System.out.print("Quantos produtos serão adicionados ao estoque: ");
        produtos.AddProduto(sc.nextInt());

        System.out.println("Produto: " + produtos);

        System.out.print("Quantos produtos serão removidos do estoque: ");
        produtos.RemoveProduto(sc.nextInt());

        System.out.println("Produto: " + produtos);
        sc.close();
    }
}