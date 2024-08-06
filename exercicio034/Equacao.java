package exercicio034;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        
        try {
            System.out.print("Digite o valor de a: ");
            double valorA = leitor.nextInt();
            if (valorA == 0) {
                System.out.println("Não é uma equação de 2º grau");
                leitor.close();
                return;
                

            }

            System.out.print("Digite o valor de b: ");
            double valorB = leitor.nextInt();
            System.out.print("Digite o valor de c: ");
            double valorC = leitor.nextInt();

            double delta = (valorB * valorB) - (4 * valorA * valorC);
            double x1 = -(valorB) + Math.sqrt(delta) / 2 * valorA;
            double x2 = -(valorB) - Math.sqrt(delta) / 2 * valorA;
            // ax²+bx+c
            double raiz1 = valorA * x1 + valorB + valorC;
            double raiz2 = valorA * x2 + valorB + valorC;
            // double delta = (B*B)-4*A*C

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais");
            } else if (delta == 0) {
                System.out.printf("A equação possui apenas uma raiz real, Raiz = %.0f", raiz1);
            } else {
                System.out.printf("A equação possui duas raiz reais: Raiz1=  %.0f, Raiz2=  %.0f", raiz1, raiz2);
            }
            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
