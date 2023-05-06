/*
 Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final:
- Qual foi a média de altura do grupo
- Quantas pessoas pesam mais de 90Kg
- Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
- Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */

package org.example;

import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Ex054.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int massaMenor50 = 0;
        int massaMaior90 = 0;
        int massaMaior100 = 0;
        float somaAltura = 0f; // O 0f é um literal que representa o valor 0 como um número de ponto flutuante,
                               // ou seja, um valor decimal com precisão simples (32 bits).

        while (i <= 7) {
            System.out.printf("\n---- %dª Pessoa ----\n", i);
            System.out.print("Qual sua massa (em kg)?: ");
            float massa = sc.nextFloat();
            System.out.print("E qual sua altura (em metros)?: ");
            float altura = sc.nextFloat();
            somaAltura += altura;
            if (massa > 90) {
                massaMaior90++;
            }
            if (massa < 50 && altura < 1.60) {
                massaMenor50++;
            }
            if (massa > 100 && altura > 1.90) {
                massaMaior100++;
            }
            i++;
        }
        sc.close();

        float mediaAltura = somaAltura / 7f;
        System.out.printf("\n%d pessoas têm massa maior que 90 kg.\n", massaMaior90);
        System.out.printf("%d pessoas têm massa menor que 50 kg e altura menor que 1,60 m.\n", massaMenor50);
        System.out.printf("%d pessoas têm massa maior que 100 kg e altura maior que 1,90 m.\n", massaMaior100);
        System.out.printf("A média de altura do grupo é %.2f m.\n", mediaAltura);

    }

}
