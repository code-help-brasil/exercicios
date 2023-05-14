/*
Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 15 sorteados pelo computador.
Depois disso, peça para o usuário digitar um número (chave) e seu programa deve mostrar em que posições essa chave foi 
encontrada. Mostre também quantas vezes a chave foi sorteada.
 */

package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        Ex080.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);

        int[] vetor = new int[30];

        Random gerador = new Random();

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = gerador.nextInt(16);

        }

        System.out.print(Arrays.toString(vetor));

        System.out.print("Digite  uma numero: ");

        int numero = sc.nextInt();

        int cont = 0;
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] == numero) {

                System.out.printf("O número %d aparece na posiçao %d", numero, i);
                cont++;

            }

        }
        System.out.printf("O número %d foi sorteado %d vezes.\n", numero, cont);
        sc.close();
    }

}
