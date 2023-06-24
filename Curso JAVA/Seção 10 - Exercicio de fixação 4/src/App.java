import java.util.Scanner;

import entities.Quartos;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos tem no hotel? ");
        Quartos[] quartos = new Quartos[sc.nextInt()];
        sc.nextLine();

        for(int i = 0; i < quartos.length; i++){
            quartos[i] = new Quartos(null, null, true);
        }

        String escolha;
        for(int i = 0; i < quartos.length; i++){     
            System.out.print("\nA novos hospedes? (y,n): ");
            escolha = sc.nextLine();
            if (escolha.equals("y")){ 
                if(i != quartos.length){             
                System.out.print("\nNúmero do quarto: ");
                int numero = sc.nextInt();
                    if(numero >= 0 && numero < quartos.length){
                    while(!quartos[numero].getVago()){                
                        System.out.println("O quarto já está ocupado! ");
                        System.out.print("Número do quarto: ");
                        numero = sc.nextInt();
                    }quartos[numero].setVago(false);
                    sc.nextLine();
                    System.out.print("Nome: ");
                    quartos[numero].setNome(sc.nextLine());
                    System.out.print("Email: ");
                    quartos[numero].setEmail(sc.nextLine());  
                    }else{
                        System.out.print("\nQuarto não existente!!!\n ");
                        i--;
                        sc.nextLine();
                    }
                }else
                    System.out.print("\nLamentamos mas não há mais vagas!!!");
            }else
                i = quartos.length;
        }
        sc.close();

        for(int i = 0; i < quartos.length; i++){
            if(!quartos[i].getVago())
                System.out.println("\nNome:" + quartos[i].getNome() + "\nEmail: " + quartos[i].getEmail() + "\nNúmero do quarto: " + i + "\n");
        }
    }
}



