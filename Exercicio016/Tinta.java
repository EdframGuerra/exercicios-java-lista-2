package Exercicio016;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Tinta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanhoArea = leitor.nextDouble();

        double litrosTinta = tamanhoArea / 3;
        int latasTinta = (int) Math.ceil(litrosTinta / 18);
        double precoTotal = latasTinta * 80.0;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasTinta);
        System.out.println("Preço total: R$ " + precoTotal);
           

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println();
        }
    }
}
