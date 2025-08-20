// Crie um programa que armazene as notas de 10 alunos recebidas pelo usuário. O programa deve retornar a maior nota em tela.

import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[10];
        double maior = 0;

        // Recebe as notas
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = input.nextDouble();

            // Verifica se é a maior nota
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }

        System.out.println("\nA maior nota é: " + maior);
        input.close();
    }
}

