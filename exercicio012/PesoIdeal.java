package exercicio012;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.err.print("Informe sua altura: ");
            double altura = leitor.nextDouble();
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal é: %.2F", pesoIdeal);

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("ERRO: Entrada de dados invalido");
        }
    }
}
