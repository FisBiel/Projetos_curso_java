import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String caminhoArquivo = sc.nextLine();

        File caminho = new File(caminhoArquivo);

        System.out.println("Nome: " + caminho.getName());
        System.out.println("Pastas: " + caminho.getParent());
        System.out.println("Caminho: " + caminho.getPath());

        sc.close();
    }
}
