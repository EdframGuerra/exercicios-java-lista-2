package exercicio038;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite o valor do saque: ");
            int valorSaque = leitor.nextInt();
            int saque = valorSaque;

            if (valorSaque < 10 || valorSaque > 600) {
                System.out.println("Valor de saque inválido. O valor mínimo é de 10 reais e o máximo é de 600 reais.");
            } else {
                int notas100 = valorSaque / 100;
                valorSaque %= 100;

                int notas50 = valorSaque / 50;
                valorSaque %= 50;

                int notas10 = valorSaque / 10;
                valorSaque %= 10;

                int notas5 = valorSaque / 5;
                valorSaque %= 5;

                int notas1 = valorSaque;

                System.out.print("Para sacar a quantia de " + saque + " reais, o caixa fornece ");

                if (notas100 > 0) {
                    if (notas100 == 1) {
                        System.out.print(notas100 + " nota de 100, ");
                    } else {
                        System.out.print(notas100 + " notas de 100, ");
                    }

                }
                if (notas50 > 0) {
                    if(notas50==1){
                        System.out.print(notas50 + " nota de 50, ");
                    }else{
                        System.out.print(notas50 + " notas de 50, ");
                    }
                    
                }
                if (notas10 > 0) {
                    if(notas10==1){
                        System.out.print(notas10 + " nota de 10, ");
                    }
                    else{
                        System.out.print(notas10 + " notas de 10, ");
                    }
                    
                }
                if (notas5 > 0) {
                    if(notas5==1){
                        System.out.print(notas5 + " notas de 5, ");
                    }
                    else{
                        System.out.print(notas5 + " notas de 5, ");
                    }
                }
                if (notas1 > 0) {
                    if (notas1 == 1) {
                        System.out.print(notas1 + " nota de 1");
                    } else {
                        System.out.print(notas1 + " notas de 1");
                    }
                }

            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
