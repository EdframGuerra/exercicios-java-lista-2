package exercicio047;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Usuario: ");
        String usuario = leitor.next();
        System.out.println("Senha: ");
        String senha = leitor.next();;

        while (senha.equals(usuario)){
            System.out.println("Senha invalida!");
            System.out.println("Usuario: ");
            usuario = leitor.next();
            System.out.println("Senha: ");
            senha = leitor.next();

        }
        leitor.close();
    }
}
