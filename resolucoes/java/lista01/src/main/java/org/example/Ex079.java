/*

Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
No final, mostre quais são os números pares que foram digitados e em que posições eles estão armazenados.

 */

package org.example;

import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        Ex079.main();
    }

    public static void main() {

        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] % 2 == 0) {
                System.out.printf("O número %d é par e está na posiçao %d.\n", vetor[i], i);
            }

        }

        sc.close();

    }
}
