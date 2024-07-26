package exercicio019;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class NumeroMaior {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.print("Informe o valor do numero1: ");
            int numero1 = leitor.nextInt();
            System.out.print("Informe o valor do numero2: ");
            int numero2 = leitor.nextInt();

            if (numero2 == numero1) {
                System.out.println("Números iguais!");
            }
            else if(numero1>numero2){
                System.out.println(numero1+"2,  é o maior numero!");
            }else{
                System.out.println(numero2+", é o maior numero!");
            }
            leitor.close();
            ;

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida!");
        }
    }
}
