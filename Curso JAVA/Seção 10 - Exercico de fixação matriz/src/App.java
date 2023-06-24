import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de linhas: ");
        int n = sc.nextInt();
        System.out.print("Digite o numero de colunas: ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("(%d, %d) = ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Numero a ser procurado: ");
        int x = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.printf("Posição: (%d, %d)\n", i, j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
