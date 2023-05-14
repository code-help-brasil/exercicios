/*
 Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em um vetor. No final, mostre: 
- Qual é a média da turma
- Quantos alunos estão acima da média da turma
- Qual foi a maior nota digitada
- Em que posições a maior nota aparece
 */

package org.example;

import java.util.Scanner;

public class Ex082 {
    public static void main(String[] args) {
        Ex082.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;
        int media;
        int alunosAcimaMedia = 0;
        int maior = 0;
        String posicoesMaiorNota = "";

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        media = soma / vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicoesMaiorNota = Integer.toString(i);
            } else if (vetor[i] == maior) {
                posicoesMaiorNota += ", " + Integer.toString(i);
            }

            if (vetor[i] > media) {
                alunosAcimaMedia++;
            }
        }

        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de alunos acima da média: " + alunosAcimaMedia);
        System.out.println("Maior nota digitada: " + maior);
        System.out.println("Posições da maior nota: " + posicoesMaiorNota);

        sc.close();
    }
}
