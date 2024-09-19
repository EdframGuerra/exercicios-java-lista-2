package exercicio052;

import java.util.Scanner;

public class MaiorNUmero {

    public  static  void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int maior=0;
        for(int i=0; i<5;i++){
            System.out.println("Digite um numero: ");
            int numero = leitor.nextInt();
            if(numero>maior){
                maior=numero;
            }
        }
        System.out.println("Maior numero digito foi: "+maior);

        leitor.close();
    }
}
