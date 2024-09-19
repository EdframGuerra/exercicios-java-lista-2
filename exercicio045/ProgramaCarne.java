package exercicio045;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaCarne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Bem-vindo ao Hipermercado Tabajara!");
            System.out.println("Promoção de Carnes:");
            System.out.println("Até 5 Kg                        Acima de 5 Kg");
            System.out.println("File Duplo R$ 4,90 por Kg       R$ 5,80 por Kg");
            System.out.println("Alcatra R$ 5,90 por Kg          R$ 6,80 por Kg");
            System.out.println("Picanha R$ 6,90 por Kg          R$ 7,80 por Kg");

            System.out.print("Digite o tipo de carne (File Duplo, Alcatra ou Picanha): ");
            String tipoCarne = leitor.nextLine();
            if (tipoCarne.equalsIgnoreCase("File Duplo") || tipoCarne.equalsIgnoreCase(", Alcatra ") || tipoCarne.equalsIgnoreCase("Picanha")) {
                System.out.println("Tipo de carne inválido!");
                return;
            }
            System.out.print("Digite a quantidade de carne em Kg: ");
            double quantidade = leitor.nextDouble();

            System.out.print("Digite o tipo de pagamento (Cartão Tabajara ou Outros): ");
            String tipoPagamento = leitor.next();

            double precoKg;
            if (quantidade <= 5) {
                if (tipoCarne.equalsIgnoreCase("File Duplo")) {
                    precoKg = 4.90;
                } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
                    precoKg = 5.90;
                } else if (tipoCarne.equalsIgnoreCase("Picanha")) {
                    precoKg = 6.90;
                } else {
                    System.out.println("Tipo de carne inválido!");
                    return;
                }
            } else {
                if (tipoCarne.equalsIgnoreCase("File Duplo")) {
                    precoKg = 5.80;
                } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
                    precoKg = 6.80;
                } else if (tipoCarne.equalsIgnoreCase("Picanha")) {
                    precoKg = 7.80;
                }
                    return;
            }


            double total = precoKg * quantidade;
            double desconto = 0;
            if (tipoPagamento.equalsIgnoreCase("Cartão Tabajara")) {
                desconto = total * 0.05;
            }
            double valorPagar = total - desconto;

            System.out.println("\nCupom Fiscal:");
            System.out.println("Tipo de carne: " + tipoCarne);
            System.out.println("Quantidade de carne: " + quantidade + " Kg");
            System.out.println("Preço total: R$ " + total);
            System.out.println("Tipo de pagamento: " + tipoPagamento);
            System.out.println("Valor do desconto: R$ " + desconto);
            System.out.println("Valor a pagar: R$ " + valorPagar);

            leitor.close();

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrda invalida");
        }
    }
}