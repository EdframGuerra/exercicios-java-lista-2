package Exercicio054;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Impar {
    public static void main(String[] args) {
        Scanner leitor =new Scanner(System.in);

        try {
            System.out.println("Imprima apenas numeros impares: ");
            for(int i=0;i<50;i++)
                if(i%2!=0){
                    System.out.println(i);
                }
                System.out.println();

            leitor.close();

        }catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }
    }
}
