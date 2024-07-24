package exercicio013;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class DadosPesca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            double limitePeso = 50.0;
            System.out.print("Informe o peso do pescado: ");
            double peso = leitor.nextDouble();
            double pesoExcedente = peso - limitePeso;
            double valorMultaPorKilo = 4.00;
            double multaAPagar = pesoExcedente * valorMultaPorKilo;

            if (pesoExcedente > 0) {
                System.out.printf("Peso acima do limite = %.2f%n", pesoExcedente);
                System.out.printf("Multa a pagar R$ = %.2f", multaAPagar);
                System.err.println(" Reais");
            } else {
                System.err.printf("Peso dos peixes = %.2f%n", peso);
                System.out.print("Peso dentrodo limite permitido, sem pagamento de multas");

            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada com dados invalidos!");
        }
    }
}
