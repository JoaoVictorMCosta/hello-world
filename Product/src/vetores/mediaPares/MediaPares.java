package vetores.mediaPares;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vetorInteiros = new int[n];

        int somaPares = 0;
        int numerospares = 0;

        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.print("Digite um numero: ");
            vetorInteiros[i] = sc.nextInt();
            if (vetorInteiros[i] % 2 == 0) {
                somaPares += vetorInteiros[i];
                numerospares++;
            }
        }
        if (somaPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.println("MEDIA DOS PARES = " + (double) (somaPares / numerospares));
        }

        sc.close();
    }
}
