package exercicio24;

import java.util.Locale;
import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.print("Digite o  numero:A ");
            int numeroA = leitor.nextInt();
            System.out.print("Digite o numero B: ");
            int numeroB = leitor.nextInt();
            System.out.print("Digite o numero C: ");
            int numeroC = leitor.nextInt();

            if (numeroA > numeroB && numeroA > numeroC) {
                System.out.println("O numero A é o maior (" + numeroA + ")");
            } else if (numeroB > numeroA && numeroB > numeroC) {
                System.out.println("O numero B é o maior (" + numeroB + ")");
            } else if (numeroC > numeroA && numeroC > numeroB) {
                System.out.println("O numero C é o maior (" + numeroC + ")");
            } else if (numeroA == numeroB && numeroC > numeroA) {
                System.out.println("O numero C é o maior (" + numeroC + ")");
            }else if (numeroA == numeroC && numeroB > numeroA) {
                System.out.println("O numero C é o maior (" + numeroC + ")");
            }else if (numeroB == numeroC && numeroA > numeroB) {
                System.out.println("O numero C é o maior (" + numeroC + ")");
            }else{
                System.out.println("Erro inesperado!");
            }
            

            leitor.close();

        } catch (Exception e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
