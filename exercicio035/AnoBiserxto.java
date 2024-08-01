package exercicio035;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnoBiserxto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Informe o ano: ");
            int ano = leitor.nextInt();
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                System.out.println("Ano bissexto");
            } else {
                System.out.println("Ano não bissexto");
            }

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
