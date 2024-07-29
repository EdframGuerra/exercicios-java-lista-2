
package exercicio027;

import java.util.Arrays;
import java.util.Scanner;

public class Ordem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[3];

        // Leitura dos números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = leitor.nextInt();
        }

        // Ordenação em ordem decrescente
        Arrays.sort(numeros);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        leitor.close();
    }
}
