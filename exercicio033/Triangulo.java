package exercicio033;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite um numero A");
            double numeroA = leitor.nextDouble();
            System.out.println("Digite um numero B");
            double numeroB = leitor.nextDouble();
            System.out.println("Digite um numero C");
            double numeroC = leitor.nextDouble();

            if (numeroA == numeroB && numeroB == numeroC) {
                System.out.println("Triangulo Equilatero");
            } else if (numeroA == numeroB || numeroA == numeroC || numeroB == numeroC) {
                System.out.println("Triangulo Isosceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
