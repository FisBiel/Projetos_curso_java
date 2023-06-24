import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produtos produto = new Produtos();

        System.out.println("\t--Entrada do novo produto--");
        System.out.print("Digite o nome: ");
        produto.setNome(sc.nextLine());
        System.out.print("Digite o preço: ");
        produto.setPreco(sc.nextDouble());
        System.out.print("Digite a quantidade: ");
        produto.AddProduto(sc.nextInt());

        //System.out.println("Produto: " + produto); OU
        System.out.println(produto.getNome() + " $" + String.format("%.2f", produto.getPreco()) + ", " + produto.getQuantidade() + " unidades, Total: $"
        + String.format("%.2f", produto.TotalValorEstoque()));

        System.out.print("Quantos produtos serão adicionados ao estoque: ");
        produto.AddProduto(sc.nextInt());

        System.out.println("Produto: " + produto);

        System.out.print("Quantos produtos serão removidos do estoque: ");
        produto.RemoveProduto(sc.nextInt());

        System.out.println("Produto: " + produto);
        sc.close();
    }
}
