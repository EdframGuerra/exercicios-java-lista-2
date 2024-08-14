package exercicio041;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
        double numero1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = leitor.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

            System.out.println("Qual a operação: ");
        int operacao = leitor.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        if (resultado % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é ímpar");
        }

        if (resultado >= 0) {
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }

        if (resultado == (int) resultado) {
            System.out.println("O número é inteiro");
        } else {
            System.out.println("O número é decimal");
        }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}