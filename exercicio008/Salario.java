package exercicio008;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Salario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Quanto você ganha por hora? ");
            double valor = leitor.nextDouble();
            System.out.print("Quantas horas trabalhou? ");
            double qtdHorasTrabalho = leitor.nextDouble();

            double salario = valor * qtdHorasTrabalho;

            System.out.println("Qual seu salario no referido mês? ");
            System.out.printf("Meu salario foi %.2f ", salario);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Númeo em formato invalido");
        }

    }

}
