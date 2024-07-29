package exercicio026;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class MenorPreco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite o preço do produto1: ");
            double preco1 = leitor.nextDouble();
            System.out.print("Digite o preço do produto1: ");
            double preco2 = leitor.nextDouble();
            System.out.print("Digite o preço do produto1: ");
            double preco3 = leitor.nextDouble();

            double menorPreco = Integer.MAX_VALUE;

            if (preco1 < menorPreco) {
                menorPreco = preco1;
            }
            if (preco2 < menorPreco) {
                menorPreco = preco2;
            }
            if (preco3 < menorPreco) {
                menorPreco = preco3;
            }

            System.out.printf("O menor preço é R$ %.2f", menorPreco);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
