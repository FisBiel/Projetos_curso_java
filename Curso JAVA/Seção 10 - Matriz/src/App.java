import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dimenção da matriz: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int cont = 0;

        System.out.print("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
                if (mat[i][j] < 0) {
                    cont++;
                }
            }
        }
        System.out.println("\nNúmeros negativos: " + cont);

        sc.close();
    }
}
