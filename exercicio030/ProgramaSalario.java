package exercicio030;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("========== DEMONSTRATIVO DE SALARIO ==========");
            System.out.println();
            System.out.print("Informe a quantidade de horas trabalhada no mês: ");
            double hora = leitor.nextDouble();
            System.out.print("Informe o valor da hora trabalhada no mês: ");
            double valorHora = leitor.nextDouble();

            Salario salario = new Salario(hora, valorHora);
            double inss = (salario.inss(hora, valorHora) / salario.salarioBruto(hora, valorHora)) * 100;
            double irpf = (salario.irpf(hora, valorHora) / salario.salarioBruto(hora, valorHora)) * 100;

            System.out.printf("Salario bruto (%.0f", salario.getHora());
            System.out.printf(" * %.0f", salario.getValorHora());
            System.out.printf(") : .........R$ %.2f%n ", salario.salarioBruto(hora, valorHora));
            System.out.printf("(-) IR (%.0f", irpf);
            System.out.printf("): ......R$ %.2f%n ", salario.irpf(hora, valorHora));
            System.out.printf("(-) INSS (%.0f", inss);
            System.out.printf(") : .........R$ %.2f%n", salario.inss(hora, valorHora));
            System.out.print("FGTS (11%): .............R$");
            System.out.printf("%.2f%n ", salario.fgts(hora, valorHora));
            System.out.print("Total de Descontos: ........R$ ");
            System.out.printf("%.2f%n", salario.totalDescontos(hora, valorHora));
            System.out.print("Salario liquido: ..........R$ ");
            System.out.printf("%.2f%n", salario.salarioLiquido(hora, valorHora));

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
