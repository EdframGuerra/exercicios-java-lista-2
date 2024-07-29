package exercicio24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroMaior2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            int numeroMaior = 0;

            System.out.print("Digite numero1: ");
            int numero1 = leitor.nextInt();

            System.out.print("Digite numero2: ");
            int numero2 = leitor.nextInt();

            System.out.print("Digite numero3: ");
            int numero3 = leitor.nextInt();

            if (numero1 > numeroMaior) {
                numeroMaior = numero1;
            }

            if (numero2 > numeroMaior) {
                numeroMaior = numero2;
            }

            if (numero3 > numeroMaior) {
                numeroMaior = numero3;
            }
            System.out.println("Numero maior" + numeroMaior);

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Rntrada invalida");
        }
    }
}
