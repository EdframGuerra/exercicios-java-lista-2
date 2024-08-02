package exercicio036;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Informe a data (dd/mm/aaaa): ");
            String dataInformada = leitor.nextLine();
            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            Date data = dataFormatada.parse(dataInformada);

            System.out.println("Data: " + data);

            // Verifying if the date is valid
            if (dataInformada.equals(dataFormatada.format(data))) {
                System.out.println("Data válida");
            } else {
                System.out.println("Data inválida");
            }

        } catch (ParseException e) {
            System.out.println("Data inválida");
        } finally {
            leitor.close();
        }
    }
}