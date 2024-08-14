package exercicio042;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Investigador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);



        try {
            int sim = 0;

            System.out.println("responda 1-sim / 2-não: ");

            int[] respostas = new int[5];



            System.out.print("Telefonou para vitima? ");
            respostas[0] = leitor.nextInt();
            if(respostas[0]!=1&&respostas[0]!=2){
                System.out.println("Resposta invalida, reinice o programa");
                return;
            }

            System.out.print("Esteve no local do crime? ");
            respostas[1] = leitor.nextInt();
            if(respostas[1]!=1&&respostas[1]!=2) {
                System.out.println("Resposta invalida, reinice o programa");
                return;
            }

            System.out.print("Mora perto da vitima? ");
            respostas[2] = leitor.nextInt();
            if(respostas[2]!=1&&respostas[2]!=2) {
                System.out.println("Resposta invalida, reinice o programa");
                return;
            }

            System.out.print("Devia para vitima? ");
            respostas[3] = leitor.nextInt();
            if(respostas[3]!=1&&respostas[3]!=2) {
                System.out.println("Resposta invalida, reinice o programa");
                return;
            }

            System.out.print("Ja trabalhou com a vitima? ");
            respostas[4] = leitor.nextInt();
            if(respostas[4]!=1&&respostas[4]!=2) {
                System.out.println("Resposta invalida, reinice o programa");
                return;
            }

            for(int item:respostas){
                if(item==1){
                    sim++;
                }
            }

            System.out.println(sim);

            if (sim == 2) {
                System.out.println("Pessoa suspeita");
            } else if (sim >= 3 && sim <= 4) {
                System.out.println("A pessoa é cumplice");
            } else if (sim == 5) {
                System.out.println("Assassino");
            } else {
                System.out.println("Inocente");
            }

            leitor.close();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida");
        }catch (IllegalStateException e){
            System.out.println("Retorne para o inicio");
        }
    }

}
