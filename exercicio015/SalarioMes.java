package exercicio015;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SalarioMes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Quantidade de horas trabalhada no mês: ");
            double qtdHora = leitor.nextDouble();
            System.out.print("Valor da hora trabalhada: ");
            double valorHora = leitor.nextDouble();

            Salario salario = new Salario(qtdHora, valorHora);
            double salarioBruto = salario.salarioBruto(qtdHora, valorHora);
            double irpf = salario.irpf(qtdHora, valorHora);
            double inss = salario.inss(qtdHora, valorHora);
            double sindicato = salario.sindicato(qtdHora, valorHora);
            double salarioLiquido = salario.salarioLiquido(qtdHora, valorHora);

            System.out.printf("Salario Bruto: R$ %.2f%n ", salarioBruto);
            System.out.printf("IRPF - Imposto Renda Pessoa Fisica: R$ %.2f%n ", irpf);
            System.out.printf("INSS - Previdencia Social: R$ %.2f%n ", inss);
            System.out.printf("Sindicato: R$ %.2f%n", sindicato);
            System.out.printf("Salario Liquido: R$ %.2f%n", salarioLiquido);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada com dados invalidos!");
        }
    }
}
