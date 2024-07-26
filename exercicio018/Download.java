package exercicio018;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Download {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Tamanho do arquivo (MB): ");
            double tamanhoArquivo = leitor.nextInt();
            System.out.println("Velocidade do link(Mbps): ");
            double Velocidade = leitor.nextDouble();
            double Megabits = 8.0;
            Double tempo = (tamanhoArquivo * Megabits) / Velocidade;
            System.out.printf("Tempo de download: %.1f", tempo);
            System.err.println(" segundos");

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada de dados invalido");
        }

    }
}
