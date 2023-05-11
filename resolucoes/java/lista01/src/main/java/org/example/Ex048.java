/*Faça um programa que leia 7 números inteiros e no final mostre o somatório entre eles. */

package org.example;

import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Ex048.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int soma = 0;
        while (i <= 7) {
            System.out.print("Digite um número: ");
            soma += sc.nextInt();
            i++;
        }
        System.out.printf("Soma entre os numeros foi %d", soma);
        sc.close();

    }
}
