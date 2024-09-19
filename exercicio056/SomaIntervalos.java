package exercicio056;
import java.util.Scanner;

public class SomaIntervalos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int somaIntervalos = 0; // Corrigido o nome da variável

        System.out.print("Digite um número inteiro: ");
        int numero1 = leitor.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int numero2 = leitor.nextInt();

        // Verifica se o segundo número é menor que o primeiro
        if (numero2 < numero1) {
            for (int i = numero1 - 1; i > numero2; i--) { // Corrigido o loop para evitar incluir os números limites
                somaIntervalos += i;
                System.out.print(i + " ");
            }
        } else {
            for (int i = numero1 + 1; i < numero2; i++) { // Corrigido para evitar incluir os números limites
                somaIntervalos += i;
                System.out.print(i + " ");
            }
        }

        System.out.println("\nA soma dos intervalos é: " + somaIntervalos);
        leitor.close();
    }
}
