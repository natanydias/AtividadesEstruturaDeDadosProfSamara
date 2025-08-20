// Criar um vetor com 4 notas e exibir em tela a média aritmética das notas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
            soma += notas[i];
        }

        double media = soma / 4;
        System.out.println("\nMédia das notas: " + media);

        input.close();
    }
}
