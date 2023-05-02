/*Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor. ex:
```
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
``` */

package org.example;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Ex006.main();

    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        System.out.printf("O sucessor de %s é %s\n", num, num + 1);
        System.out.printf("O antecessor de %s é %s", num, num - 1);
        sc.close();

    }
}
