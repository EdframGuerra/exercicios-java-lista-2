package exercicio021;

import java.util.Scanner;

public class Genero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o sexo (M/F)");
        char sexo = leitor.nextLine().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Masculino");
        }
        if (sexo == 'F' || sexo == 'f') {
            System.out.println("Feminino");
        } else {
            System.out.println("sexo invalido");
        }
        leitor.close();

    }
}
