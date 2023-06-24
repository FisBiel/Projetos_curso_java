import java.util.Scanner;

import entities.Calculos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Calculos calculos = new Calculos();

        System.out.print("Digite o raio: ");
        double raio = sc.nextDouble();

        double circunferencia = calculos.calCircun(raio);
        double volume = calculos.calVolume(raio);

        System.out.printf("\nCircunferencia: %.2f\n",circunferencia);
        System.out.printf("Volume: %.2f\n", volume);
        System.out.printf("PI: %.2f", calculos.pi);

        sc.close();
    }
}
