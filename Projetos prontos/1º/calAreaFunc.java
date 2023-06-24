import java.util.Scanner;

public class calAreaFunc{
    public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3, resultadox, resultadoy;
        Scanner sc = new Scanner(System.in);

        System.out.println(" X - Digite 3 valores: ");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();
        System.out.println(" Y - Digite 3 valores: ");
        y1 = sc.nextDouble();
        y2 = sc.nextDouble();
        y3 = sc.nextDouble();
        sc.close();

        resultadox = area(x1, x2, x3);
        resultadoy = area(y1, y2, y3);

        System.out.println("area X: " + resultadox);
        System.out.println("area Y: " + resultadoy);

        if(resultadox > resultadoy)
            System.out.println("X é maior");
        System.out.println("Y é maior");
    }

    public static double area(double a, double b, double c){
        return (a + b + c) / 2;
    }
}
