package exercicio006;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Circulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            double pi = 3.141592653;

            System.out.print("Informe o raio: ");
            double raio = leitor.nextDouble();

            double area = pi * (raio * raio);

            System.out.printf("A area do circulo é %.2f ", area);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Número em formato invalido");
        }

    }

}
