/*
Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses 
valores em dois vetores, em posições relacionadas.
No final, mostre uma listagem contendo apenas os dados das pessoas menores de idade.
 */

package org.example;

import java.util.Scanner;

public class Ex084 {
    public static void main(String[] args) {
        Ex084.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[9];
        int[] idades = new int[9];

        for (int i = 0; i < nomes.length; i++) {

            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite a idade: ");
            idades[i] = sc.nextInt();
            sc.nextLine();

            System.out.println();
        }

        for (int i = 0; i < nomes.length; i++) {

            if (idades[i] < 18) {
                System.out.printf("%s tem %d anos.\n", nomes[i], idades[i]);
            }

        }
        sc.close();
    }
}
