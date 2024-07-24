package exercicio010;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Informe a temperatura em Celsius: ");
            double celsius = leitor.nextDouble();

            double farenheit = (celsius * 9 / 5) + 32;

            System.out.printf("%.2f", celsius);
            System.out.print(" °C = ");
            System.out.printf("%.2f", farenheit);
            System.out.println(" °F");

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Número em formato invalido");
        }

    }
}
