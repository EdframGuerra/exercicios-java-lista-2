package exercicio044;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PagamentoFrutas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite a quantidade de morangos (em Kg): ");
            double quantidadeMorangos = leitor.nextDouble();

            System.out.print("Digite a quantidade de maçãs (em Kg): ");
            double quantidadeMacas = leitor.nextDouble();

            double precoMorangos = calcularPrecoFruta(quantidadeMorangos, 2.50, 2.20);
            double precoMacas = calcularPrecoFruta(quantidadeMacas, 1.80, 1.50);

            double valorTotal = precoMorangos + precoMacas;
            double valorFinal = aplicarDesconto(valorTotal);

            System.out.println("Valor a ser pago pelo cliente: R$" + valorFinal);

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }

    public static double calcularPrecoFruta(double quantidade, double precoAte5Kg, double precoAcima5Kg) {
        if (quantidade <= 5) {
            return quantidade * precoAte5Kg;
        } else {
            return quantidade * precoAcima5Kg;
        }
    }

    public static double aplicarDesconto(double valorTotal) {
        if (valorTotal > 25 || valorTotal > 8) {
            return valorTotal * 0.9;
        } else {
            return valorTotal;
        }
    }
}
