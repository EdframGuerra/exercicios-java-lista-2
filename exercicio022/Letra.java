package exercicio022;

import java.util.Scanner;

public class Letra {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = leitor.nextLine().charAt(0);

        if (!Character.isLetter(letra)) {
            System.out.println("Entrada inválida, digite uma letra");
        } else if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I'
                || letra == 'o'
                || letra == 'O' || letra == 'u' || letra == 'U') {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

        leitor.close();
    }
}
