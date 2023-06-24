import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int tam, soma = 0;
        double media;
        
        System.out.print("Quantos numeros serão digitados: ");
        tam = sc.nextInt();

        int[] vet = new int[tam];
        int i;

        for (i = 0; i < vet.length; i++){
            System.out.printf("Digite o %dº: ", i + 1);
            vet[i] = sc.nextInt();
        }

        System.out.print("Valores: ");
        for (i = 0; i < vet.length; i++){
            System.out.print(vet[i] + " ");  
            soma += vet[i];
        }

        media = soma / vet.length;
        
        System.out.println("\nSoma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}