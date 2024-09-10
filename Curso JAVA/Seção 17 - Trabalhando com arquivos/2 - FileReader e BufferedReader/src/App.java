import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        String path =  "e:\\Estudos\\AULAS\\Curso Udemy\\JAVA\\Curso JAVA\\Seção 17 - Trabalhando com arquivos\\Exemplo de leitor de arquivos\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
