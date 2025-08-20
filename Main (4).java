// Criar um vetor com 10 idades e exibir em tela as idades maiores que 18 anos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] idades = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            idades[i] = input.nextInt();
        }

        System.out.println("\nIdades maiores que 18:");
        for (int i = 0; i < 10; i++) {
            if (idades[i] > 18) {
                System.out.println(idades[i]);
            }
        }

        input.close();
    }
}
