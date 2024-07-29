package exercicio028;

import java.util.Scanner;

public class TurnoEscolar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Em qual turno você estuda (M - matutino / V - Verpertino / N - Noturno): ");
        char turno = leitor.nextLine().charAt(0);

        if (turno == 'M' || turno == 'm') {
            System.out.println("Bom dia");
        } else if (turno == 'V' || turno == 'v') {
            System.out.println("Boa tarde");
        } else if (turno == 'N' || turno == 'n') {
            System.out.println("Bos noite");
        } else {
            System.out.println("Invalido");
        }

        leitor.close();

    }
}
