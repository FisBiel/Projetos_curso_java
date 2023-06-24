import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double media, menorIdade = 0, soma = 0;
        int tam ;
        
        
        System.out.print("Quantos pessoas serão digitadas: ");
        tam = sc.nextInt();

        Pessoa[] pessoaVet = new Pessoa[tam];
        int i;

        for (i = 0; i < pessoaVet.length; i++){
            sc.nextLine();
            System.out.println("\t__" + (i + 1) + "º pessoa__ ");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoaVet[i] = new Pessoa(nome, idade, altura);
            soma += pessoaVet[i].getAltura();
            if (pessoaVet[i].getIdade() < 16){
                menorIdade++;
            }
        }
 
        menorIdade /= pessoaVet.length;
        media = soma / pessoaVet.length;
        
        System.out.printf("Pessoas com menos de 16 anos: %.1f %% ", (menorIdade*100));
        System.out.printf("\nAltura média: %.2f metros\n", media);
        for (i = 0; i < pessoaVet.length; i++){
            if (pessoaVet[i].getIdade() < 16){
                System.out.println(pessoaVet[i].getNome());
            }
        }

        sc.close();
    }
}