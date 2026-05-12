package vetores.dados_pessoas;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        double menorAltura = 100;
        double maiorAltura = 0;
        double somaDasAlturasDasMulheres = 0;
        double mediaAlturasDasMulheres;
        int numeroDeMulheres = 0;
        int numeroDeHomens = 0;

        for (int i = 0; i < generos.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa (F/M): ");
            generos[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < alturas.length; i++) {
            if (menorAltura > alturas[i]) {
                menorAltura = alturas[i];
            } else if (maiorAltura < alturas[i]) {
                maiorAltura = alturas[i];
            }
            if (generos[i] == 'F' || generos[i] == 'f') {
                somaDasAlturasDasMulheres += alturas[i];
                numeroDeMulheres++;
            } else {
                numeroDeHomens++;

            }
        }
        mediaAlturasDasMulheres = somaDasAlturasDasMulheres / numeroDeMulheres;

        System.out.println();
        System.out.println("Menor altura: " + String.format("%.2f", menorAltura));
        System.out.println("Maior altura: " + String.format("% .2f", maiorAltura));
        System.out.println("Media das alturas das mulheres = " + String.format("%.2f", mediaAlturasDasMulheres));
        System.out.println("Numero de homens = " + numeroDeHomens);

        sc.close();
    }
}
