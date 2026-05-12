package vetores.somaDeVetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaDeVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double somaTotal = 0;
        double[] reais = new double[n];
        for (int i = 0; i < reais.length; i++) {
            System.out.print("Digite um numero: ");
            reais[i] = sc.nextDouble();
            somaTotal += reais[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < reais.length; i++) {
            System.out.print(reais[i] + " ");
        }
        System.out.printf("%nSOMA = %.2f%n", somaTotal);
        System.out.printf("MEDIA = %.2f%n", (somaTotal / reais.length));

        sc.close();
    }
}
