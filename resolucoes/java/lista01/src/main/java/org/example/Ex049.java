/*
Crie um programa que leia 6 números inteiros e no final mostre quantos deles são pares e quantos são ímpares.
 */

package org.example;

import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Ex049.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int numero = 0;
        int par = 0;
        int impar = 0;
        while (i <= 6) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            i++;
            if (numero % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }
        System.out.printf("Foram digitados %d numeros pares e %d impares", par, impar);
        sc.close();

    }

}
