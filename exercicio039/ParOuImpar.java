package exercicio039;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Digite um numero inteiro: ");
            int numero = leitor.nextInt();
            if(numero%2==0){
                System.out.println("O numero "+ numero + " é par");
            } else{
                System.out.println("O numero "+numero+ " é impar");
            }
            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
