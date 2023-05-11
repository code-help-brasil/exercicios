/*
Faça um programa usando a estrutura “para” que leia um número inteiro 
positivo e mostre na tela uma contagem de 0 até o valor digitado: ex:
```
Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
 */

package org.example;

import java.util.Scanner;

public class Ex067 {
    public static void main(String[] args) {
        Ex067.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int numero = sc.nextInt();
        for (int i = 0; i <= numero; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("FIM!");
        sc.close();

    }

}
