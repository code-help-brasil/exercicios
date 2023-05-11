package org.example;

/*
 * [DESAFIO] Desenvolva um programa que leia o primeiro termo 
 * e a razão de uma PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA
 *  e a soma entre todos os valores da sequência.
 */

import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Ex069.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro termo da PA: ");
        int termo = sc.nextInt();
        System.out.print("Qual a razao da PA: ");
        int razao = sc.nextInt();
        int termoAnterior = termo;
        int progressao = termo;
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(termo);
            } else {
                progressao = termoAnterior + razao;
                System.out.print(progressao);
                termoAnterior = progressao;
            }
            soma += progressao;
            System.out.print(" ");
        }
        System.out.println("\nSoma dos 10 primeiros termos da PA: " + soma);
        sc.close();
    }
}
