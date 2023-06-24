import java.util.Scanner;

import entities.triangle;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        triangle x = new triangle();
        triangle y = new triangle();

        System.out.println(" X - Digite 3 valores: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println(" Y - Digite 3 valores: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        sc.close();

        double resultadox = x.area();
        double resultadoy = y.area();

        System.out.println("area X: " + resultadox);
        System.out.println("area Y: " + resultadoy);

        if(resultadox > resultadoy){
            System.out.println("X é maior");
        }else
            System.out.println("Y é maior");
    }
}
