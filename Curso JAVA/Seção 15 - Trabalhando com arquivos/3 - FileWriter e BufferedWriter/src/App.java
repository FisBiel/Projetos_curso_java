import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] lines = new String[] { "Good morging", "Good afternoon", "Good night"};

        String path = "e:\\\\Estudos\\\\AULAS\\\\Curso Udemy\\\\JAVA\\\\Curso JAVA\\\\Seção 17 - Trabalhando com arquivos\\\\Exemplo de leitor de arquivos\\\\out.txt";

        //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ Caso nãp queira recriar o arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
            
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
