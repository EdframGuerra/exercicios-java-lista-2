package exercicio055;

import java.util.Scanner;

public class Intevalo {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero1= leitor.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int numero2= leitor.nextInt();
        if(numero2<numero1){
            for(int i=numero1;i>numero2+1;i-- ){
                int intervalo = i-1;
                System.out.println(intervalo+" ");
            }
        }

       for(int i=numero1;i<numero2;i++){
           System.out.println( i+" ");
       }

       leitor.close();

    }
}
