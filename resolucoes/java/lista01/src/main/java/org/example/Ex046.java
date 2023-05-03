/*
Crie um programa que calcule e mostre na tela o resultado da soma entre um intervalo: ex
```
6 + 8 + 10 + 12 + 14 + ... + 98 + 100 
*/

package org.example;

import java.util.Scanner;

public class Ex046 {
    public static void main(String[] args) {
        Ex046.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual valor inicial da sequencia?: ");
        int inicial = sc.nextInt();

        System.out.print("Qual valor final da sequencia?: ");
        int valor_final = sc.nextInt();

        int soma = 0;

        while (inicial <= valor_final) {
            soma += inicial;
            inicial += 2;
        }
        System.out.printf("A soma desta sequencia é %d", soma);
        sc.close();
    }

}
