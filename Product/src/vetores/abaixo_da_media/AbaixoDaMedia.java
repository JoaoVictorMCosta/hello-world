package vetores.abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá no vetor? ");
        int n = sc.nextInt();
        double[] reais = new double[n];
        double somaReais = 0;

        for (int i = 0; i < reais.length; i++) {
            System.out.print("Digite um numero: ");
            reais[i] = sc.nextDouble();
            somaReais += reais[i];
        }
        double mediaReais = somaReais / reais.length;

        System.out.printf("%n%nMEDIA DO VETOR = %.3f%n", mediaReais);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < reais.length; i++) {
            if (reais[i] < mediaReais) {
                System.out.println(reais[i]);
            }
        }

        sc.close();
    }
}
