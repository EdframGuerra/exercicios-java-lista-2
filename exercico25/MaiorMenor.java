package exercico25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            int maior = 0;
            int menor = Integer.MAX_VALUE;
            System.err.print("Digitte o numero 1: ");
            int numero1 = leitor.nextInt();
            System.err.print("Digitte o numero 2: ");
            int numero2 = leitor.nextInt();
            System.err.print("Digitte o numero 3: ");
            int numero3 = leitor.nextInt();

            if (numero1 > maior) {
                maior = numero1;
                
            }
            if (numero2 > maior) {
                maior = numero2;
                
            }
            if (numero3 > maior) {
                maior = numero3;
               
            }
            if (numero1 < menor) {
                menor = numero1;
                
            }
            if (numero2 < menor) {
                menor = numero2;
                
            }
            if (numero3 < menor) {
                menor = numero3;
                
            }
            System.out.println("Numero maior " + maior);
            System.out.println("Numero menor " + menor);

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
