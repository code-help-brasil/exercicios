/*
 Escreva um programa que leia 15 números e guarde-os em um vetor. 
 No final, mostre o vetor inteiro na tela e em seguida mostre em que
posições foram digitados valores que são múltiplos de 10.
 */

package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        Ex078.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[15];
        ArrayList<Integer> posicoesDivi10 = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 10 == 0) {
                posicoesDivi10.add(i);
            }
        }

        System.out.println("O vetor completo é: " + Arrays.toString(vetor));

        System.out.print("Os valores divisíveis por 10 estao nas posiçoes: " + posicoesDivi10);
        
        sc.close();
    }
}
