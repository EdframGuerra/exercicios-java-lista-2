package exercicio011;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class numeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            int numeroI;
            int numeroII;
            double numeroReal;

            System.out.print("Informe um numero inteiro: ");
            numeroI = leitor.nextInt();
            System.out.print("Informe um numero inteiro: ");
            numeroII = leitor.nextInt();

            System.out.print("Informe um numero real: ");
            numeroReal = leitor.nextDouble();

            double resultado = (numeroI * 2) + (numeroII / 2)
                    + (numeroI * 3 + numeroReal + (numeroReal * numeroReal * numeroReal));

            System.out.printf("O resultado é %.2f", resultado);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Número em formato invalido");
        }

    }

}
