/*
[DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números aleatórios (entre 0 e 99) gerados pelo computador. 
Logo em seguida, mostre os números gerados e depois coloque o vetor em ordem crescente, mostrando no final os valores ordenados.
 */

package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ex083 {
    public static void main(String[] args) {
        Ex083.main();

    }

    public static void main() {
        int[] vetor = new int[20];
        Random gerador = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100);
        }
        System.out.printf(Arrays.toString(vetor));

        Arrays.sort(vetor);

        System.out.print("Em ordem crescente: " + Arrays.toString(vetor));

    }
}
