/*
 * Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles. ex:
 * Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.
 */

package org.example;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Ex004.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int n2 = sc.nextInt();
        System.out.printf("A soma entre %s e %s é %s", n1, n2, n1 + n2);
        sc.close();

    }

}
