package exercicio046;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class NotaValida {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try{
            System.out.print("Digite uma nota: ");
            Double nota = leitor.nextDouble();

            while (nota>10.0 || nota <0.0){
                System.out.println("Nota invalida!");
                System.out.println();
                System.out.println("Digite uma nota");
                nota = leitor.nextDouble();
            }
            System.out.printf("Nota: %.2f",nota);

            leitor.close();

        }catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida, reinicie o programa.");
        }
    }
}
