package exercicio040;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            double numero = leitor.nextDouble();

            if (numero == Math.round(numero)) {
                System.out.println("O número é inteiro.");
            } else {
                System.out.println("O número é decimal.");
            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }

    }
}
