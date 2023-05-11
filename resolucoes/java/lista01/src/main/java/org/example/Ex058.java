/*

Faça um algoritmo que leia a idade de vários alunos de uma turma. 
O programa vai parar quando for digitada a idade 999.
No final, mostre quantos alunos existem na turma e qual é a média de idade do grupo.

 */

package org.example;

import java.util.Scanner;

public class Ex058 {
    public static void main(String[] args) {
        Ex058.main();
    }
    
    public static void main() {

        Scanner sc = new Scanner(System.in);
        int somaIdade = 0;
        int alunosQuantidade = 0;
        while (true) {
            System.out.print("Quantos alunos há na turma: ");
            int idade = sc.nextInt();
            somaIdade += idade;
            alunosQuantidade++;
            if (idade == 999) {
                break;
            }
        }

        Float mediaIdade = (float) somaIdade / alunosQuantidade;

        System.out.printf("Quantidade de alunos na turma: %d\n", alunosQuantidade);
        System.out.printf("Média de idade dos alunos: %.2f\n", mediaIdade);

        sc.close();
    }
}
