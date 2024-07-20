package exercicio002;

import java.util.Locale;
import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leitor.nextInt();

        System.out.println("O numero digitado foi: " + numero);
        leitor.close();
    }
}
