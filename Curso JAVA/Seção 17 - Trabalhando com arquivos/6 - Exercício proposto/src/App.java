import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        List<Produtos> lista = new ArrayList<>();

        System.out.print("Entre com o caminho do arquivo: ");

        File localArquivo = new File(sc.nextLine());

        String destinoArquivo = localArquivo.getParent();
        
        Boolean sucesso = new File(localArquivo + "\\out").mkdir();

        if(sucesso){
            String arquivoAlvo = destinoArquivo + "\\out\\summary.csv";

            try (BufferedReader br = new BufferedReader(new FileReader(localArquivo))){

                String itemCsv = br.readLine();
                while(itemCsv != null){

                    String[] campos = itemCsv.split(",");
                    String nome = campos[0];
                    double preco = Double.parseDouble(campos[1]);
                    int quantidade = Integer.parseInt(campos[3]);

                    lista.add(new Produtos(nome, preco, quantidade));

                    itemCsv = br.readLine();
                }try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoAlvo))) {
                    for(Produtos item : lista){
                        bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
                        bw.newLine();
                    }

                    System.out.println(arquivoAlvo + " Criado!");

                } catch (IOException e) {
                    System.out.println("Erro ao escrever arquivo! ");
                }
                
            } catch (IOException e) {
                System.out.println("Erro ao carregar arquivo! ");
            }
        }else{
            System.out.println("Erro ao criar a pasta!");
        }

    sc.close();
    }
}
