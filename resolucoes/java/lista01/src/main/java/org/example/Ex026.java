/*Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais */

package org.example;

import java.util.Scanner;

public class Ex026 {
    public static void main(String[] args) {
        Ex026.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro um numero: ");
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("O primeiro valor é o maior");
        } else if (n1 == n2) {
            System.out.println("Nao existe valor maior, os dois sao iguais");
        } else {
            System.out.println("O segundo valor é o menor");
        }
        sc.close();

    }

}
