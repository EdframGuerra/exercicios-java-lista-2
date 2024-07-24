package exercicio004;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ConversorMedida {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Conversor de metros para centimetros");
            System.out.print("Informe a quantidade de metros: ");
            double metros = leitor.nextDouble();

            double centimetros = metros * 100;

            System.out.print(metros + " metros, corresponde a ");
            System.out.printf("%.2f", centimetros);
            System.out.println(" centimetros");

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Formato invalido");
        }

    }
}
