package exercicio037;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        try{
            System.out.print("informe um numero: ");
            int numero = leitor.nextInt();

            if(numero <0 || numero >1000){
                System.out.println("Numero invalido");
            }

            String numeros = Integer.toString(numero);
            char [] numeroArray = numeros.toCharArray();

            System.out.println(numero+ " = "+numeroArray[0]+" centenas, "+numeroArray[1]+" dezenas,"+ numeroArray[2]+" unidades");

            leitor.close();
        }catch (InputMismatchException e){
            System.out.println("Erro: Entrada invalida!");
        }
    }
}
