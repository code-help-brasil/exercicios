/*Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
BISSEXTO. */

package org.example;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        Ex021.main();

    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.printf("%s é um ano bissexto.", ano);
        } else {
            System.out.printf("%s nao é um ano bissexto.", ano);
        }

        sc.close();
    }

}
