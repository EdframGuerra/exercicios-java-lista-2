package exercicio007;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class exercicio007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Informe a base do quadrado: ");
            double base = leitor.nextDouble();

            System.out.print("Informe  altura do quadrado: ");
            double altura = leitor.nextDouble();

            double areaQuadrado = base * altura;
            double dobroAreaQuadrado = areaQuadrado * areaQuadrado;

            System.out.printf("o Dobro da Area do quadrado = %.2f", dobroAreaQuadrado);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Numero em formato invalido");
        }

    }
}
