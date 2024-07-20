package exercicio003;

import java.util.Locale;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um numumero: ");
        double numero1 = leitor.nextDouble();
        System.out.print("Digite outro numero: ");
        double numero2 = leitor.nextDouble();

        double soma = numero1 + numero2;

        System.out.printf("A soma dos numeros digitados é %.0f" , soma);

        leitor.close();
    }
}
