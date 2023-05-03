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
        int soma = 0;
        while (i <= 6) {
            System.out.print("Digite um número: ");
            soma += sc.nextInt();
            i++;
        }


        
        System.out.printf("Soma entre os numeros foi %d", soma);
        sc.close();

    }
    
}
