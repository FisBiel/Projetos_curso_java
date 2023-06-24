import java.util.Scanner;

import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        int controle = 0; 
        Conta conta;

        System.out.println("\n\tBem-vindo ao banco X\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos criar uma conta para você, digite as informações abaixo: ");
        System.out.print("\nNúmero da conta: "); 
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: "); 
        String nome = sc.nextLine();
        System.out.print("Deseja realizar um deposito inicial? ");
        if((sc.nextLine().toLowerCase()).equals("sim")){
            System.out.print("Valor do deposito: ");
            conta = new Conta(numConta, nome, sc.nextDouble());
            System.out.println();
        }else{
            conta = new Conta(numConta, nome);
        }

        do{
            System.out.print("\n0 - Finalizar ação\n1 - Depositar\n2 - Verificar status\n3 - Realizar saque\n4 - alterar nome\n\nSua escolha: ");
            controle = sc.nextInt();
            System.out.println();
            switch(controle){
                case 1: System.out.print("Valor do deposito: "); 
                        conta.addSaldo(sc.nextDouble());
                    break;
                case 2:  System.out.println(conta.toString()); 
                    break;
                case 3: System.out.print("Valor do saque: "); 
                        conta.saqueSaldo(sc.nextDouble());
                        System.out.printf("Seu saldo agora é de: $%.2f", conta.getSaldo()); 
                    break;
                case 4:  System.out.print("Qual o novo nome: ");
                        sc.nextLine();
                        conta.setNome(sc.nextLine());
                    break;
                default:
                    break;
            }
        }while(controle != 0);

        sc.close();
    }
}
