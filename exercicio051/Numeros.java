package exercicio051;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try{
            for(int i=1; i<=20;i++){
                System.out.println(i);
            }
            for(int i=1; i<=20;i++){
                System.out.print(i+" ");
            }

            leitor.close();
        }catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida, reinicie o programa.");
        }
    }
}
