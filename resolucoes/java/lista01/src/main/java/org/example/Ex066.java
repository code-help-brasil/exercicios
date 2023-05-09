/*
 Escreva um programa que leia um número qualquer e mostre a tabuada desse 
número, usando a estrutura “para”. ex:
```
Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...
 */

package org.example;

import java.util.Scanner;

public class Ex066 {
    public static void main(String[] args) {
        Ex066.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
        System.out.println("Acabou!");
        sc.close();

    }

}
