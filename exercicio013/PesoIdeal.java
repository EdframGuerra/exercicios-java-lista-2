package exercicio013;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Imforme sua altura: ");
            double altura = leitor.nextDouble();
            System.out.print("Informe o sexo (M/F): ");
            char character = leitor.next().charAt(0);

            if (character == 'M') {
                double pesoIdeal = (72.7 * altura) - 58;
                System.out.printf("Peso Ideal é %.2f: ", pesoIdeal);
            }
            if (character == 'F') {
                double pesoIdeal = (62.1 * altura) - 44.7;
                System.out.printf("Peso Ideal é %.2f: ", pesoIdeal);
            }

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada de dados invalida!");
        }

    }
}
