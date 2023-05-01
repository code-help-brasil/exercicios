/*Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR. */

package org.example;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Ex020.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        Integer number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.printf("O número digitado (%s) é par", number);

        } else {
            System.out.printf("O número digitado (%s) é ímpar", number);
        }
        sc.close();
    }
}
