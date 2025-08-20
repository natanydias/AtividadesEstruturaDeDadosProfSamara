// Crie um programa com um vetor de 10 elementos inteiros. Exibir em tela os valores pares

import java.util.Scanner;

public class ValoresPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leitura dos 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = input.nextInt();
        }

        // Exibe apenas os valores pares
        System.out.println("\nNúmeros pares digitados:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        input.close();
    }
}
