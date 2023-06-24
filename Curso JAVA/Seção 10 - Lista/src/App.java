import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Funcionario> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios: ");
        int quantidade = sc.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.println("Funcionario " + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            while(testeId(list, id)){
                System.out.print("ID já em uso, por favor digite outro: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Digite o id de quem deseja aumentar o salario: ");
        int id = sc.nextInt();
        Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcionario != null){
            System.out.print("O aumento será de qauntos %: ");
            funcionario.aumentaSalario(sc.nextDouble());
        }else{
            System.out.print("ID não existente! ");
        }

        System.out.println("\nLista de funcionarios: ");
        for(Funcionario obj : list){
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean testeId(List<Funcionario> list, int id){
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
