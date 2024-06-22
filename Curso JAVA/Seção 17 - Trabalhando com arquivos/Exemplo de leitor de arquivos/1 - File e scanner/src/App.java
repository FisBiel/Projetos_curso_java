import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("e:\\Estudos\\AULAS\\Curso Udemy\\JAVA\\Curso JAVA\\Seção 17 - Trabalhando com arquivos\\Exemplo de leitor de arquivos\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        finally{
            if(sc != null){
                sc.close();
            }
        }
    }
}
