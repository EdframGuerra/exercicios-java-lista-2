package exercicio050;

import java.util.Locale;
import java.util.Scanner;

public class CrescimentoPopulacional2 {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner leitor = new Scanner(System.in);

            double populacaoA = 80000;
            double populacaoB = 200000;

            System.out.print("Informe a taxa de crescimeto da cidade A: ");
            double taxaCrescimentoA = leitor.nextDouble();

            System.out.print("Informe a taxa de crescimeto da cidade b: ");
            double taxaCrescimentoB = leitor.nextDouble();
            int anos = 0;

            while(populacaoA < populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
            System.out.println("População final do país A: " + (int)populacaoA);
            System.out.println("População final do país B: " + (int)populacaoB);

            leitor.close();
        }
    }