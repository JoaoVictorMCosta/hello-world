package vetores.pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rents = new Rent[10];
        System.out.print("Quantos quartos serão alocados: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i + 1));
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int numeroQuarto = sc.nextInt();
            rents[numeroQuarto] = new Rent(nome, email, numeroQuarto);
            System.out.println();
        }

        System.out.println("Busy rooms:");

        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(rents[i]);
            }
        }

        sc.close();
    }

}
