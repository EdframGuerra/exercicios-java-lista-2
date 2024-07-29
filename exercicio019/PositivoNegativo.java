package exercicio019;

import java.util.Locale;
import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("digite um numero: ");
            int numero = leitor.nextInt();

            if (numero == 0) {
                System.out.println("O numero digitado é invalido!");
            } else if (numero > 0) {
                System.out.println("Numero positivo!");
            } else {
                System.out.println("Numero negativo!");
            }
            leitor.close();
        } catch (Exception e) {
            System.out.println("Erro: Entrada invalida!");
        }
    }
}
