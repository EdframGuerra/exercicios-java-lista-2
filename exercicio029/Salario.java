package exercicio029;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Informe o valor do salario: ");
            double salario = leitor.nextDouble();
            double aumento = 0;
            double salarioCorrigido = 0;
            double valor = 0;

            if (salario <= 280.00) {
                aumento = 20.0 / 100;
                salarioCorrigido = salario * aumento + salario;
                valor = salarioCorrigido - salario;

            } else if (salario > 280.00 && salario <= 700.00) {
                aumento = 15.0 / 100;
                salarioCorrigido = salario * aumento + salario;
                valor = salarioCorrigido - salario;

            } else if (salario > 701.00 && salario <= 1500.00) {
                aumento = 10.0 / 100;
                salarioCorrigido = salario * aumento + salario;
                valor = salarioCorrigido - salario;

            } else if (salario > 1501.00) {
                aumento = 5.0 / 100;
                salarioCorrigido = salario * aumento + salario;
                valor = salarioCorrigido - salario;
            }

            System.out.printf("Salario inicial = R$ %.2f%n", salario);
            System.out.printf("Percencual de aumento %.0f", aumento * 100);
            System.out.println("%");
            System.out.printf("Valor do aumento = R$ %.2f%n", valor);
            System.out.printf("Salario após o aumento = R$ %.2f%n", salarioCorrigido);

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
