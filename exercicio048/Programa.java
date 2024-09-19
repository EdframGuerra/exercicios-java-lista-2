package exercicio048;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args)    {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);


try{

    System.out.print("Digite o nome do Usuario: ");
    String name = leitor.nextLine();
    if(name == null || name.trim().length() < 3){
        System.out.println("Nome invalido");
        return;
    }


    System.out.print("Digite a idade do Usuario: ");
    int idade = leitor.nextInt();
    if(idade<0 || idade>150){
        System.out.println("idade ivalida");
        return;
    }

    System.out.print("Digite o salario do Usuario: ");
    double salario = leitor.nextDouble();
    if(salario<0.0){
        System.out.println("Salario invalido");
        return;
    }

    System.out.print("Digite o sexo do Usuario: ");
    char sexo = leitor.next().charAt(0);
    if(sexo !='m'&& sexo!='f'){
        System.out.println("sexo invalido");
        return;
    }

    System.out.print("Digite o estado civil: ");
    char estadoCivil = leitor.next().charAt(0);
    if(estadoCivil!='s'&& estadoCivil!='c'&& estadoCivil!='v'&& estadoCivil!='d'){
        System.out.print("estado civil invalido: ");
    }

    Pessoa pessoa = new Pessoa(name,idade, salario,sexo,estadoCivil);

    System.out.printf("Nome: %s, Idade: %d, Salário: %.2f, Sexo: %s, Estado Civil: %s", name, idade, salario, sexo, estadoCivil);

    leitor.close();
}catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida, reinicie o programa.");
        }

    }
}
