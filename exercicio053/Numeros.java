package exercicio053;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try{
            int media=0;
            int soma=0;
            int[]numeros = new int[5];

            for(int i=0;i<5;i++){
                System.out.print("Digite um numero: ");
                int numero = leitor.nextInt();

                numeros[i]=numero;
                soma+=numero;
                media=soma/numeros.length;
            }
            System.out.println("Soma = " + soma +" média = "+ media);

            leitor.close();

        }catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
