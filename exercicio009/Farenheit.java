package exercicio009;

import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Farenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Informe a temperatura Farenheit: ");
            double farenheit = leitor.nextDouble();
    
            double celsius = (5*(farenheit-32)/9);
    
            System.out.printf("%.2f", farenheit);
            System.out.print(" °F = ");
            System.out.printf("%.2f", celsius);
            System.out.println(" °C");
    
            leitor.close();
        } catch (InputMismatchException e) {
           System.out.println("Número em formato invalido");
        }
       
    }
}
