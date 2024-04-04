import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Worker;
import entities.enums.WorkerLevel;

public class App {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("___Dados do trabalhador___");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel: ");
        String nivelTrabalhador = sc.nextLine();
        System.out.print("Base salarial: ");
        Double salarioBase = sc.nextDouble();
        Worker worker = new Worker(nomeTrabalhador, WorkerLevel.valueOf(nivelTrabalhador), salarioBase,
                new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Entre com os dados do contrado " + i);
            System.out.print("Data (DD/MM/YYYY): ");
            String data = sc.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataContrato = sdf.parse(data);
            System.out.print("Valor por hora: ");
            Double valorHora = sc.nextDouble();
            System.out.print("Duração (HORAS): ");
            int horas = sc.nextInt();
            ContratoHora contrato = new ContratoHora(dataContrato, valorHora, horas);
            worker.addcontrato(contrato);
        }
        sc.nextLine();

        System.out.print("Entre com o mês e ano atual (MM/YYYY) para calcular o salario: ");
        String mesAno = sc.nextLine();
        int mes = Integer.parseInt(mesAno.substring(0, 2));
        int ano = Integer.parseInt(mesAno.substring(3, 7));
        System.out.println("Nome: " + worker.getNome());
        System.out.println("Departamento: " + worker.getDepartamento().getNome());
        System.out.println("Salario do periodo: " + mesAno + ": " + String.format("%.2f", worker.renda(ano, mes)));

        sc.close();
    }
}
