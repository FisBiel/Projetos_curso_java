import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int tam;
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros serão digitados: ");
        tam = sc.nextInt();
        if (tam < 10){
            int[] vet = new int[tam];
            int i;

            for (i = 0; i < vet.length; i++){
                System.out.printf("Digite o %dº: ", i + 1);
                vet[i] = sc.nextInt();
            }

            System.out.println("Valores negativos: ");
            for (i = 0; i < vet.length; i++){
                if (vet[i] < 0)
                System.out.println(vet[i]);
                
            }
        }else
            System.out.println("Valor invalido");
        sc.close();
    }
}
