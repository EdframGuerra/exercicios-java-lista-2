package exercicio023;

import java.util.Locale;
import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            double nota1;
            double nota2;
            System.out.print("Informe a primeira nota: ");

            nota1 = leitor.nextDouble();
            System.out.print("Informe a segunda nota: ");
            nota2 = leitor.nextDouble();
            double mediaFinal = (nota1 + nota2) / 2;

            if (nota1 > 10.0 || nota2 > 10 || nota1 < 0.0 || nota2 < 0.0) {
                System.out.println("Erro: Nota maxima 10.0 e nota minima 0.0");

            } else if (mediaFinal == 10) {
                System.out.printf("Media final: %.2f", mediaFinal);
                System.out.println(" - Aprovado com Distinção");
            } else if (mediaFinal >= 7.0) {
                System.out.printf("Media final: %.2f", mediaFinal);
                System.out.println(" - Aprovado");
            } else {
                System.out.printf("Media final: %.2f", mediaFinal);
                System.out.println(" - Reprovado");
            }

            leitor.close();

        } catch (Exception e) {
            System.out.println("Erro: Entrada invalida!");
        }
    }

}
