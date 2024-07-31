package exercicio032;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Informe a primeira nota: ");
            double nota1 = leitor.nextDouble();

            System.out.print("Informe a segunda nota: ");
            double nota2 = leitor.nextDouble();

            double mediaFinal = (nota1 + nota2) / 2;
            String conceito;
            if(nota1<0.0 || nota1>10.0 | nota2<0.00 || nota2>10.00){
                System.out.println("Invalido");
            }
            else if (mediaFinal >= 9.00 && mediaFinal <= 10.00) {
                conceito = "A";
                System.out.printf("Nota 1: %.2f, nota 2: %.2f, Conceito: %s, Aprovado, média final: %.2f", nota1, nota2,
                        conceito, mediaFinal);
            } else if (mediaFinal >= 7.50 && mediaFinal < 9.00) {
                conceito = "B";
                System.out.printf("Nota 1: %.2f, nota 2: %.2f, Conceito: %s, Aprovado, média final: %.2f", nota1, nota2,
                        conceito, mediaFinal);
            } else if (mediaFinal >= 6.00 && mediaFinal < 7.50) {
                conceito = "C";
                System.out.printf("Nota 1: %.2f, nota 2: %.2f, Conceito: %s, Aprovado, média final: %.2f", nota1, nota2,
                        conceito, mediaFinal);
            } else if (mediaFinal >= 4.00 && mediaFinal < 6.00) {
                conceito = "D";
                System.out.printf("Nota 1: %.2f, nota 2: %.2f, Conceito: %s, Aprovado, média final: %.2f", nota1, nota2,
                        conceito, mediaFinal);
            } else {
                conceito = "E";
                System.out.printf("Nota 1: %.2f, nota 2: %.2f, Conceito: %s, Aprovado, média final: %.2f", nota1, nota2,
                        conceito, mediaFinal);
            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
