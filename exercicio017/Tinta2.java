package exercicio017;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Tinta2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
            double tamanhoArea = leitor.nextDouble();

            double litrosTinta = tamanhoArea / 6;

            int quantidadeLatas = (int) Math.ceil(litrosTinta / 18);
            double precoLatas = quantidadeLatas * 80.0;

            int quantidadeGaloes = (int) Math.ceil(litrosTinta / 3.6);
            double precoGaloes = quantidadeGaloes * 25.0;

            int quantidadeLatasGaloes = (int) Math.ceil(litrosTinta / 18);
            int quantidadeGaloesRestantes = (int) Math.ceil((litrosTinta % 18) / 3.6);
            double precoLatasGaloes = quantidadeLatasGaloes * 80.0 + quantidadeGaloesRestantes * 25.0;

            System.out.println("Quantidade de latas de tinta a serem compradas: " + quantidadeLatas);
            System.out.println("Preço total das latas: R$ " + precoLatas);

            System.out.println("SITUAÇÃO 1 - Quantidade de galões de tinta a serem comprados: " + quantidadeGaloes);
            System.out.println("Preço total dos galões: R$ " + precoGaloes);

            System.out.println("SITUAÇÃO 2 - Quantidade de latas e galões de tinta a serem comprados: " + quantidadeLatasGaloes
                    + " latas e " + quantidadeGaloesRestantes + " galões");
            System.out.println("SITUAÇÃO 3 - Preço total das latas e galões: R$ " + precoLatasGaloes);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalda");
        }
    }
}
