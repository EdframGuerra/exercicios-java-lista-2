package exercicio002;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite um numero: ");
            int numero = leitor.nextInt();

            System.out.println("O numero digitado foi: " + numero);
            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("O numero digitado é invalido");
        }
    }
}