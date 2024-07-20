package exercicio005;

import java.util.Locale;
import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a nota da avaliação I: ");
        double nota1 = leitor.nextDouble();
        System.out.print("Informe a nota da avaliação II: ");
        double nota2 = leitor.nextDouble();
        System.out.print("Informe a nota da avaliação III: ");
        double nota3 = leitor.nextDouble();
        System.out.print("Informe a nota da avaliação VI: ");
        double nota4 = leitor.nextDouble();

        double somaNotas = nota1 + nota2 + nota3 + nota4;
        double media = somaNotas / 4;

       
        System.out.printf("A media das notas é, %.2f ", media);

        leitor.close();
    }
}
