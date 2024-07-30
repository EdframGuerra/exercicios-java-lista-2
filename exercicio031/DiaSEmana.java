package exercicio031;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiaSEmana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("QUE DIA É HOJE? ");
            System.out.print("Digite o numero correspondente: ");
            int numero = leitor.nextInt();

            if (numero == 1) {
                System.out.println("DOMINGO");
            } else if (numero == 2) {
                System.out.println("SEGUNDA-FEIRA");
            } else if (numero == 3) {
                System.out.println("TERÇA-FEIRA");
            } else if (numero == 4) {
                System.out.println("QUARTA-FEIRA");
            } else if (numero == 5) {
                System.out.println("QUINTA-FEIRA");
            } else if (numero == 6) {
                System.out.println("SEXTA-FEIRA");
            } else if (numero == 7) {
                System.out.println("SABADO");
            } else {
                System.out.println("INVALIDO");
            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrdada invalido");
        }

    }
}
