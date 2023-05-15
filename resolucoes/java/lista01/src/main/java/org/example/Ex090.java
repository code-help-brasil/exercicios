/*
 Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses 
valores para um procedimento Somador() que vai calcular e mostrar a soma entre eles.
 */

package org.example;

import java.util.Scanner;

public class Ex090 {

    public static void somador(int x, int y) {
        System.out.print(x+ y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite um número: ");
        int num2 = sc.nextInt();

        somador(num1, num2);
        sc.close();
    }
}
