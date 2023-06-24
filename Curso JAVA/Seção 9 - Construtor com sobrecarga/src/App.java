import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produtos produto;

        System.out.println("\t--Entrada do novo produto--");
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        produto = new Produtos(nome, preco); 

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
