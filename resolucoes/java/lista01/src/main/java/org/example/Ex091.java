/*
Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses 
valores para um procedimento Maior() que vai verificar qual deles é o maior e 
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem 
informando essa característica.
 */

package org.example;

import java.util.Scanner;

public class Ex091 {

    public static void maior(Float x, Float y) {
        if (x > y) {
            System.out.printf("%.2f é maior que %.2f", x, y);
        } else if (x < y) {
            System.out.printf("%.2f é maior que %.2f", y, x);
        } else {
            System.out.print("Os valores digitados sao equivalentes");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Float num1 = sc.nextFloat();

        System.out.print("Digite um número: ");
        Float num2 = sc.nextFloat();

        maior(num1, num2);
        sc.close();

    }

}
