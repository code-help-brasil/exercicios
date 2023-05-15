/*
 Crie um programa que tenha uma função SuperSomador(), 
 que vai receber dois números como parâmetro e depois vai retornar a soma de todos os valores no intervalo entre os valores recebidos.
``` 
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
 */

package org.example;

public class Ex098 {

    public static void SuperSomador(int ini, int fim) {
        int soma = 0;
        for (int i = ini; i <= fim; i++) {
            soma += i;
            if (i == fim) {
                System.out.print(i + " :");
            } else {
                System.out.print(i + " + ");

            }
        }
        System.out.printf(" A soma total é %d", soma);

    }

    public static void main(String[] args) {
        SuperSomador(15, 19);
    }

}
