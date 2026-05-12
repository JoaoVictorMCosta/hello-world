package vetores.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            sc.nextLine();
        }
        double somaAlturas = 0;
        int menores = 0;
        for (int i = 0; i < alturas.length; i++) {
            somaAlturas += alturas[i];
            if (idades[i] < 16) {
                menores++;
            }
        }

        System.out.println();
        System.out.printf("Altura média: %.2f%n", (somaAlturas / n));
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (double) ((menores * 100) / n));

        for (int i = 0; i < alturas.length; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
