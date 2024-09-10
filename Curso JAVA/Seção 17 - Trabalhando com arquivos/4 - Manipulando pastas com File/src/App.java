import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o caminho: ");
        String pegaCaminho = sc.nextLine();

        File caminho = new File(pegaCaminho);

        File[] pastas = caminho.listFiles(File::isDirectory);
        
        System.out.println("Pastas");
        for(File pasta : pastas){
            System.out.println(pasta);
        }

        File[] arquivos = caminho.listFiles(File::isFile);

        System.out.println("\n");
        System.out.println("Arquivos");
        System.out.println("Pastas");
        for(File arquivo : arquivos){
            System.out.println(arquivo);
        }

        boolean sucesso = new File(pegaCaminho + "\\subpasta").mkdir();
        System.out.println("Diretorio criado com sucesso: " + sucesso);

        sc.close();
    }
}
