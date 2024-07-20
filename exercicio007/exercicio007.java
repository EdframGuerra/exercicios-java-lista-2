package exercicio007;

import java.util.Locale;
import java.util.Scanner;

public class exercicio007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a base do quadrado: ");
        double base = leitor.nextDouble();

        System.out.print("Informe  altura do quadrado: ");
        double altura = leitor.nextDouble();

        double areaQuadrado = base*altura;

        System.out.printf("Area quadrado = %.2f",areaQuadrado);

        leitor.close();
    }
}
