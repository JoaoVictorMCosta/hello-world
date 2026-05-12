package vetores.negativos;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] listaDeNumeros = new int[n];

        for (int i = 0; i < listaDeNumeros.length; i++) {

            System.out.print("Digite um numero: ");

            listaDeNumeros[i] = sc.nextInt();

        }

        System.out.println("Numeros Negativos: ");
        for (int i = 0; i < listaDeNumeros.length; i++) {
            if (listaDeNumeros[i] < 0) {
                System.out.println(listaDeNumeros[i]);
            }
        }

        sc.close();
    }
}
