/*
 Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No final, mostre:
- Qual é a média de idade das pessoas cadastradas
- Em quais posições temos pessoas com mais de 25 anos
- Qual foi a maior idade digitada (podem haver repetições)
- Em que posições digitamos a maior idade
 */

package org.example;

import java.util.Scanner;

public class Ex081 {
    public static void main(String[] args) {
        Ex081.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];
        int soma = 0;
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a idade: ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.printf("A média das idades é %.2f%n", (float) soma / vetor.length);
        System.out.print("Pessoas com mais de 25 anos nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 25) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("A maior idade digitada foi " + maior);
        System.out.print("Maior idade nas posições: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maior) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
