package exercicio043;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProgramPagamentoCombustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("informe o tipo de combustivel: ");
            char tipoCombustivel = leitor.next().charAt(0);
            if (tipoCombustivel != 'A' && tipoCombustivel != 'G') {
                System.out.println("Não vendemos esse tipo de combustivel");
                return;
            }
            System.out.print("informe a quantidade de litros: ");
            Double qtdCombustivel = leitor.nextDouble();
            if (qtdCombustivel < 0) {
                System.out.println("Erro de entrada, informe um valor valido");
                return;
            }
            Combustiveis combustiveis = new Combustiveis(tipoCombustivel, qtdCombustivel);
            System.out.println();

            System.out.println("CUPOM FISCAL");
            System.out.println("---------------------------");
            if (tipoCombustivel == 'A') {
                System.out.println("Combustivel: Alcool");
                System.out.printf("Quantidade = %.2f%n", qtdCombustivel);
                if (qtdCombustivel <=20) {
                    System.out.printf("Valor do Desconto por litro:R$ %.2f%n", combustiveis.descontoValorLitro(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor promoção = R$ %.2f%n", combustiveis.valorPromocionalCombustivel(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Total Desconto = R$ %.2f%n", combustiveis.descontoValorTotal(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor a pagar = R$ %.2f%n", combustiveis.valorPagar(tipoCombustivel, qtdCombustivel));
                } else {
                    System.out.printf("Valor do Desconto por litro:R$ %.2f%n", combustiveis.descontoValorLitro(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor promoção = R$ %.2f%n", combustiveis.valorPromocionalCombustivel(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Total Desconto = R$ %.2f%n", combustiveis.descontoValorTotal(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor a pagar = R$ %.2f%n", combustiveis.valorPagar(tipoCombustivel, qtdCombustivel));
                }
            }else if (tipoCombustivel =='G') {
                System.out.println("Combustivel: Gasolina");
                System.out.printf("Quantidade = %.2f%n", qtdCombustivel);
                if (qtdCombustivel <= 20) {
                    System.out.printf("Valor do Desconto por litro:R$ %.2f%n", combustiveis.descontoValorLitro(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor promoção = R$ %.2f%n", combustiveis.valorPromocionalCombustivel(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Total Desconto = R$ %.2f%n", combustiveis.descontoValorTotal(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor a pagar = R$ %.2f%n", combustiveis.valorPagar(tipoCombustivel, qtdCombustivel));
                } else {
                    System.out.printf("Valor do Desconto por litro:R$ %.2f%n", combustiveis.descontoValorLitro(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor promoção = R$ %.2f%n", combustiveis.valorPromocionalCombustivel(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Total Desconto = R$ %.2f%n", combustiveis.descontoValorTotal(tipoCombustivel, qtdCombustivel));
                    System.out.printf("Valor a pagar = R$ %.2f%n", combustiveis.valorPagar(tipoCombustivel, qtdCombustivel));
                }
            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrad invalida");
        }
    }
}