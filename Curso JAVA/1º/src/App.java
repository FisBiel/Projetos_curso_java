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
        produto.nome = sc.nextLine();
        System.out.print("Digite o preço: ");
        produto.preco = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        produto.quantidade = sc.nextInt();
        

        System.out.println("Produto: " + produto);

        System.out.print("Quantos produtos serão adicionados ao estoque: ");
        produto.AddProduto(sc.nextInt());

        System.out.println("Produto: " + produto);

        System.out.print("Quantos produtos serão removidos do estoque: ");
        produto.RemoveProduto(sc.nextInt());

        System.out.println("Produto: " + produto);
        sc.close();
    }
}
