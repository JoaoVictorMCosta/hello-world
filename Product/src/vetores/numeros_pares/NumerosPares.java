package vetores.numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int pares = 0;
        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                pares++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + pares);

        sc.close();
    }
}
