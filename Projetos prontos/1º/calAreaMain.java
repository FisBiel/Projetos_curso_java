import java.util.Scanner;

public class calAreaMain {
    public static void main(String[] args) throws Exception {
        double a, b, c, x, y, z, resultadox, resultadoy;
        Scanner sc = new Scanner(System.in);

        System.out.println(" X - Digite 3 valores: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(" Y - Digite 3 valores: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        sc.close();

        resultadox = (a + b + c) / 2;
        resultadoy = (x + y + z) / 2;

        System.out.println("area X: " + resultadox);
        System.out.println("area Y: " + resultadoy);

        if(resultadox > resultadoy)
            System.out.println("X é maior");
        System.out.println("Y é maior");
    }
}
